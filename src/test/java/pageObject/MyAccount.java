package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage
{
//constructor
	public MyAccount(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Locators
	
	@FindBy(xpath="//a[@title='My Account']") WebElement account;
	
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement registration;
	
	@FindBy(linkText = "Login")    WebElement logins;
	
	
	
	//Action
	
	public void clickonmyAccount()
	{
		account.click();
	}
	
	public void clickOnRegistration()
	{
		registration.click();
		
	}
	
	public void clickOnLogin()
	{
		
		logins.click();
	}
	
	
	
	
	
}
