package com.gcr.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_AddToShoppingCart extends StartBrowser{
	
	public WebDriver driver;
	public ActionDriver aDriver;
  @Test
  public void addToCart() throws Exception {
	  CommonFunctions cf = new CommonFunctions();
	  driver = StartBrowser.driver;
		cf.login();		
		aDriver = new ActionDriver();
	  
	  
	  
  }
}
