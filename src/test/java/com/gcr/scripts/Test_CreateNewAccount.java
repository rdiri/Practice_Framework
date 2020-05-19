package com.gcr.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_CreatNewAccount;
import com.gcr.objectrepository.Page_Home;
import com.gcr.objectrepository.Page_Login;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_CreateNewAccount extends StartBrowser{
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
		aDriver.click(Page_Home.lnkSignIn, "Sign in Link");
		aDriver.type(Page_Login.txtNewEmailid, "vdiri04@gmail.com", "New Email id - text box");
		aDriver.click(Page_Login.btnSubmitCreate, "Email Register - button");
		
		// Create Account with personal information.
		
		
		aDriver.click(Page_CreatNewAccount.rdBtnTitle, "Title Mr or Mrs - radio Button");
		//First Name
		aDriver.type(Page_CreatNewAccount.txtCustomerFirstname, "diri04","First Name  -text box");
		//Last Name
		aDriver.type(Page_CreatNewAccount.txtCustomerLastname, "V","Last Name - text box");
		// how to get the email id from here and match with what was entered in the previous page
		
		// Password
		aDriver.type(Page_CreatNewAccount.txtPasswdidvalidate, "vdiri123", "Passowrd - text box");
		// Birth Day
		aDriver.click(Page_CreatNewAccount.drpDays, "Birth Day - DropDown");	
		// Birth month
		aDriver.click(Page_CreatNewAccount.drpDays, "Birth month- DropDown");
		// Birth Year
		aDriver.click(Page_CreatNewAccount.drpDays, "Birth year - DropDown");
		
		
		aDriver.click(Page_CreatNewAccount.chkForNewsletter, "NewsLetter - Checkbox");
		aDriver.click(Page_CreatNewAccount.chkForSpecialOffers, "Special Offers - Checkbox");
		aDriver.type(Page_CreatNewAccount.TxtAddressFirstName, "diri04", "Address first name - text box");
		aDriver.type(Page_CreatNewAccount.TxtAddressLastName, "V", "Address Last name - text bxk");
		aDriver.type(Page_CreatNewAccount.TxtAddress1, "2345 Kaneff", "Address Last name - text box");
		aDriver.type(Page_CreatNewAccount.TxtCity1, "Denwar", "City - text box");
		
		aDriver.selectTxtFromDropDown(Page_CreatNewAccount.drpState, "Texas", "State - Drop down");
		aDriver.selectIndexFromDropDown(Page_CreatNewAccount.drpCountry, 21, " Country - Drop down");
		aDriver.type(Page_CreatNewAccount.txtMobilePhone, "320-456-9878", "Mobile phone - text box");
		aDriver.type(Page_CreatNewAccount.txtAddressAlias, "diri", "Alias - text box");
		aDriver.click(Page_CreatNewAccount.btnRegister, "Register user - button");
		
	   
	  
	  
  }
}
