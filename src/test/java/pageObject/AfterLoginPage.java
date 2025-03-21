package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginPage extends BasePage{

	
	
	
	public AfterLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement MyAccount;
	
	@FindBy(xpath="//h2[normalize-space()='My Orders']") WebElement MyOrders;
	
	@FindBy(xpath="//h2[normalize-space()='My Affiliate Account']") WebElement MyAffiliateAccount;
	
	@FindBy(xpath="//h2[normalize-space()='Newsletter']") WebElement Newsletter;



	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")  WebElement logout;
	public boolean  MyAccounttxt()
	{
		
		try
		{
			return	(MyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean  MyAffiliateAccount()
	{
		
		try
		{
			return	(MyAffiliateAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	public boolean  MyOrderstxt()
	{
		
		try
		{
			return	(MyOrders.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	public boolean  Newsletter()
	{
		
		try
		{
			return	(Newsletter.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public void LogoutUser()
	{
		logout.click();
	}
	
	
	
	
	
	
}
