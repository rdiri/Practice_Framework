package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class RegisteredUser_Login_Logout extends StartBrowser{
  @Test
  public void testRegisteredUser_Login_Logout() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.atHomeLogin();
	  cfs.atHomeLogout();
  }
}
