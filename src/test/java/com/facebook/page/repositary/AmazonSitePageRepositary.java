package com.facebook.page.repositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AmazonSitePageRepositary extends BaseClass {
	public static WebElement emailField() {
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		return emailField;
	}
	
	public static WebElement helloSignIn() {
		WebElement helloSignIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		return helloSignIn;
	}
	
	public static WebElement continueButton() {
		WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		return continueButton;
	}
	
	public static WebElement passwordField() {
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		return passwordField;
	}
	
	public static WebElement passwordSubmit() {
		WebElement passwordSubmit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		return passwordSubmit;
	}
	
	public static String userVerified() {
		String data = driver.findElement(By.xpath("//span[text()='Hello, Shifreen']")).getText();
		return data;
	}
}
