Feature: Onboarding

  Scenario: As a customer, I want to start my app
    Given I launch my app
    And I click on start button 
    When I swipe all the onboarding views
    And I allow the notifications
    And I click on validate button
    And I check text from popup
    And I click on skip link 
    Then I am on the homepage