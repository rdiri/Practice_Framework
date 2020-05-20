package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class Page_Home {
	
	

	public static By lnkSignIn = By.linkText("Sign in");
	
	public static By lnkSignout=By.linkText("Sign out");
	//public static By lnkContactus=By.linkText("//a[@title='Contact Us']");
	
	public static By txtSearchbox=By.id("search_query_top");
	public static By btnSubmitSearch=By.name("submit_search");
	public static By imgAllProducts = By.xpath("//a[@class='product_img_link']");
	
	public static By imgProductImage = By.xpath("(//li[@class='clearfix']/a)[1]");
	//top sellers
	public static By imgProduct(int productIndex)
	{
		return By.xpath("(//li[@class='clearfix']/a)["+productIndex+"]");
	}
	//search results
	public static By imgProductSearch(int productIndex)
	{
		return By.xpath("(//ul[contains(@class,'product_list')]/li//div[@class='product-image-container']/a/img)["+productIndex+"]");
	}
	public static By btnProceedToCheckout=By.xpath("//a[@title='Proceed to checkout']");
	
	
	public static By lnkShoppingCart=By.xpath("//a[@title='View my shopping cart']");
	public static By lnkShoppingCart1=By.xpath("(//a[@title='Proceed to checkout'])[2]");
	public static By btnAddToCart=By.xpath("//span[text()='Add to cart']");
	public static By btnCheckout=By.id("button_order_cart");
	
	
	
}
