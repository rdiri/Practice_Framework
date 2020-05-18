package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.CreatNewAccount_Page;
import com.gcr.objectrepository.HomePage;
import com.gcr.objectrepository.LoginPage;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class CreateNewAccount extends StartBrowser{
	public WebDriver driver;
	public ActionDriver aDriver;
	
	
  @Test
  public void createAccountMethod() throws Exception 
  {
		CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;  // this will start all extent reports on browser start.
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Create New Account"); 
		//cf.login();
		aDriver = new ActionDriver();
		
		aDriver.navigateToApplication();
		aDriver.click(HomePage.lnkSignIn, "Sign in Link");
		aDriver.type(LoginPage.txtNewEmailid, "vdiri04@gmail.com", "New Email id - text box");
		aDriver.click(LoginPage.btnSubmitCreate, "Email Register - button");
		
		// Create Account with personal information.
		
		
		aDriver.click(CreatNewAccount_Page.rdBtnTitle, "Title Mr or Mrs - radio Button");
		//First Name
		aDriver.type(CreatNewAccount_Page.txtCustomerFirstname, "diri04","First Name  -text box");
		//Last Name
		aDriver.type(CreatNewAccount_Page.txtCustomerLastname, "V","Last Name - text box");
		// how to get the email id from here and match with what was entered in the previous page
		
		// Password
		aDriver.type(CreatNewAccount_Page.txtPasswdidvalidate, "vdiri123", "Passowrd - text box");
		// Birth Day
		aDriver.click(CreatNewAccount_Page.drpDays, "Birth Day - DropDown");	
		// Birth month
		aDriver.click(CreatNewAccount_Page.drpDays, "Birth month- DropDown");
		// Birth Year
		aDriver.click(CreatNewAccount_Page.drpDays, "Birth year - DropDown");
		
		
		aDriver.click(CreatNewAccount_Page.chkForNewsletter, "NewsLetter - Checkbox");
		aDriver.click(CreatNewAccount_Page.chkForSpecialOffers, "Special Offers - Checkbox");
		aDriver.type(CreatNewAccount_Page.TxtAddressFirstName, "diri04", "Address first name - text box");
		aDriver.type(CreatNewAccount_Page.TxtAddressLastName, "V", "Address Last name - text bxk");
		aDriver.type(CreatNewAccount_Page.TxtAddress1, "2345 Kaneff", "Address Last name - text box");
		aDriver.type(CreatNewAccount_Page.TxtCity1, "Denwar", "City - text box");
		
		aDriver.selectTxtFromDropDown(CreatNewAccount_Page.drpState, "Texas", "State - Drop down");
		aDriver.selectIndexFromDropDown(CreatNewAccount_Page.drpCountry, 21, " Country - Drop down");
		aDriver.type(CreatNewAccount_Page.txtMobilePhone, "320-456-9878", "Mobile phone - text box");
		aDriver.type(CreatNewAccount_Page.txtAddressAlias, "diri", "Alias - text box");
		aDriver.click(CreatNewAccount_Page.btnRegister, "Register user - button");
		
	   
	  
	  
  }
}
