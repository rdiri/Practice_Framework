package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class Login_Logout extends StartBrowser{
	
  @Test
  public void login_logout() throws Exception 
  {
	  CommonFunctions cf = new CommonFunctions();
	  cf.login();
	  System.out.println("logged in");
	  cf.logout();
	  
  }
}
