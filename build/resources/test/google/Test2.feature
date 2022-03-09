@google

Feature: Navigate to google
  Scenario Outline: google
    Given open the given "<Browser>"
    Then navigate to given url "<Url>"
    And close the browser
    Examples:
      | Browser | Url |
      | chrome  | https://www.google.com |