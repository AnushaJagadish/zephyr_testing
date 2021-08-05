Feature: Validate login positive functionality

  #TC 001 - Validate that the'Phone number' field is prefixed with '+1' country code*/
  Scenario: Validate that the 'Phone number' field is prefixed with +1 country code
    Given launch the URL
    When clicks on 'Login' button
    Then check  the  'Phone number' field is prefixed with country code

