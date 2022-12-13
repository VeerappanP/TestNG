package com.nopcommerce.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonfunction.CommonFunction;

public class CheckingOrderPlacing extends CommonFunction{
	
	@Test(priority = 1)
	public void register() {
		initElements();
		implicitlyWait(10);
		click(getRegisterHead());
		click(getMaleRadioButtonRM());
		sendkeys(getFirstNameRM(), properties.getProperty("firstName"));
		sendkeys(getLastNameRM(), properties.getProperty("lastName"));
		selectByVisibleText(getDateOfBirthDayRM(), "24");
		selectByVisibleText(getDateOfBirthMonthRM(), "July");
		selectByVisibleText(getDateOfBirthYearRM(), "1973");
		sendkeys(getEmailRM(), properties.getProperty("email"));
		sendkeys(getCompanyRM(), properties.getProperty("companyName"));
		sendkeys(getPasswordRegisterRM(), properties.getProperty("password"));
		sendkeys(getConfirmPasswordRM(),properties.getProperty("ConfirmPassword"));
		click(getRegisterButtonRM());
		click(getContinueButtonAfterRegistrationRM());
	}
	@Test(priority = 2)
	public void OrderPlacing() throws InterruptedException {
		actionsMoveToTargetedWebElement(getComputersHead());
		actionsMoveToTargetedWebElement(getDesktops());
		actionsClick();
		
		click(getBuildYourOwnComputer());
		
		selectByVisibleText(getProcessor(), "2.2 GHz Intel Pentium Dual-Core E2200");
		selectByValue(getRam(), "5");
		click(getHdd400gb());
		click(getOsVistaHome());
		click(getSoftwareMicrosoftOffice());
		clear(getQuantity());
		sendkeys(getQuantity(), "2");
		click(getAddToCart());
		click(getCloseSpan());
		
		actionsMoveToTargetedWebElement(getShoppingCartHead());
		javaScriptClick(getGoToCartHead());
		
		selectByValue(getGiftWrapping(), "1");
		click(getTermsAndCondition());
		click(getCheckOutButton());
		
		click(getShipToSameAddressRadioBox());
		selectByValue(getCountry(), "1");
		selectByValue(getState(), "50");
		sendkeys(getCity(), "Maxico");
		sendkeys(getAddress1(), "No:657, MH street");
		sendkeys(getZipCode(), "567987");
		sendkeys(getPhoneNumber(), "8767879985");
		click(getContinueButton());
		Thread.sleep(1000);
		
		selectByIndex(getSelectShippingAddress(), 0);
		click(getContinueButtonShip());
		Thread.sleep(1000);
		
		click(getContinueButtonShipMethode());
		Thread.sleep(1000);
		
		click(getContinueButtonPaymentMethode());
		Thread.sleep(1000);
		
		click(getContinueButtonPaymentInformation());
		Thread.sleep(1000);
		
		click(getConfirmButton());
		Thread.sleep(1000);
		String text = getTextOrderSuccess().getText();
		Assert.assertEquals(text, "Your order has been successfully processed!");
	}
	

}
