Feature: Test waste bin cleaning

  Scenario: Test positive a waste bin cleaning
    Given I am on a page with "url"
    When  I enter login  in field with id "//*[@id = 'mailbox:login']"
    And   I enter password  in field with id  "//*[@id = 'mailbox:password']" 
    And   I click on a button "�����" with id "//*[@id='mailbox:submit']/input"
    And   I click on a button "�������" with xpath "(//*[@class='b-nav__item__text'])[5]"
    And   I click on a button "�������� �����" with xpath "(//*[text()='�������� �����'])[5]"
    And   I click on a button "��" with xpath "(//*[@class='btn__text'])[10]"
    Then  I see a message "� ������� �����" with xpath "(//*[@class='b-datalist__empty__text'])[2]"