package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class MyListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = BaseClass.driver;
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trgt = new File(System.getProperty("user.dir") + "/" + result.getName() + ".png");

		try {
			FileHandler.copy(src, trgt);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
