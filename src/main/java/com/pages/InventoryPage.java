package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver;
	By products = By.xpath("//div[@class='inventory_item_name ']");
	By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	By cartIcon = By.xpath("//a[@class='shopping_cart_link']");

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addFirstItem() {
		driver.findElement(addToCart).click();
		System.out.println("Sauce Labs Fleece Jacket is selected");
	}

	public void clickCart() {
		driver.findElement(cartIcon).click();
	}
}
