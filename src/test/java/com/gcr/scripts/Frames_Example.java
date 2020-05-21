package com.gcr.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Frames_Example extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
  @Test
  public void frames_Example() throws Exception {
	  driver=StartBrowser.driver;
	  CommonFunctions cf=new CommonFunctions();
	  aDriver = new ActionDriver();
	  cf.navigatetoApplciation("https://jqueryui.com/autocomplete/");
	  //switch to frame
	  aDriver.switchToFrame(By.xpath("//iframe[@class='demo-frame']"), "Iframe");
	  aDriver.type(By.id("tags"), "selenium", "Tags text field");
	  Thread.sleep(5000);
	  //come out of the frame
	  aDriver.switchOutOfFrame();
	  aDriver.click(By.linkText("Draggable"), "Dragable link");
	  Thread.sleep(5000);
	 
  }
}
