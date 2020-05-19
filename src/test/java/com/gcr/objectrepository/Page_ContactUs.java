package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class Page_ContactUs 
{
public static By drpSubjectHeading = By.xpath("//select[@id='id_contact']");
public static By txtemailidDeselected = By.xpath("//input[@id='email']");
public static By txtOrderReference = By.xpath("//input[@name='id_order']");
public static By txtMessageArea= By.xpath("//textarea[@name='message']");
public static By btnSendmessage=By.id("submitMessage");
public static By lnkContactus=By.linkText("Contact us");
}
