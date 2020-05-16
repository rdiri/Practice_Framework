package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By txtEmaiId = By.id("email");
	public static By txtPassword = By.id("passwd");
	public static By btnSignIn = By.id("SubmitLogin");
	
	//Create account 
	public static By txtNewEmailid = By.id("email_create");
	public static By btnSubmitCreate = By.name("SubmitCreate");  //did not know how to check the name locator 
	

}
