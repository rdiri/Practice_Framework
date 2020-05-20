package com.gcr.scripts;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_Home;
import com.gcr.objectrepository.Page_OrderConfirmation;
import com.gcr.objectrepository.Page_OrderSummary;
import com.gcr.objectrepository.Page_PaymentMethod;
import com.gcr.objectrepository.Page_Shipping;
import com.gcr.objectrepository.Page_ShoppingCartSummary;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_AddToShoppingCart extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
	@Test
	public void addToShoppingCart () throws Exception {
		CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
		
		cf.login();
		cf.search("Blouse");

		//Choosing products??? 
		aDriver.click(Page_Home.imgProductImage, "Clicked on product - image");
			
		//Click on ADD TO CART
		aDriver.click(Page_Home.btnAddToCart, "Clicked on Add to Cart - button");
		aDriver.click(Page_Home.btnProceedToCheckout, "Clicked on Proceed to Checkout - Button");

		//Click on Cart
		aDriver.mouseHover(Page_Home.lnkShoppingCart, "Clicked on Shopping Cart - Link");
		aDriver.click(Page_Home.btnCheckout, "Clicked on Checkout - button");
		
		//Shopping-Cart Summary 
		aDriver.click(Page_ShoppingCartSummary.BtnProceedToCheckOut, "Clicked on Proceed to Checkout - Button");
		
		//Shipping Page
		aDriver.click(Page_Shipping.chkForTerms, "Selected Terms of Use - Checkbox");
		aDriver.click(Page_Shipping.BtnProceedToCheckOut, "Clicked on Proceed to Checkout - Button");
		
		//Payment Method Page
		aDriver.click(Page_PaymentMethod.LnkPaybyCheck,"Clicked on Pay by Check - Link");
		
		//Order Summary Page
		aDriver.click(Page_OrderSummary.BtnOrderConfirmation, "Clicked on Order Confirmation - Button");
		
		//Order Confirmation Page
		aDriver.click(Page_OrderConfirmation.msgOrderConfirmation, "Displayed Your order on my Store complete - Message");
		
		
		
		
				
	}
}
