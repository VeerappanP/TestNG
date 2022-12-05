package com.maven.TestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	public void implicitlyWait(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void javascriptSedkeys(WebDriver driver,WebElement webElement,String sendKeys) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+sendKeys+"'", webElement);
	}
   
}
