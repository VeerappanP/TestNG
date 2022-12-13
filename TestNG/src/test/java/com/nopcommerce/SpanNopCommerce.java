package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpanNopCommerce extends ShoppingCartNopCommerce {
	
	@FindBy(xpath = "//span[@title='Close']")
	private WebElement closeSpan;

	public WebElement getCloseSpan() {
		return closeSpan;
	}

}
