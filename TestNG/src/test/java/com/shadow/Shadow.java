package com.shadow;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Shadow {
	
	
	
	
	
	@Test
	public void shadowMethode() {
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/shadow");
		
		WebElement findElement = driver.findElement(By.id("open-shadow"));
		
		SearchContext shadowRoot = findElement.getShadowRoot();
		
		String text = shadowRoot.findElement(By.cssSelector("label.label")).getText();
		
		Assert.assertEquals(text, "Enter your first name");
		
		shadowRoot.findElement(By.cssSelector("input#fname")).sendKeys("Veerappan");
		
		SearchContext shadowRoot2 = driver.findElement(By.xpath("(//div[@class='field'])[2]")).getShadowRoot();
		
		String text2 = shadowRoot2.findElement(By.cssSelector("label.label")).getText();
		
		Assert.assertEquals(text2, "Enter your last name");
	}
	
	
 
}
