@login
Feature: Users should be able to login
  @driver @VYT-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @sales_manager @VYT-123
  Scenario: Login as sales manager
    Given  the user is on the login page
    When the user enter sales manager information
    Then the user should be able to login

  @store_manager @smoke
  Scenario: Login as store manager
    Given the user is on the login page
    When the user enters store manager information
    Then the user should be able to login