@navigate
Feature: Users should be able to navigate using top menu

  @smoke
  Scenario:Navigate to Fleet- Vehicles
    Given the user is on the login page
    And the user enter sales manager information
    When the user clicks on the Fleet, Module
    Then the title should be Vehicles

  @db
  Scenario:Navigate to Marketing, Campaigns
    Given the user is on the login page
    And the user enter sales manager information
    When the user clicks on the Marketing, Campaigns
    Then the title should be Campaigns

  Scenario:Navigate to Activities, Calendar Events
    Given the user is on the login page
    And the user enter sales manager information
    When the user clicks on the Activities, Calendar Events
    Then the title should be Calendars



