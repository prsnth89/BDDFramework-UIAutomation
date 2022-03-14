@google

Feature: Navigate to google

  Scenario Outline: google
    Given navigate to given url of google
    And validate the google page got loaded successfully by validating text "<VerifyText>"

    Examples:
      | VerifyText |
      | google   |