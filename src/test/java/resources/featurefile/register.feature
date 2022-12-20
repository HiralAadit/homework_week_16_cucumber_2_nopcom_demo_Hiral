@Register@regression
  Feature: Register Test
    As user I want to register on nop commerce website

  @smoke
  Scenario:User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | Jack  | Sparrow    | jsparrow@gmail.com  | test123| test123 |
    And I click on REGISTRATION link
    And I should see message"<message>
