package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_Home;
import com.gcr.objectrepository.Page_MyAccount;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_SearchItems extends StartBrowser{

	public WebDriver driver;
	public ActionDriver aDriver;
	public String emailid;
	public String password;

	@Test
	public void SearchItems() throws Exception {

		CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();

		cf.login();

		cf.search("Blouse");

		//Choosing products??? 
		aDriver.click(Page_Home.imgProductImage, "Clicked on product - image");
		aDriver.click(Page_Home.btnAddToCart, "Clicked on Add to Cart - button");
		aDriver.click(Page_Home.btnProceedToCheckout, "Clicked on Proceed to Checkout - Button");

		//Click on Cart
		aDriver.mouseHover(Page_Home.lnkShoppingCart, "Clicked on Shopping Cart - Link");
		aDriver.click(Page_Home.btnCheckout, "Clicked on Checkout - button");

	}

}
