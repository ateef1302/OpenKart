package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdressBook extends BasePage{

	public AdressBook(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Address Book']") WebElement AddressBook;
	@FindBy(xpath="//a[normalize-space()='New Address']") WebElement adrbtn;
	




	public void clickonAddressBook()
	{
		AddressBook.click();
	}
	
	
	public void clickonAdrressbtn()
	{
		adrbtn.click();
	}
	
	
	
	
	

}
