# Amplience / Instructions



#### Codes and Tests Prepared by:

* Maimaitiyusufu Wulayinmu
* QA Test Automation Engineer
* uysdetlead@gmail.com



## Stack & Libraries

- Java 8+ SDK
- Rest - Assured
- cucumber Java  
- Cucumber Junit
- gson
- Maven - surefire - plugin
- Maven - cucumber - reporting 
- junit 5.7.0


------------
## Test RUN

Notice:

- To run  tests, use `CukesRunner`. You can run from the class
- To run tests --> `mvn verify -Dcucumber.options="--tags @wip" `
- To run failed tests, use `FailedTestRunner`.
- To choose URL go to *configuration.properties*


------------

## Test Reports Locations
- Extent reporting and logging: After the test finishes, a visual report is generated for all the executed test cases from the suite. This report can be found in the 'target' --> cucumber-html-reports                                  
- overview-failures.html
- overview-features.html
- overview-steps.html
- overview-tags.html
  
  (Right Click and Open in any Browser )




-----------------------------
## New Scenario Explanation

1. "user filed should not be null or empty" ,
because user filed is something like id, it should have value always
2. "only one of revertible field should be true" , 
because we can only retrieve one revision, and when we retrieve that rest of revisions should be false
3. "status field should be active" ,
because if it is not active , the information related with that asset would not be displayed 
4. "revision number field should be different" ,
because for each revision the revisionNumber is different





-----------------------------
2021 October

### End

