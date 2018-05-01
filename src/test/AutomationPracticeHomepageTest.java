package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import excelUtils.ApachePOIExcelWrite;
import excelUtils.ExcelUtils;
import pages.AutomationPracticeHomepage;
import pages.AutomationPracticeSignInPage;
import pages.AutomationPracticeSignUpPage;

public class AutomationPracticeHomepageTest {


WebDriver driver = null;

	
	@Before
	public void method() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") 
				+ "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        ApachePOIExcelWrite excelWrite = new ApachePOIExcelWrite();
        excelWrite.init();
        ExcelUtils excelUtils = new ExcelUtils();
        excelUtils.initialise();
	}
	
	@Test
	public void registerTest() throws InterruptedException  {
		driver.get("http://automationpractice.com");
		Thread.sleep(1000);
		
		AutomationPracticeHomepage homepage = PageFactory.initElements(driver, AutomationPracticeHomepage.class);
		homepage.clickSign();
		Thread.sleep(1000);
		
		AutomationPracticeSignInPage signIn = PageFactory.initElements(driver, AutomationPracticeSignInPage.class);
		signIn.enterEmail(ExcelUtils.getEmail());
		Thread.sleep(1000);
		
		signIn.create();
		Thread.sleep(1000);
		
		AutomationPracticeSignUpPage signUp = PageFactory.initElements(driver, AutomationPracticeSignUpPage.class);
		signUp.tickBoxTitle();
		Thread.sleep(1000);
		
		signUp.enterFirstName(ExcelUtils.getfirstName());
		Thread.sleep(1000);
		
		signUp.enterlastName(ExcelUtils.getlastName());
		Thread.sleep(1000);
		
		signUp.enterPassword(ExcelUtils.getPassword());
		Thread.sleep(1000);
		
		signUp.enterDay(ExcelUtils.getBirthDay());
		Thread.sleep(1000);
		
		signUp.enterMonth(ExcelUtils.getBirthMonth());
		Thread.sleep(1000);
		
		signUp.enterYear(ExcelUtils.getBirthYear());
		Thread.sleep(1000);
		
		signUp.newsBox();
		Thread.sleep(1000);
		
		signUp.offerBox();
		Thread.sleep(1000);
		
		signUp.enterCompany(ExcelUtils.getCompany());
		Thread.sleep(1000);
		
		signUp.enterAddress(ExcelUtils.getAddress());
		Thread.sleep(1000);
		
		signUp.enterCity(ExcelUtils.getAddress());
		Thread.sleep(1000);
		
		signUp.enterState();
		Thread.sleep(1000);
		
		signUp.selectState(ExcelUtils.getState());
		Thread.sleep(1000);
		
		signUp.enterZip(ExcelUtils.getZipCode());
		Thread.sleep(1000);
		
		signUp.enterMobile(ExcelUtils.getMobile());
		Thread.sleep(1000);
		
		signUp.enterAliasAddress(ExcelUtils.getAddressAlias());
		Thread.sleep(1000);
		
		signUp.pressRegister();
		Thread.sleep(1000);
		
	}
	
	 @After
	    public void tearDown() {
	        driver.quit();
	    }

}
