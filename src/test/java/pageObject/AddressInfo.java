package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressInfo extends BasePage{

	public AddressInfo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='input-firstname']") WebElement fname;
	@FindBy(xpath="//input[@id='input-lastname']")WebElement lname;
	@FindBy(xpath="//input[@id='input-company']")WebElement comp;
	@FindBy(xpath="//input[@id='input-address-1']") WebElement add1;
	@FindBy(xpath="//input[@name='address_2']") WebElement add2;
	@FindBy(xpath="//input[@id='input-city']") WebElement city;
	@FindBy(xpath="//input[@id='input-postcode']") WebElement pin;
	@FindBy (xpath=("//select[@id='input-country']")) WebElement country;
	@FindBy (xpath=("//select[@id='input-zone']")) WebElement state;

	@FindBy(xpath="//input[@value='Continue']") WebElement butn;
							
							
							
			public void firstname(String name)
			{
				fname.sendKeys(name);
			}
			
			public void lastname(String sname)
			{
				lname.sendKeys(sname);
			}
			public void Company(String Cname)
			{
				comp.sendKeys(Cname);
			}
			public void Addressline1(String Address1)
			{
				add1.sendKeys(Address1);
			}
			public void AddressLine2(String Address2)
			{
				fname.sendKeys(Address2);
			}
				
			public void selcCountry(String str)
			{
				Select sel=new Select(country);
				sel.selectByVisibleText(str);
			}
							
			public void selcState(String states)
			{
			Select sta=new Select(state);
			sta.selectByVisibleText(states);
			}
							
			public void submitButton()
			{
				butn.click();
			}			
							
			public void PinCode(String pincodes)
			{
			pin.sendKeys(pincodes);	
			}			
			
			public void CityName(String cities)
			{
				city.sendKeys(cities);
			}
							
							
	
}
