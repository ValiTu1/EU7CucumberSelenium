
Feature: Login as different users


  Scenario: login as a driver
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    #And the title contains "Dashboard"

  Scenario: login as a driver2
    Given the user logged in as "sales manager"
    Then the user should be able to login
    And the title contains "Dashboard"
    #driver, storemanager, salesmanager
    #you will have one step definition and will handle different usertypes
