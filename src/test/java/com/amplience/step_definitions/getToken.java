package com.amplience.step_definitions;

import com.amplience.pages.Content;
import com.amplience.pages.Datum;
import com.amplience.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;


public class getToken {

    String token ;
    Response response ;
    Response responseAssets;
    String url = ConfigurationReader.get("url");
    String lastAssetId;

    @Given("user send post request to get access token")
    public void user_send_post_request_to_get_access_token() {

        //token body from the document for --> "application/x-www-form-urlencoded"
        String tokenBody = "grant_type=client_credentials&client_id=2b7779f7-d17f-4a6d-85e4-163fcce769df&client_secret=06f7c1cda8fe4963af6cea3149c310f5b88cbb2a73d48833571cb685a57a1eb6";



        // send post request for retrieving token
       response = given().accept(ContentType.JSON)
                .contentType("application/x-www-form-urlencoded")
                .body(tokenBody)
                .post(ConfigurationReader.get("urlToken"));


        // verify that post request is sent successfully
        Assert.assertEquals(200,response.statusCode());


        // take token and store it
        token = response.path("access_token");


    }

    @When("user send get request to assets")
    public void user_send_get_request_to_assets() {


        // send get request to "assets" with taken token
        responseAssets = given().accept(ContentType.JSON)
               .auth().oauth2(token)
                .get(url+"/assets" );

        // retrieve the last asset
        lastAssetId = responseAssets.path("content.data[-1].id");


    }

    @Then("status code should be {int}")
    public void status_code_should_be(int expectedStatusCode) {

        // verify that post request is sent successfully
        Assert.assertEquals(expectedStatusCode,responseAssets.statusCode());

    }

    @Then("verify versions of asset {string}")
    public void verify_versions_of_asset(String assetId) {

        //send get request with ready token to retrieve asset versions info dynamically
        responseAssets = given().accept(ContentType.JSON)
                .auth().oauth2(token)
                .pathParam("id", assetId )
                .get(url+"/assets/{id}/versions" );


        //create object from content class and store response in the class
       Content content = responseAssets.body().as(Content.class);

       //from content class --> content_1 --> data  and store all info in List of object
        List<Datum> data = content.getContent().getData();

            //iterate each revision
            for (Datum datum : data) {


                // this takes the first revision and compare it with rest of them
                Assert.assertEquals(data.get(0).getBucketID(), datum.getBucketID());


            }

    }


    //  ----- new scenario

    @Then("user filed should not be null or empty")
    public void user_filed_should_not_be_null_or_empty() {

        //create object from content class and store response in the class
        Content content = responseAssets.body().as(Content.class);

        //from content class --> content_1 --> data  and store all info in List of object
        List<Datum> data = content.getContent().getData();


        for (Datum datum : data) {

            //verify that user field is not null and not empty
            Assert.assertTrue(datum.getUser() != null &&  !(datum.getUser().isEmpty()));

        }



    }

    @Then("only one of revertible field should be true")
    public void only_one_of_revertible_field_should_be_true() {

        //create object from content class and store response in the class
        Content content = responseAssets.body().as(Content.class);

        //from content class --> content_1 --> data  and store all info in List of object
        List<Datum> data = content.getContent().getData();

        int counter = 0 ;

        for (Datum datum : data) {

            if (datum.getRevertible()) {
                counter++;
            }

        }
        Assert.assertEquals(1,counter);

    }



    @Then("status field should be active")
    public void status_field_should_be_active() {

        //create object from content class and store response in the class
        Content content = responseAssets.body().as(Content.class);

        //from content class --> content_1 --> data  and store all info in List of object
        List<Datum> data = content.getContent().getData();

        for (Datum datum : data) {

            //verify each revision' status field is active
            Assert.assertEquals(datum.getStatus(),"active");
        }


    }



    @Then("revision number field should be different")
    public void revision_number_field_should_be_different() {

        //create object from content class and store response in the class
        Content content = responseAssets.body().as(Content.class);

        //from content class --> content_1 --> data  and store all info in List of object
        List<Datum> data = content.getContent().getData();

        for (int i = 0; i < 1; i++) {

            for (int j = i + 1 ; j < 5; j++) {

                //verify each revision's revision number is different
                Assert.assertNotEquals(data.get(i).getRevisionNumber() , data.get(j).getRevisionNumber());

            }

        }


    }



}






