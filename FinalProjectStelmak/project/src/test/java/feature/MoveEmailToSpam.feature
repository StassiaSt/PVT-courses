Feature: Test move email to spam

Scenario: Test positive move email to spam
    Given I am on a page with "url"
    When  I enter login "vasus" 
    And   I enter password "82vfhfljyf30" 
    And   I click on a button '�����' 
    And   I mark a check box 
    And   I click on a button '����' 
    Then  I see a message '������ ���������� � ����' 