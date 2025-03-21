package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddressInfo;
import pageObject.AdressBook;
import pageObject.AfterLoginPage;
import pageObject.MyAccount;
import pageObject.loginPage;
import testBase.BaseClass;

public class LoginTestCase extends BaseClass{


      
	@Test (groups= {"Sanity","Master"},priority=1)
	public void verifyLogin() throws InterruptedException
	{



		MyAccount lg=new MyAccount(driver);
		lg.clickonmyAccount();
		lg.clickOnLogin();



		loginPage pg=new loginPage(driver);
		pg.EnterEmail(p.getProperty("email"));
		pg.EnterPassword(p.getProperty("password"));
		pg.Clickloginbutton();


		AfterLoginPage al=new AfterLoginPage(driver);

		boolean h1 = al.MyAccounttxt();
		Assert.assertEquals(h1,true);


		boolean h2 = al.MyOrderstxt();
		Assert.assertEquals(h2, true);

		boolean h3 = al.MyAffiliateAccount();
		Assert.assertEquals(h3, true);

		boolean h4 = al.Newsletter();
		Assert.assertEquals(h4, true);





	}




	@Test(groups= {"Sanity","Master"},priority=2)
	public void AddressDetails() throws InterruptedException
	{
		AdressBook add=new AdressBook(driver);
		add.clickonAddressBook();

		add.clickonAdrressbtn();



		AddressInfo Add=new AddressInfo(driver);

		Add.firstname(p.getProperty("FirstName"));
		Thread.sleep(1000);
		Add.lastname(p.getProperty("LastName"));
		Thread.sleep(1000);
		Add.Company(p.getProperty("Company"));
		Thread.sleep(1000);
		Add.Addressline1(p.getProperty("Address1"));
		Thread.sleep(1000);
	

		Add.CityName(p.getProperty("City"));
		Thread.sleep(1000);
		Add.PinCode(p.getProperty("PostCode"));
		Thread.sleep(1000);
		

		Add.selcCountry(p.getProperty("Country"));

		Thread.sleep(1000);
		Add.selcState(p.getProperty("State"));
		Thread.sleep(1000);
		Add.submitButton();

	}


}
