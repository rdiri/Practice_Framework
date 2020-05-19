package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_MyAccount;
import com.gcr.objectrepository.Page_OrderHistory;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_MyOrderHistory extends StartBrowser{
	
	public WebDriver driver;
	public ActionDriver aDriver;
		
		@Test
		public void orderHistoryMethod() throws Exception
		
		{
			CommonFunctions cf = new CommonFunctions();
			driver = StartBrowser.driver;
			cf.login();
			aDriver = new ActionDriver();
			aDriver.click(Page_MyAccount.btnOrderHistory, "My Credit History button");
			aDriver.verifyText(Page_OrderHistory.msgOrderHistory, "You have not placed any orders.");
			
		}
	 
  }

