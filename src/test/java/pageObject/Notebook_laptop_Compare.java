package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Notebook_laptop_Compare extends BasePage{

	public Notebook_laptop_Compare(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']") WebElement linklano;
	@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']")WebElement linkAllopt;
	@FindBy(xpath="//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]") WebElement optmac;
	@FindBy(xpath="//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]") WebElement optair;
	@FindBy(xpath="//a[@id='compare-total']") WebElement comp;
	
	
	public void selectLaptopandNotepad()
	{
		linklano.click();
	}
	
	
	
	public void LinkAllOptions()
	{
		linkAllopt.click();
	}
	
	public void SelectMacBook()
	{
		Actions action=new Actions(driver);
		action.moveToElement(optmac).click().build().perform();
	}
	
	public void SelectMacAir()
	{
		Actions act=new Actions(driver);
		act.moveToElement(optair).click().build().perform();
	}
	
	public void LinkCompareProduct()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(comp).click().build().perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
