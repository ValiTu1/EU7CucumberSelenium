Feature: Contacts page


  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the users navigates to "Customers" "Contacts"
    Then default page number should be 1

  @wip
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

