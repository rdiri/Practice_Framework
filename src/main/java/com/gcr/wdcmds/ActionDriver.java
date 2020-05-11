package com.gcr.wdcmds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.gcr.config.StartBrowser;
import com.gcr.util.ConfiguratorSupport;

public class ActionDriver {
	
	public WebDriver driver;
	ConfiguratorSupport cs = new ConfiguratorSupport("config.properties");
	
	public ActionDriver()
	{
		driver = StartBrowser.driver;
	}

	/**
	 * Useful for navigating to application
	 */
	public void navigateToApplication()
	{
		String url = cs.getProperty("url");
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully navigated to URL : "+url);
			
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to navigate to URL :"+url);
		}
	}
	/**
	 * Useful for clicking on buttons, rb, links and check boxes
	 * @param locator -- Get it from Object repository
	 * @param eleName -- Name of the element which you are clicking
	 * @throws Exception 
	 */
	public void click(By locator, String eleName) throws Exception
	{
		try {
			driver.findElement(locator).click();
			StartBrowser.childTest.pass("Performed click operation on : "+eleName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to perform click operation on : "+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	/**
	 * To perform type action in textbox
	 * @param locator ---Get it from Object repository
	 * @param testdata -- your test data to fill in text box
	 * @param eleName -- Name of the element
	 * @throws Exception 
	 */
	public void type(By locator, String testdata, String eleName) throws Exception
	{
		try {
			driver.findElement(locator).sendKeys(testdata);
			StartBrowser.childTest.pass("Successfully performed type action in :"+eleName + " with data :"+testdata);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to perfrom type action in :"+eleName + " with data :"+testdata,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	/**
	 * useful for mousehovering on elements
	 * @param locator -- get it from object repository
	 * @param eleName -- for reporting purpose
	 * @throws Exception
	 */
	public void mouseHover(By locator, String eleName) throws Exception
	{
		try {
			WebElement mo=driver.findElement(locator);
			Actions a = new Actions(driver);
			a.moveToElement(mo).perform();
			StartBrowser.childTest.pass("Successfully performed mouse hover on : "+eleName);	
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to perfrom mousehover :"+eleName ,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	
	public String screenShot()
	{
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
}
