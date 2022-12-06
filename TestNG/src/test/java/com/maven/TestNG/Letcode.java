package com.maven.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Letcode {

	@Test
	public void letcode() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		System.out.println(driver.getTitle());
		driver.quit();
		driver.getScreenshotAs(null);
	}

}
