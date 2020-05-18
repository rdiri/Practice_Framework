package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.HomePage;
import com.gcr.objectrepository.LoginPage;
import com.gcr.wdcmds.ActionDriver;

public class CommonFunctions {
	public WebDriver driver;
	public ActionDriver aDriver;
	
	public CommonFunctions()
	
	{
		driver = StartBrowser.driver;
		aDriver= new ActionDriver();
	}
	
	public void login() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("At Home Login"); 
		aDriver.navigateToApplication();
		aDriver.click(HomePage.lnkSignIn, "Sign in Link");
		aDriver.type(LoginPage.txtEmaiId, "dvrama@gmail.com", "Email Id text box");
		aDriver.type(LoginPage.txtPassword, "dvrama", "Password text box");
		aDriver.click(LoginPage.btnSignIn, "Sign in Button");
		
	}
	
	public void login(String emailid, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("At Home Login Excel"); 
		aDriver.navigateToApplication();
		aDriver.click(HomePage.lnkSignIn, "Sign in Link");
		aDriver.type(LoginPage.txtEmaiId, emailid, "Email Id text box");
		aDriver.type(LoginPage.txtPassword, password, "Password text box");
		aDriver.click(LoginPage.btnSignIn, "Sign in Button");
		
	}
	
	
	public void logout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("At Home Log out"); 
		aDriver.click(HomePage.lnkSignout, "Sign out link");
	}

}
////a[contains(@title,'Contact')]
//*[contains(@title,'Contact')]
