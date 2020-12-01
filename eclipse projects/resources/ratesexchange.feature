Feature: Rate Exchange

Scenario: Verify response for latest foreign exchange rates

Given Customer has API for foreign exchange rates
When posted with correct information
Then validate response code received
And Store the response in response object