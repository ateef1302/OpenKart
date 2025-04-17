package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CompareProduct_imac;
import testBase.BaseClass;

public class ImacProductCompare extends BaseClass{
	
	
	
	@Test
	public void ProductCompare() throws InterruptedException
	{
		
		CompareProduct_imac comp = new CompareProduct_imac(driver);
		Thread.sleep(3000);
		comp.searchbar("imac");
		Thread.sleep(3000);
		comp.searchbtn();
		Thread.sleep(3000);
		comp.prdCompare();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
