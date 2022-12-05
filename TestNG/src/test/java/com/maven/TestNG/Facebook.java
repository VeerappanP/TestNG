package com.maven.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Facebook {
    @Test
	public void home() {
    	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
