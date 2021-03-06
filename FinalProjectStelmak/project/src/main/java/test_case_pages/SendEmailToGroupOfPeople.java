package test_case_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendEmailToGroupOfPeople {

	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "(//*[text()='�������� ������'])[1]")
	private WebElement writeEmail;

	@FindBy(xpath = "(//*[@class='js-input compose__labels__input'])[2]")
	private WebElement receiverEmailField;

	@FindBy(xpath = "(//span[@class='compose-label__text'])[2]")
	private WebElement buttonCopy1;

	@FindBy(xpath = "(//*[@class='js-input compose__labels__input'])[3]")
	private WebElement copyReceiverEmailsField;

	@FindBy(xpath = "//*[@class='b-input']")
	private WebElement emailSubjectField;

	@FindBy(xpath = "(//*[@class='b-toolbar__btn__text'])[1]")
	private WebElement sendEmail;

	@FindBy(xpath = "//*[@class='message-sent__title']")
	private WebElement emailSentField;

	@FindBy(xpath = "//td[@class='mceIframeContainer mceFirst mceLast']/iframe")
	public WebElement iframe;

	@FindBy(xpath = "//*[@class='b-explorer b-explorer_contacts']")
	public WebElement alert;

	private WebDriver webdriver;
	private WebElement emailBodyField;

	public SendEmailToGroupOfPeople(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.webdriver = webdriver;
	}

	public void enterLoginAndPass(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		emailField.clear();
		emailField.sendKeys(password);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}

	public void clickWriteEmail() {
		writeEmail.click();
	}

	public void enterReceiverEmailandEmailSubjectandEmailBody(String receiverEmail, String emailSubject,
			String emailBodyText, String... receiverEmails) {

		emailSubjectField.clear();
		emailSubjectField.sendKeys(emailSubject);
		webdriver.findElement(By.xpath(
				"(.//span[text()='�����'])[2]"))
				.click();
		// buttonCopy1.click();

		copyReceiverEmailsField.clear();
		/*
		 * String emails = ""; for (int i = 0; i < receiverEmails.length; i++) { emails
		 * += receiverEmails[i] + " "; }
		 */

		// copyReceiverEmailsField.sendKeys(emails);

		Letters letters = new Letters(webdriver);
		letters.enterReceiverEmailandEmailSubjectandEmailBody(receiverEmail, emailSubject, emailBodyText);
		webdriver.switchTo().frame(iframe);

		emailBodyField = webdriver.findElement(By.xpath("//*[@id='tinymce']"));
		emailBodyField.sendKeys(emailBodyText);
		webdriver.switchTo().defaultContent();
	}

	public void clickSendEmail() {
		sendEmail.click();
	}

	public boolean emailSentFieldPresents() {
		return emailSentField.isDisplayed();
	}

}
