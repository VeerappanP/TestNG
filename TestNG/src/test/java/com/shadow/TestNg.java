package com.shadow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestNg {

	public static void main(String[] args) {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions builder = new Actions(driver);


		WebElement findElement2 = driver.findElement(By.xpath("//a[.='Work-Space']"));
		
		Point location = findElement2.getLocation();
		
        builder.moveByOffset(location.getX(), location.getY());

		builder.click().perform();
		
		
//		WebElement findElement = driver.findElement(By.xpath("//div[.='New Course!']"));
//        
//		builder.moveToElement(findElement).perform();
//		
//		builder.click().perform();
//		Point location = findElement.getLocation();
//		
//		builder.moveByOffset(location.getX(), location.getY());
//
//		builder.click().perform();

	}

}
