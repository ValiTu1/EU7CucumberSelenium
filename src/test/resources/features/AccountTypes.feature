Feature: Account types

  @wip @smoke
  Scenario: Driver user
    Given the user logged in as "driver"
    When the users navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  @wip
  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the users navigates to "Customers" "Accounts"
    Then the title contains "Accounts - Customers"

  @wip @smoke
  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the users navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"


  Scenario Outline: different user types <userType>
    Given the user logged in as "<userType>"
    When the users navigates to "tabName" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |


  Scenario Outline: Login with different accounts <userType>
    Given the user logged in as "<userType>"
    When the users navigates to "<tab>" "<module>"
    Then the title contains "<title>"
    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |
