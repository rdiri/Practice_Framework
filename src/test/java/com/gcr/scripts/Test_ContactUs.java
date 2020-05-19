package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_ContactUs;
import com.gcr.objectrepository.Page_Home;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_ContactUs extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
  @Test
  public void contactUsMethod() throws Exception
  {
	  CommonFunctions cf = new CommonFunctions();
	  cf.login();
	  aDriver = new ActionDriver(); 
	  aDriver.click(Page_ContactUs.lnkContactus,"Contact us Button");
	
	
	  
	  
		
  }
}
