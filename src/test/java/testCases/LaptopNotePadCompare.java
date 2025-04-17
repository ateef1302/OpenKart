package testCases;


import org.testng.annotations.Test;

import pageObject.Notebook_laptop_Compare;
import testBase.BaseClass;

public class LaptopNotePadCompare extends BaseClass{

	

	
	@Test
	public void CompareProducts() throws InterruptedException
	{
		
		Notebook_laptop_Compare nl =new Notebook_laptop_Compare(driver);
		nl.selectLaptopandNotepad();
		Thread.sleep(3000);
		nl.LinkAllOptions();
		Thread.sleep(3000);
		nl.SelectMacBook();
		Thread.sleep(3000);
		nl.SelectMacAir();
		Thread.sleep(3000);
		nl.LinkCompareProduct();
		Thread.sleep(3000);
	}
}
