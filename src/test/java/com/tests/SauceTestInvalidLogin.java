package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class SauceTestInvalidLogin extends BaseClass {
LoginPage loginPage;
@Test
public void invalidLogin() {
	loginPage = new LoginPage(driver);
	loginPage.loginWithUser("standard_user", "secret_sauce");
	Assert.assertEquals(driver.getTitle(), "ayaz", "case failed");
}
}
