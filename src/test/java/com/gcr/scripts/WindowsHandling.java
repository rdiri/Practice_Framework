package com.gcr.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class WindowsHandling extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
  @Test
  public void windowsHandling() throws Exception {
	  driver=StartBrowser.driver;
	  CommonFunctions cf=new CommonFunctions();
	  aDriver = new ActionDriver();
	  cf.navigatetoApplciation("https://the-internet.herokuapp.com/checkboxes");
	  aDriver.click(By.xpath("//form[@id='checkboxes']/input[1]"), "Check box 1");
	  aDriver.click(By.linkText("Elemental Selenium"), "Elemental Selenium Link");
	  //switch to child window
	  aDriver.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");
	  aDriver.type(By.id("email"), "childwindow@gmail.com", "Email Text box");
	  
	  Thread.sleep(5000);
	  aDriver.closeWindow();
	  //switch to parent window
	  aDriver.switchToWindow("The Internet");
	  //uncheck the check box
	  aDriver.click(By.xpath("//form[@id='checkboxes']/input[1]"), "Check box 1");
	  Thread.sleep(5000);
  }
}
