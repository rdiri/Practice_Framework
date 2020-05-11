package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class Login extends StartBrowser{
  @Test
  public void testLogin() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.login();
	 
  }
}
