package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import excelUtils.ExcelUtils;

public class AutomationPracticeSignInPage {
	public AutomationPracticeSignInPage(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	

	@FindBy(xpath = "//*[@id=\"email_create\"]")
	private WebElement emailBox;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	private WebElement createButton;
	
	public void enterEmail (String text) {
		emailBox.sendKeys(text);
	}
	
	public void create() 
	{
		createButton.click();
	}
}
