package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;
import com.gcr.util.Xls_Reader;

public class Test_Login_Logout_FromExcel extends StartBrowser{
	
  @Test
  public void login_logout_FromExcel() throws Exception 
  {
	  CommonFunctions cf = new CommonFunctions();
	  Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
	  String emailid=reader.getCellData("LoginData", "Email", 2);
	  String password=reader.getCellData("LoginData", "Password", 2);
	  cf.login(emailid, password);
	  System.out.println("logged in");
	  cf.logout();
	  
  }
}
