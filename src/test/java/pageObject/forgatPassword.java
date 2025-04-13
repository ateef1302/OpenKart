package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class forgatPassword extends MyAccount{

	public forgatPassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	

@FindBy (xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']") WebElement lnkfograt;

@FindBy (xpath="//input[@id='input-email']") WebElement remail;
@FindBy (xpath="//input[@value='Continue']") WebElement butnfp;

@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']") WebElement conftext;
	
	
	
public void LinkForgatPassword()
{
	lnkfograt.click();
}
	

public void emailID(String str)
{
	remail.sendKeys(str);
}
	

public void ButnClick()
{
	butnfp.click();
}
	

public String ConfirmText()
{

	try {
	return (conftext.getText());
	}
	catch (Exception e)
	{
		return (e.getMessage());
	}


}
	
	
	
	
}
