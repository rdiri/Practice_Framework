package com.gcr.scripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.objectrepository.Page_Home;
import com.gcr.objectrepository.Page_MyAccount;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_SearchItems2 extends StartBrowser{

	public WebDriver driver;
	public ActionDriver aDriver;
	public String emailid;
	public String password;

	@Test
	public void SearchItems() throws Exception {

		CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();

		cf.login();
		cf.search("shirt");
		aDriver.click(Page_Home.imgProductSearch(1), "Search product");
		

	}

}
//(//ul[@class='product_list row list']/li//div[@class='product-image-container']/a/img)[1]
