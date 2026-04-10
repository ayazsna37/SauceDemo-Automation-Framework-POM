package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By userName = By.id("user-name");
	By passWord = By.id("password");
	By loginButton = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginWithUser(String name, String pass) {
		driver.findElement(userName).sendKeys(name);
		driver.findElement(passWord).sendKeys(pass);
		driver.findElement(loginButton).click();

	}
}
