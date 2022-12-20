@Computer@regression
  Feature: Computer Test
    As user I want navigate to all menu nop commerce website

  @sanity
  Scenario:User I should navigate to all menu successfully
    Given I am on homepage
    When I click on every submenu tab
    And I can see submenu on display list

