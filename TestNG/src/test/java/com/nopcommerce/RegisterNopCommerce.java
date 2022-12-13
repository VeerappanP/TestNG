package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterNopCommerce extends PrintNopCommerce {

	public WebElement getMaleRadioButtonRM() {
		return maleRadioButtonRM;
	}

	public WebElement getFirstNameRM() {
		return firstNameRM;
	}

	public WebElement getLastNameRM() {
		return lastNameRM;
	}

	public WebElement getDateOfBirthDayRM() {
		return dateOfBirthDayRM;
	}

	public WebElement getDateOfBirthMonthRM() {
		return dateOfBirthMonthRM;
	}

	public WebElement getDateOfBirthYearRM() {
		return dateOfBirthYearRM;
	}

	public WebElement getEmailRM() {
		return emailRM;
	}

	public WebElement getCompanyRM() {
		return companyRM;
	}

	public WebElement getPasswordRegisterRM() {
		return passwordRegisterRM;
	}

	public WebElement getConfirmPasswordRM() {
		return confirmPasswordRM;
	}

	public WebElement getRegisterButtonRM() {
		return registerButtonRM;
	}

	public WebElement getContinueButtonAfterRegistrationRM() {
		return continueButtonAfterRegistrationRM;
	}

	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleRadioButtonRM;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameRM;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameRM;

	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	private WebElement dateOfBirthDayRM;

	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	private WebElement dateOfBirthMonthRM;

	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	private WebElement dateOfBirthYearRM;

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailRM;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyRM;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordRegisterRM;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmPasswordRM;

	@FindBy(xpath = "//button[.='Register']")
	private WebElement registerButtonRM;

	@FindBy(xpath = "//a[contains(@class,'continue-button')]")
	private WebElement continueButtonAfterRegistrationRM;

}
