package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartNopCommerce extends RegisterNopCommerce {

	public WebElement getGiftWrapping() {
		return giftWrapping;
	}

	public WebElement getTermsAndCondition() {
		return termsAndCondition;
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

	@FindBy(xpath = "//select[@id='checkout_attribute_1']")
	private WebElement giftWrapping;

	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement termsAndCondition;

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutButton;

}
