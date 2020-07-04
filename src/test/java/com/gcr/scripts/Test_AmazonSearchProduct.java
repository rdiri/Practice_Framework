package com.gcr.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_AmazaonShoppingCartPg;
import com.gcr.objectrepository.Page_AmazonProductPage;
import com.gcr.objectrepository.Page_AmazonSearchPg;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_AmazonSearchProduct extends StartBrowser {
	public WebDriver driver;
	public ActionDriver aDriver;
	//public Page_AmazonSearchPg product;
	
  @Test
  public void searchProduct() throws Exception 
  {
	  driver=StartBrowser.driver;
	  CommonFunctions cf = new CommonFunctions();
		aDriver = new ActionDriver();
		
		cf.navigatetoApplciation("https://www.amazon.com/");
		cf.searchAmazon("mask");
		aDriver.click(Page_AmazonSearchPg.imgproductname, "Product Selected ");
		
		aDriver.click(Page_AmazonProductPage.drpQuantity, "Clicked on Quantity Dropdown");
		aDriver.click(Page_AmazonProductPage.drpQtyValue, "Selected the Product Quantity");
		String QtyValue = aDriver.getText(Page_AmazonProductPage.drpQtyValue, "Product Quantiy");
		System.out.println(QtyValue);
		
		aDriver.click(Page_AmazaonShoppingCartPg.btnAddtoCart, "Clicked on Add to cart");
		
		aDriver.click(Page_AmazonProductPage.iconCartQty, "clicked on Cart");
		String QtyInCart = aDriver.getText(Page_AmazaonShoppingCartPg.drpShoppingCartQty, "Qantity in Shopping cart");
		System.out.println(QtyInCart);
		
		
		//aDriver.selectTxtFromDropDown(Papage_AmazonProductPage.drpQty, "4", "Selected Quantity");
				// there is no select tag for dropdown
		
		
		//Add to cart
		//if(aDriver.click(Page_AmazonProductPage.btncheckout, "Clicked on Add to Cart button")) {
			
		}
		
		
		
		
  }

