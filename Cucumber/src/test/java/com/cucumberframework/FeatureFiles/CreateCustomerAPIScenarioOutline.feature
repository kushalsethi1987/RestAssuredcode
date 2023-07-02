Feature: Validate Create User API
  This feature file have scenarios related to the create customer API

@Regression
Scenario Outline: Validate create customer api with valid username and email
Given I set the auth for the Create Customer API
When I pass "<email>" as the email
And I pass the sample description "<description>"
And I send the post request to the "<endpoint>"
Then I should be able to create the customer
And the email id in the response should be "<expectedEmail>"
And the details in the description should be "<description>"
And the status code should be "<statusCode>"

Examples:
|email                                 |description            | endpoint |expectedEmail                       |statusCode|endpoint  |
|testingbluestacksformyself@gmail.com  |this is a test customer|/customers|testingbluestacksformyself@gmail.com|200       |/customers|