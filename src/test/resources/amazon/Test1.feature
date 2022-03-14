@amazon
  Feature: Navigate to amazon
    Scenario Outline: amazon
      Given navigate to given url of amazon
      And validate the amazon page got loaded successfully by validating text "<VerifyText>"

      Examples:
        | VerifyText |
        | amazon     |
        | test       |
        | amazon     |