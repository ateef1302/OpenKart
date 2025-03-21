package pageObject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{
public Properties p;



	public loginPage(WebDriver driver)
	{

		super(driver);
	}


//locators
	
	@FindBy(xpath="//input[@id='input-email']") WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginbutn;
	
	
	
	//Actions
	public void EnterEmail(String email)
	{
		emailAddress.sendKeys(email);
	}
 
	public void EnterPassword(String pwd) {
		
		Password.sendKeys(pwd);
	}

	public void Clickloginbutton()
	{
		loginbutn.click();
	}




















}