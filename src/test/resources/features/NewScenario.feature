
  Feature: New Scenarios

    @wip
    Scenario: client details

      Given user send post request to get access token
      When user send get request to assets
      Then status code should be 200
      And verify versions of asset "1271b74e-81ed-4d07-9070-5f9edee970a4"
      And user filed should not be null or empty
      And only one of revertible field should be true
      And status field should be active
      And revision number field should be different



