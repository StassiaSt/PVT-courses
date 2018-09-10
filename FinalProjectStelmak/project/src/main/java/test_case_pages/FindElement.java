package test_case_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindElement {
	@FindBy(xpath = "//h3[text()='ICQ']")
    private WebElement elementICQ;

    @FindBy(xpath = "//h3[text()='��� ���']")
    private WebElement elementMojMir;

    @FindBy(xpath = "//h3[text()='�������������']")
    private WebElement elementOdnoklassniki;

    @FindBy(xpath = "//h3[text()='����� Mail.Ru']")
    private WebElement elementAgentMailRu;
    
    @FindBy(xpath = "(//h3[@class='projects-item__title i-link-deco'])[5]")
    private WebElement elementGoroscop;

    @FindBy(xpath = "//h3[text()='��-���������']")
    private WebElement elementTVProgramma;
    
    @FindBy(xpath = "//h3[text()='������']")
    private WebElement elementTovari;
    
     public FindElement(WebDriver webdriver)
    {
    	PageFactory.initElements(webdriver, this);
    }
    
    public boolean elementICQPresents()
    {
        return elementICQ.isDisplayed();
    }
    public boolean elementMojMirPresents()
    {
        return elementMojMir.isDisplayed();
    }
    public boolean elementOdnoklassnikiPresents()
    {
        return elementOdnoklassniki.isDisplayed();
    }
    public boolean elementAgentMailRuPresents()
    {
        return elementAgentMailRu.isDisplayed();
    }
    public boolean elementGoroscopPresents()
    {
        return elementGoroscop.isDisplayed();
    }
    public boolean elementTVProgrammaPresents()
    {
        return elementTVProgramma.isDisplayed();
    }
    public boolean elementTovariPresents()
    {
        return elementTovari.isDisplayed();
    }
}



