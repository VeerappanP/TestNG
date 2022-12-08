package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopNopCommerce {
	
   public RemoteWebDriver driver;
	
	public DesktopNopCommerce(RemoteWebDriver driver1) {
		this.driver=driver1;
	       PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getBuildYourOwnComputer() {
		return buildYourOwnComputer;
	}

	@FindBy(xpath = "(//a[.='Build your own computer'])[2]")
	private WebElement buildYourOwnComputer;

}
