package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class SauceTestLogin extends BaseClass {
	LoginPage loginPage;

	@Test(priority = 1)
	public void checkValidLogin() {
		loginPage = new LoginPage(driver);
		loginPage.loginWithUser("standard_user", "secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed!");
	}

}
