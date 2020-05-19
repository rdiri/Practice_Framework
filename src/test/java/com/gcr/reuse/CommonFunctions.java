package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_Home;
import com.gcr.objectrepository.Page_Login;
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
		aDriver.click(Page_Home.lnkSignIn, "Sign in Link");
		aDriver.type(Page_Login.txtEmaiId, "dvrama@gmail.com", "Email Id text box");
		aDriver.type(Page_Login.txtPassword, "dvrama", "Password text box");
		aDriver.click(Page_Login.btnSignIn, "Sign in Button");
		
	}
	
	public void login(String emailid, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("At Home Login Excel"); 
		aDriver.navigateToApplication();
		aDriver.click(Page_Home.lnkSignIn, "Sign in Link");
		aDriver.type(Page_Login.txtEmaiId, emailid, "Email Id text box");
		aDriver.type(Page_Login.txtPassword, password, "Password text box");
		aDriver.click(Page_Login.btnSignIn, "Sign in Button");
		
	}
	
	
	public void logout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("At Home Log out"); 
		aDriver.click(Page_Home.lnkSignout, "Sign out link");
	}

	public void search(String productName) throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Search for Product  :" + productName); 
		aDriver.type(Page_Home.txtSearchbox, productName, "Typed on search - Text box");
		aDriver.click(Page_Home.txtSearchbox, "Searchh button");
		aDriver.click(Page_Home.btnSubmitSearch, "Clicked on Search - button");
	}
}
////a[contains(@title,'Contact')]
//*[contains(@title,'Contact')]
