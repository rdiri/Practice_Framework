package com.gcr.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Alerts_Example extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
  @Test
  public void alerts_ConfirmationBox() throws Exception {
	  driver = StartBrowser.driver;
		aDriver = new ActionDriver();
		CommonFunctions cf = new CommonFunctions();
		cf.navigatetoApplciation("https://the-internet.herokuapp.com/javascript_alerts");
		aDriver.click(By.xpath("//button[text()='Click for JS Alert']"), "JS Alert button");
		aDriver.handleAlert("JS Alert");
	  
  }
}
