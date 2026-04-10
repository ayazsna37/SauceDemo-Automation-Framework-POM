package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public void initialization() throws IOException {
		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "src/test/resources/config.properties");
		prop.load(fis);
		String myBrowser = prop.getProperty("browser");
		if (myBrowser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));

		} else
			System.out.println("browser is not correct");

	}

	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
