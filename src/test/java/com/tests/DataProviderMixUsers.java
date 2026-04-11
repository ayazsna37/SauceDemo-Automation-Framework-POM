package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.CartPage;
import com.pages.InventoryPage;
import com.pages.LoginPage;

public class DataProviderMixUsers extends BaseClass {

	LoginPage loginPage;
	InventoryPage inventoryPage;
	CartPage cartPage;

	@DataProvider(name = "users")
	public Object[][] getData() {
		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "wrong_pass" } };
	}

	@Test(dataProvider = "users")
	public void dataProviderTest(String un, String pass) {
		loginPage = new LoginPage(driver);
		loginPage.loginWithUser(un, pass);
		
		inventoryPage = new InventoryPage(driver);
		inventoryPage.addFourthItem();
		inventoryPage.clickCart();
		cartPage = new CartPage(driver);
		Assert.assertEquals(cartPage.getItemName(), "Sauce Labs Fleece Jacket", "cart item not matched");
	}
}
