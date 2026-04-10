package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	By cartItem = By.xpath("//div[@class='inventory_item_name']");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getItemName() {
		return driver.findElement(cartItem).getText();
	}
}
