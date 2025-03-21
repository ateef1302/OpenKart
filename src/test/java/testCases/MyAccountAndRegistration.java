	package testCases;

	import org.testng.annotations.Test;

import pageObject.MyAccount;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class MyAccountAndRegistration extends BaseClass{

	
		
		

	
		@Test(groups= {"Regression","Master"})
		public void homeAndRegistration()
		{
			logger.info("***Logs Started***");
			MyAccount ma=new MyAccount(driver);
			ma.clickonmyAccount();
			logger.info("***Click the Account***");
			ma.clickOnRegistration();
			
			
			RegistrationPage rp=new RegistrationPage(driver);
			logger.info("***First Name***");
			rp.firstName(randomString().toUpperCase());
			rp.lastName(randomString().toUpperCase());
			rp.emailId((randomString()+"@gmail.com"));
			rp.telephone(randomNumber());
			
			String passwords = Alphanumeric();
			logger.info("***Confirm Password ***");
			rp.password(passwords);
			rp.confirmPassword(passwords);
		
			rp.termCondition();
			rp.submit();
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
}
		
		
		
		
		
		



