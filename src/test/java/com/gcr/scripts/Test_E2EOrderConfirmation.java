package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_E2EOrderConfirmation {
	
	public WebDriver driver;
	public ActionDriver aDriver;
	
  @Test
  public void placeOrderConfirmation() throws Exception {
	  
	  CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;
		cf.login();
		
	  
  }
}
