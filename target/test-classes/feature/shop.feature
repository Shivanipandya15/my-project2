#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: website functinality

  @tag1
  Scenario: signup
    Given user must be on home page by clicking on url "https://www.demoblaze.com/"
    When user click on signup button
    And signup dilogbox should be displayed
    Then User  enter "mahimn31" and "viyan31"
    And Click on

  @tag2
  Scenario: Login dilog box
    Given user must be on homepage by clicking url "https://www.demoblaze.com/"
    And click on Login button1
    When Enter valid "mahimn31" and "viyan31"
    And click on login button
    Then User must be navigated to his or her account
  @tag3
  Scenario: 
  Given user must be on home page by clicking on url2 "https://www.demoblaze.com/"
    When user click on laptop
    And Click on any laptop name
    And click on Add to cart button
    And get pop up message
    Then user navigte to the cart
