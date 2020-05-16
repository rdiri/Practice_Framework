package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.AccountPage;
import com.gcr.objectrepository.OrderHistoryPage;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class MyOrderHistoryTest extends StartBrowser{
	
	public WebDriver driver;
	public ActionDriver aDriver;
		
		@Test
		public void orderHistoryMethod() throws Exception
		
		{
			CommonFunctions cf = new CommonFunctions();
			driver = StartBrowser.driver;
			cf.login();
			aDriver = new ActionDriver();
			aDriver.click(AccountPage.btnOrderHistory, "My Credit History button");
			aDriver.verifyText(OrderHistoryPage.msgOrderHistory, "You have not placed any orders.");
			
		}
	 
  }

