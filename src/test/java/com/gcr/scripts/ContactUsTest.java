package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.ContactUsPage;
import com.gcr.objectrepository.HomePage;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class ContactUsTest extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
  @Test
  public void contactUsMethod() throws Exception
  {
	  CommonFunctions cf = new CommonFunctions();
	  cf.login();
	  aDriver = new ActionDriver(); 
	
	  
	  //aDriver.driver.getCurrentUrl();
	 
	//did not execute here-------------------
	  
	  aDriver.click(ContactUsPage.lnkContactus,"Contact us Button");
	
	
	  
	  
		
  }
}
