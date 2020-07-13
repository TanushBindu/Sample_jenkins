Feature: Validating Place API's

Scenario: Post API
Given user enters the url
When user enter the endpoint
Then The status code should be <statuscode>
Examples:
|statuscode|
|200|