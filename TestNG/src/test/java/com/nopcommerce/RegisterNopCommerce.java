package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNopCommerce {

	public RemoteWebDriver driver;

	public RegisterNopCommerce(RemoteWebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public WebElement getDateOfBirthMonth() {
		return dateOfBirthMonth;
	}

	public WebElement getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getPasswordRegister() {
		return passwordRegister;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getContinueButtonAfterRegistration() {
		return continueButtonAfterRegistration;
	}

	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement male;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastName;

	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	private WebElement dateOfBirthDay;

	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	private WebElement dateOfBirthMonth;

	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	private WebElement dateOfBirthYear;

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='Company']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordRegister;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmPassword;

	@FindBy(xpath = "//a[contains(@class,'continue-button')]")
	private WebElement continueButtonAfterRegistration;

}
