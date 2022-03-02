Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the users navigates to "Customers" "Contacts"
    #Then default page number should be  1


  Scenario: Menu options
    Given the user logged is as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario Outline: login as <user>
    Given the user is on the login page
    When the use logs in using following credentials
      | username  | <user>>     |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login
    Examples:
      | user           | firstName | lastName         |
      | user10         | Ara       | Ondricka         |
      | storemanager85 | Pearl     | Tremaine Wuckert |

  @db
  Scenario:  Contacts test with email
    Given the user logged in as "sales manager"
    And the users navigates to "Customers" "Contacts"
    When the user clicks the "jakop@gmail.com" from contacts
    Then the information for "jakop@gmail.com" should be same with database

  @wip @db
  Scenario Outline: Contacts test <email>
    Given the user logged in as "sales manager"
    And the users navigates to "Customers" "Contacts"
    When the user clicks the "<email>" from contacts
    Then the information for "<email>" should be same with database

    Examples:
      | email                    |
      | jakop@gmail.com          |
      | mbrackstone9@example.com |


