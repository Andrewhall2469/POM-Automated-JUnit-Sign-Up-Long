package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AutomationPracticeSignUpPage {
	public AutomationPracticeSignUpPage(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	@FindBy(xpath = "//*[@id=\"uniform-id_gender1\"]/span")
	private WebElement tickBoxTitle;

	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	private WebElement firstNameBox;
	
	@FindBy(xpath = "//*[@id=\"customer_lastname\"]")
	private WebElement lastNameBox;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement emailBox;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"days\"]")
	private WebElement dayBox;
	
	@FindBy(xpath = "//*[@id=\"months\"]")
	private WebElement monthBox;
	
	@FindBy(xpath = "//*[@id=\"years\"]")
	private WebElement yearBox;
	
	@FindBy(xpath = "//*[@id=\"newsletter\"]")
	private WebElement newsCheckbox;
	
	@FindBy(xpath = "//*[@id=\"optin\"]")
	private WebElement offerCheckbox;
	
	@FindBy(xpath = "//*[@id=\"company\"]")
	private WebElement companyBox;
	
	@FindBy(xpath = "//*[@id=\"address1\"]")
	private WebElement addressBox;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement cityBox;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement stateBox;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	private WebElement stateSelection;
	
	@FindBy(xpath = "//*[@id=\"postcode\"]")
	private WebElement zipBox;
	
	@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
	private WebElement mobileBox;
	
	@FindBy(xpath = "//*[@id=\"alias\"]")
	private WebElement addressAliasBox;
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	private WebElement registerButton;
	
	public void tickBoxTitle() {
		tickBoxTitle.click();
	}
	
	public void enterFirstName(String text)
	{
		firstNameBox.sendKeys(text);
	}
	
	public void enterlastName(String text)
	{
		lastNameBox.sendKeys(text);
	}

	public void enterPassword(String text)
	{
		password.sendKeys(text);
	}
	
	public void enterDay(String text)
	{
		dayBox.sendKeys(text);
	}
	
	public void enterMonth(String text)
	{
		monthBox.sendKeys(text);
	}
	
	public void enterYear(String text)
	{
		yearBox.sendKeys(text);
	}
	
	public void offerBox() {
		offerCheckbox.click();
	}
	
	public void newsBox() {
		newsCheckbox.click();
	}
	
	public void enterCompany(String text)
	{
		companyBox.sendKeys(text);
	}
	
	public void enterAddress(String text)
	{
		addressBox.sendKeys(text);
	}
	
	public void enterCity(String text)
	{
		cityBox.sendKeys(text);
	}
	
	public void enterState()
	{
		stateBox.click();
	}
	
	public void selectState(String text)
	{
		stateSelection.sendKeys(text);
	}
	
	public void enterZip(String text)
	{
		zipBox.sendKeys(text);
	}
	
	public void enterMobile(String text)
	{
		mobileBox.sendKeys(text);
	}
	
	public void enterAliasAddress(String text)
	{
		addressAliasBox.sendKeys(text);
	}
	
	public void pressRegister()
	{
		registerButton.click();
	}
	
	
	
	
	
}
