@amazon
  Feature: Navigate to amazon
    Scenario Outline: amazon
      Given open the given "<Browser>"
      Then navigate to given url "<Url>"
      And close the browser
      Examples:
        | Browser | Url |
        | Chrome  | https://www.amazon.com |
       # | chrome      | https://www.flipkart.com |