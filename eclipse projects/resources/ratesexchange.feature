Feature: Rate Exchange

Scenario: Verify response for latest foreign exchange rates

Given Customer has API for foreign exchange rates
When posted with correct information
Then validate response code received
And Store the response in response object

Scenario: Verify response for an incorrect request url

Given Customer has API for foreign exchange rates
When posted with incorrect information
Then Customer has to obtain "Bad Requset" as the response
And Status code should be 400


Scenario: Verify Response when the server is unavailable

Given Customer has API for foreign exchange rates
When posted with incorrect information
Then Response status code received should be 500

