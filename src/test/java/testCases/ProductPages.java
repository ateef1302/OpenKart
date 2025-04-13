package testCases;

import org.testng.annotations.Test;

import pageObject.Productdisplay;
import testBase.BaseClass;

public class ProductPages extends BaseClass {


	@Test
	public void DisplayProducts() throws InterruptedException

	{
		Productdisplay pd =new Productdisplay(driver);
		
		
		pd.searchBox();
		Thread.sleep(5000);
		pd.sendValue("imac");
		Thread.sleep(5000);
		pd.btnclicksearch();
		Thread.sleep(5000);
		pd.ClickProduct();
		Thread.sleep(5000);
		pd.BigImag();
		Thread.sleep(5000);
		pd.moveright();
		Thread.sleep(5000);
		pd.closeImg();
		
		
		
		
		
		
	}
}
