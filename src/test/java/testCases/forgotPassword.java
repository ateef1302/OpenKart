package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.forgatPassword;
import testBase.BaseClass;

public class forgotPassword extends BaseClass{

	
	@Test
	public void ForgotPasswordDetails() {
		
		
		forgatPassword fp = new forgatPassword(driver);
		fp.clickonmyAccount();
		fp.clickOnLogin();
		fp.LinkForgatPassword();
		fp.emailID("aleemateefa.nbnscoe@gmail.com");
		fp.ButnClick();
		Assert.assertEquals(fp.ConfirmText(), "An email with a confirmation link has been sent your email address.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
