package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.BaseClass;

public class BuildYourOwnComputerNopCommerce extends BaseClass {

	public WebElement getProcessor() {
		return processor;
	}

	public WebElement getRam() {
		return ram;
	}

	public WebElement getHdd320gb() {
		return hdd320gb;
	}

	public WebElement getHdd400gb() {
		return hdd400gb;
	}

	public WebElement getOsVistaHome() {
		return osVistaHome;
	}

	public WebElement getOsVistaPremium() {
		return osVistaPremium;
	}

	public WebElement getSoftwareMicrosoftOffice() {
		return softwareMicrosoftOffice;
	}

	public WebElement getSoftwareAcrobatReader() {
		return softwareAcrobatReader;
	}

	public WebElement getSoftwareTotalCommander() {
		return softwareTotalCommander;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	@FindBy(xpath = "//select[contains(@name,'product_attribute_1')]")
	private WebElement processor;

	@FindBy(xpath = "//select[contains(@name,'product_attribute_2')]")
	private WebElement ram;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_3_6')]")
	private WebElement hdd320gb;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_3_7')]")
	private WebElement hdd400gb;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_4_8')]")
	private WebElement osVistaHome;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_4_9')]")
	private WebElement osVistaPremium;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_5_10')]")
	private WebElement softwareMicrosoftOffice;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_5_11')]")
	private WebElement softwareAcrobatReader;

	@FindBy(xpath = "//input[contains(@id,'product_attribute_5_12')]")
	private WebElement softwareTotalCommander;

	@FindBy(xpath = "//input[contains(@id,'product_enteredQuantity_1')]")
	private WebElement quantity;

	@FindBy(xpath = "//button[contains(@id,'add-to-cart-button-1')]")
	private WebElement addToCart;

}
