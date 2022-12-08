package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartNopCommerce {

	public RemoteWebDriver driver;

	public ShoppingCartNopCommerce(RemoteWebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

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
