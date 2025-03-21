package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AfterLoginPage;
import pageObject.MyAccount;
import pageObject.loginPage;
import testBase.BaseClass;
import utilities.DataProvided;

public class DDT extends BaseClass{


@Test(dataProvider="LoginData",dataProviderClass=DataProvided.class)
public void login(String emil,String pwd,String exp)
{

	MyAccount lg=new MyAccount(driver);
	lg.clickonmyAccount();
	lg.clickOnLogin();



	loginPage pg=new loginPage(driver);
	pg.EnterEmail(p.getProperty("email"));
	pg.EnterPassword(p.getProperty("password"));
	pg.Clickloginbutton();

	AfterLoginPage al=new AfterLoginPage(driver);
boolean targetpage = al.MyAccounttxt();



if(exp.equalsIgnoreCase("Valid"))
{
	if (targetpage==true)
	{
		al.LogoutUser();
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}

}

if (exp.equalsIgnoreCase("Invalid"))
{
	if (targetpage==true) 
	{
		al.LogoutUser();
	Assert.assertTrue(false);	
	}
	else
	{
		Assert.assertTrue(true);
	}
}










}

}
