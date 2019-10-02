Feature: To validate the login functionality
Scenario: Valid user and valid password
Given Launch browser
And load url
When valid user name
And valid password
And quit browser
Then quit browser

 