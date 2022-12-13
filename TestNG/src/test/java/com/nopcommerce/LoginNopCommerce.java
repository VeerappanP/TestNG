package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginNopCommerce extends HeadNopCommerce {

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberMe() {
		return rememberMe;
	}

	public WebElement getForgetPassword() {
		return forgetPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[.='Log in']")
	private WebElement loginButton;

	@FindBy(xpath = "(//a[.='Jewelry '])[1]")
	private WebElement rememberMe;

	@FindBy(xpath = "//a[.='Forgot password?']")
	private WebElement forgetPassword;

	@FindBy(xpath = "//button[@id='register-button']")
	private WebElement registerButton;

}
