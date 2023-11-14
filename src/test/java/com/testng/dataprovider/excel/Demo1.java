package com.testng.dataprovider.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void wrapData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		WebElement emailFiled = driver.findElement(By.xpath("//input[@type='email']"));
		emailFiled.sendKeys("test1@gmail.com");
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123");
		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
		String data = driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]")).getText();
		System.out.println(data);

	}
}
