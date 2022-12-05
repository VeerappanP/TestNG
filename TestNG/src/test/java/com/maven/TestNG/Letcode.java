package com.maven.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Letcode {

	@Test
	public void letcode() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
