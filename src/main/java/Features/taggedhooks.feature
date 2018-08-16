Feature: Login functionalty of CRM


@First
Scenario: Free CRM Login Test Scenario

Given user is on Loginpage
Then  user logs into homepage

@Second
Scenario: Free CRM Created Child Test Scenario
Given  user is on homepage
Then User creates a child

@Third
Scenario: Free CRM Created Child Test Scenario
Given  Child is created by User
Then User creates an A&T application