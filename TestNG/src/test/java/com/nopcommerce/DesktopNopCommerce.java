package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopNopCommerce extends CheckoutNopCommerce {

	public WebElement getBuildYourOwnComputer() {
		return buildYourOwnComputer;
	}

	@FindBy(xpath = "//a[.='Build your own computer']")
	private WebElement buildYourOwnComputer;

}
