package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CompareProduct_imac extends BasePage{

	public CompareProduct_imac(WebDriver driver) {
		super(driver);
		
	}
	

@FindBy(xpath="//input[@placeholder='Search']") WebElement linksrch;
@FindBy(xpath="//i[@class='fa fa-search']") WebElement btnsrch;
@FindBy(xpath="//i[@class='fa fa-exchange']") WebElement linkcomp;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement confirmmsg;
	
	


	

	
	public void searchbar(String str)
	{
		linksrch.sendKeys(str);
	}
	
	public void searchbtn()
	{
		btnsrch.click();
	}
	
	public void prdCompare()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(linkcomp).click().perform();
	}
	
	public String msgconfirmation()
	{
		try {
		return(confirmmsg.getText());
	}
		catch (Exception e){
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
