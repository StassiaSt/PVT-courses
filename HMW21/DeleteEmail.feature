Feature: Test delete email

Scenario: Test positive delete email
    Given I am on main application page with
    When  I login as correct user
    And   I mark letter I want to delete
    And   I press  button "�������"
    Then  I see message with text "������� 1 ������"
    
    