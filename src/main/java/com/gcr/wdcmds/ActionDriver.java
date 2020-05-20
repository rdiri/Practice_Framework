package com.gcr.wdcmds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.gcr.config.StartBrowser;
import com.gcr.util.ConfiguratorSupport;

public class ActionDriver {
	
	public WebDriver driver;
	ConfiguratorSupport cs = new ConfiguratorSupport("config.properties");
	
	public ActionDriver()
	{
		driver = StartBrowser.driver;   
		// will give control to driver in start Browser class that has methods to execute before test, before class , after class and before method.
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
	 * Useful for navigating to application
	 */
	public void navigateToApplication(String url)
	{
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
	/**
	 * to verify the given text is present in a location or not
	 * @param locator -- Text location
	 * @param expMsg -- MEssage we are expecting
	 * @throws Exception
	 */
	public void verifyText(By locator, String expMsg) throws Exception
	{
		String actMsg=driver.findElement(locator).getText();
		if(actMsg.equals(expMsg))
		{
			StartBrowser.childTest.pass("Expected text is available : "+ expMsg);	
		}
		else
		{
			StartBrowser.childTest.fail("Actual msg is : "+actMsg + " and Expected message is : "+expMsg,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			throw new Exception();
		}
		
		
		
	}
	
	/**
	 * To select the value from dropdown
	 * @param locator - dropdown locator
	 * @param visibleText - visible text to be selected from dropdown
	 * @param eleName - dropdown name
	 * @throws IOException
	 */
	public void selectTxtFromDropDown(By locator, String visibleText, String eleName) throws IOException
	{ 
		try
		{
		WebElement dd=driver.findElement(locator);
		Select s = new Select(dd);
		s.selectByVisibleText(visibleText);
		StartBrowser.childTest.pass("Successfully selected " + visibleText + "from: " +eleName);	
		}
		catch(Exception e)
		{
			StartBrowser.childTest.fail("Unable to select " + visibleText + "from: " +eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
		
	}
	
	/**
	 * 
	 * @param locator - Dropdown WebElement been located.
	 * @param i - Provide Value attribute of the dropdown element being inspected.
	 * @param eleName - Provide name of the dropdown being use for the program.
	 * @throws IOException
	 */
	
	public void selectValueFromDropDown(By locator, String i, String eleName) throws IOException
	{
		try
		{
			WebElement dd=driver.findElement(locator);
			Select s = new Select(dd);
			s.selectByValue(i);
			StartBrowser.childTest.pass("Successfully selected " + i + "from: " +eleName);
		}
		catch(Exception e)
		{
			StartBrowser.childTest.fail("Unable to select " + i + "from: " +eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
				
	}
	
	public void selectIndexFromDropDown(By locator, int Index, String eleName) throws IOException
	{
		try
		{
			WebElement dd=driver.findElement(locator);
			Select s = new Select(dd);
			s.selectByIndex(Index);
			StartBrowser.childTest.pass("Successfully selected " + Index + "from: " +eleName);
		}
		catch(Exception e)
		{
			StartBrowser.childTest.fail("Unable to select " + Index + "from: " +eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}

	public void handleAlert(String eleName) throws IOException
	{
		try {
			String amsg=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
//			driver.switchTo().alert().dismiss(); //this is to click on cancel button in confirmation
			StartBrowser.childTest.pass("Successfully handled alert : "+eleName + " Alert message is : "+amsg);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable handle alert "+eleName,
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
