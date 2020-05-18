package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class CreatNewAccount_Page 
{
	public static By rdBtnTitle = By.name("id_gender");
	public static By txtCustomerFirstname = By.id("customer_firstname");
	public static By txtCustomerLastname = By.id("customer_lastname");
	public static By txtEmailidvalidate = By.xpath("//input[@data-validate='isEmail']");       // check how this works
	public static By txtPasswdidvalidate = By.xpath("//input[@data-validate='isPasswd']");
	
	public static By drpDays = By.xpath("//select[@id='days']");
	public static By drpMonths = By.xpath("//select[@id='months']");
	public static By drpYears = By.xpath("//select[@id='years']");
	public static By chkForNewsletter = By.id("newsletter");
	public static By chkForSpecialOffers = By.id("optin");
	
	public static By TxtAddressFirstName = By.id("firstname");
	public static By TxtAddressLastName = By.id("lastname");
	public static By TxtAddress1 = By.id("address1");
	public static By TxtAddress2 = By.id("address2");
	public static By TxtCity1 = By.id("city");
	public static By drpState = By.id("id_state");
	public static By txtPostalCode = By.className("postcode");
	public static By drpCountry = By.id("id_country");
	
	public static By drpother = By.id("other");
	public static By txtHomePhone = By.id("phone");
	public static By txtMobilePhone = By.id("phone_mobile");
	public static By txtAddressAlias = By.id("alias");

	public static By btnRegister = By.id("submitAccount");
		
	}
	
	
	
