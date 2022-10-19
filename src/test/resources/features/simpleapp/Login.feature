@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do scroll

#  @negative
#  Scenario: Verify user failed to login when input invalid email and password
#    Given user is on login page
#    When user input username "invalid"
#    When user input password "invalid"
#    When user click button login

  @calculator
  Scenario: Verify user successsfully for multiple with two numbers
    Given user already login
    When user input angka1 field 10
    And user click dropdown button
    And user click multiple button
    And user input angka2 field 10
    And user click equal button
    Then the total result should be 100
