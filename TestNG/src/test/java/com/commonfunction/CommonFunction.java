package com.commonfunction;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.nopcommerce.ThankYouNopCommerce;

import cucumber.Browser;

public class CommonFunction extends ThankYouNopCommerce {

	@BeforeSuite
	public void browserLaunch() throws IOException {
		loadPropertyFile("E:\\\\TestNG\\\\TestNG\\\\src\\\\test\\\\java\\\\ConfigurationFile\\\\config.properties");
		browserLaunch(Browser.CHROME);
		maximize();
		url(properties.getProperty("url"));

	}

	@AfterSuite
	public void tearDown() {
		quit();
	}

}
