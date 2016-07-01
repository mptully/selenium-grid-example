Feature: Home Page

    As an end user
    I want a home page
    So that I can find out more about QAWorks exciting services

  Scenario: Navigation tabs
    Given I am on the QAWorks Home Page
    Then I should be able to see the following tabs
      | Home       |
      | Services   |
      | Works      |
      | Technology |
      | Prices     |
      | News       |
      | About      |
      | Careers    |
      | Contact    |

