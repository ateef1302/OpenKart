package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productdisplay extends BasePage{

	public Productdisplay(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Search']")WebElement linksrch;
	@FindBy(xpath="//input[@placeholder='Search']") WebElement iptxt;
	@FindBy(xpath="//i[@class='fa fa-search']")WebElement butnsrch;
	@FindBy(xpath="//img[@title='iMac']")WebElement linkimg;
	@FindBy(xpath="//li[1]//a[1]//img[1]")WebElement bigimg;
	@FindBy(xpath="//button[@title='Next =Right arrow key)']") WebElement mvright;

	@FindBy(xpath="//button[normalize-space=)='×']") WebElement clz;
	
	
	

	
	
	
	
	public void searchBox()
	{
		linksrch.click();
	}
	
	public void sendValue(String str)
	{
		iptxt.sendKeys(str);
	}
	public void btnclicksearch()
	{
		butnsrch.click();
	}
	
	public void ClickProduct()
	{
		linkimg.click();
	}
	
	public void BigImag()
	{
		bigimg.click();
	}
	
	public void moveright()
	{
		mvright.click();
	}
	
	public void closeImg()
	{
		clz.click();
	}
	
	
}
