Feature: Test move email from spam

Scenario: Test positive move email from spam
    Given I am on a page with "url"
    When  I enter login "vasus82" 
    And   I enter password "82vfhfljyf30" 
    And   I click on a button "�����" 
    And   I click on a button "����" 
    And   I mark a check box with xpath 
    And   I click on a button "�����������" 
    And   I click on a button "��������" 
    Then  I see a message "������ ���������� � ����� '��������'" 