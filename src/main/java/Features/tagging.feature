Feature: Citizen portal features



@SmokeTest @RegressionTest
Scenario: Login into Citizen Portal
Given When user is on Home Page
Then User Logs into Citizen Portal

@SmokeTest @RegressionTest
Scenario: Create a Child
Given When user is on Home Page
Then User creates a child

@RegressionTest
Scenario: Create a FSM application
Given When user is on homepage
Then User creates a FSM application

@RegressionTest
Scenario: Create a Transport application
Given When user is on homepage
Then User creates a Transport application

@RegressionTest
Scenario: Create a A&T application
Given When user is on homepage
Then User creates a A&T application

@RegressionTest
Scenario: Create a SEND application
Given When user is on homepage
Then User creates a SEND application

@SmokeTest
Scenario: Change password
Given When user is on homepage
Then User changes password of citizen portal

 
