package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutNopCommerce extends BuildYourOwnComputerNopCommerce {

	public WebElement getShipToSameAddressRadioBox() {
		return shipToSameAddressRadioBox;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSelectShippingAddress() {
		return selectShippingAddress;
	}

	public WebElement getContinueButtonShip() {
		return continueButtonShip;
	}

	public WebElement getContinueButtonShipMethode() {
		return continueButtonShipMethode;
	}

	public WebElement getContinueButtonPaymentMethode() {
		return continueButtonPaymentMethode;
	}

	public WebElement getContinueButtonPaymentInformation() {
		return continueButtonPaymentInformation;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	@FindBy(xpath = "//input[@id='ShipToSameAddress']")
	private WebElement shipToSameAddressRadioBox;

	@FindBy(xpath = "//select[@data-val-required='Country is required.']")
	private WebElement country;

	@FindBy(xpath = "//select[contains(@id,'BillingNewAddress_S')]")
	private WebElement state;

	@FindBy(xpath = "//input[contains(@name,'BillingNewAddress.City')]")
	private WebElement city;

	@FindBy(xpath = "//input[contains(@name,'.Address1')]")
	private WebElement address1;

	@FindBy(xpath = "//input[contains(@name,'ZipPostalCode')]")
	private WebElement zipCode;

	@FindBy(xpath = "//input[contains(@name,'.PhoneNumber')]")
	private WebElement phoneNumber;

	@FindBy(xpath = "(//button[@name='save'])[1]")
	private WebElement continueButton;

	@FindBy(xpath = "//select[@id='shipping-address-select']")
	private WebElement selectShippingAddress;

	@FindBy(xpath = "(//button[.='Continue'])[2]")
	private WebElement continueButtonShip;

	@FindBy(xpath = "(//button[.='Continue'])[3]")
	private WebElement continueButtonShipMethode;

	@FindBy(xpath = "(//button[.='Continue'])[4]")
	private WebElement continueButtonPaymentMethode;

	@FindBy(xpath = "(//button[.='Continue'])[5]")
	private WebElement continueButtonPaymentInformation;

	@FindBy(xpath = "(//button[.='Confirm'])")
	private WebElement confirmButton;

}
