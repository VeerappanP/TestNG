package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouNopCommerce extends SpanNopCommerce {

	public WebElement getOrderDetails() {
		return orderDetails;
	}

	public WebElement getContinueButtonFromThankYou() {
		return continueButtonFromThankYou;
	}
	public WebElement getTextOrderSuccess() {
		return textOrderSuccess;
	}

	@FindBy(xpath = "(//a[.='Click here for order details.'])")
	private WebElement orderDetails;

	@FindBy(xpath = "//button[contains(@class,'continue-button')]")
	private WebElement continueButtonFromThankYou;
	
	@FindBy(xpath = "//strong[contains(text(),' successfully processed!')]")
	private WebElement textOrderSuccess;

}
