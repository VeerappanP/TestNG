package com.maven.TestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority extends BaseClass {
	public WebDriver driver;
	@Test(priority=1)
	public void lauchAndNavigateToAmazon() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test(priority=2)
	public void searchProduct()  {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	@Test(priority=3)
	public void chooseProduct()  {
		driver.findElement(By.xpath("//img[contains(@alt,' Ad - Apple iPhone 13 (128GB) - Green')]")).click();
	}
	@Test(priority = 4)
	public void switchToWindow1() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
	}
	@Test(priority=5)
	public void addToCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		driver.findElement(By.xpath("//input[contains(@aria-labelledby,'attach-sidesheet-view')]")).click();
	}
	@Test(priority=6)
	public void deleteFromCart() {
		driver.findElement(By.xpath("//span[@data-action='delete']")).click();
		driver.quit();
	}

}
