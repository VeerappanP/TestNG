package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintNopCommerce extends OrderInformation {

	public WebElement getHostShadow() {
		return hostShadow;
	}

	public WebElement getNested1() {
		return nested1;
	}

	public WebElement getNested2() {
		return nested2;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getDestination() {
		return destination;
	}

	@FindBy(tagName = "print-preview-app")
	private WebElement hostShadow;

	@FindBy(css = "print-preview-sidebar.sidebar")
	private WebElement nested1;

	@FindBy(tagName = "print-preview-button-strip")
	private WebElement nested2;

	@FindBy(css = "cr-button.action-button")
	private WebElement save;

	@FindBy(css = "cr-button.cancel-button")
	private WebElement cancel;

	@FindBy(css = "select[style^='background-image: url']")
	private WebElement destination;

}
