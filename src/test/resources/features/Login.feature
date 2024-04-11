@LoginFeature
Feature: user login

  @ValidLogin
  Scenario: verify user login with valid credentials
    Given launch the url
    Then verify the homepage is loaded
    When enter username as "Admin" and password as "admin123" and click on login
    Then verify the dashboard title
    When close all the browsers

  @InvalidLogin
  Scenario: verify user login with invalid credentials
    Given launch the url
    Then verify the homepage is loaded
    When enter username as "rajesh" and password as "rajesh123" and click on login
    Then verify the login error message
    When close all the browsers
