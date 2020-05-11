package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class AtHomeLoginPage {
	
	public static By txtuserName = By.id("login-form-email");
	public static By txtPassword = By.name("loginPassword");
	public static By btnSignIn = By.xpath("//button[@class='sign-in btn btn-block btn-primary']");

}
