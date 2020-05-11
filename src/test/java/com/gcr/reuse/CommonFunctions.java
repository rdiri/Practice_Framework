package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.AtHomeHomePage;
import com.gcr.objectrepository.AtHomeLoginPage;
import com.gcr.objectrepository.LoginPage;
import com.gcr.wdcmds.ActionDriver;

public class CommonFunctions {
	
	public WebDriver driver;
	public ActionDriver aDriver;
	
	public CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	
	public void login() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login");
		aDriver.navigateToApplication();
		aDriver.type(LoginPage.txtUserName, "anil", "username tex box");
		aDriver.type(LoginPage.txtPassword, "anil", "Password text box");
		aDriver.click(LoginPage.btnSignin, "Sign in button");
		
	}
	
	public void atHomeLogin() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("AtHome Login");
		aDriver.navigateToApplication();
		aDriver.type(AtHomeLoginPage.txtuserName, "nagatraining@gmail.com", "Usernmae text field");
		aDriver.type(AtHomeLoginPage.txtPassword, "Sample@1234", "Password text field");
		aDriver.click(AtHomeLoginPage.btnSignIn, "Sign In button");
		
	}
	
	public void atHomeLogout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("AtHome Logout");
		aDriver.mouseHover(AtHomeHomePage.menuAccount, "Menu Account");
		aDriver.click(AtHomeHomePage.lnkLogout, "Logout link");
		
	}
}
