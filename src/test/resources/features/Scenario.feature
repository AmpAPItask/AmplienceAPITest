
  Feature: Task

    @wip
    Scenario:  verify  asset's bucket ID should same for all versions
      Given user send post request to get access token
      When user send get request to assets
      Then status code should be 200
      And verify versions of asset "1271b74e-81ed-4d07-9070-5f9edee970a4"



