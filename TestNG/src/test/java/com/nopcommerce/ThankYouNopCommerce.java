package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouNopCommerce {
	public RemoteWebDriver driver;

	public ThankYouNopCommerce(RemoteWebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getOrderDetails() {
		return orderDetails;
	}

	public WebElement getContinueButtonFromThankYou() {
		return continueButtonFromThankYou;
	}

	@FindBy(xpath = "(//a[.='Click here for order details.'])")
	private WebElement orderDetails;

	@FindBy(xpath = "//button[contains(@class,'continue-button')]")
	private WebElement continueButtonFromThankYou;

}
