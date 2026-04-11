package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver;
	By addToCart = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By cartIcon = By.className("shopping_cart_link");

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addFourthItem() {
		driver.findElement(addToCart).click();
	}

	public void clickCart() {
		driver.findElement(cartIcon).click();
	}
}
