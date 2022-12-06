package com.maven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AdactinLogin {
	
    @Test(dataProvider = "dataLogin",dataProviderClass = ExcelDataRead.class)
	public void adactinLogin(String data[]) {

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		String attribute = driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		driver.quit();
	}

}
