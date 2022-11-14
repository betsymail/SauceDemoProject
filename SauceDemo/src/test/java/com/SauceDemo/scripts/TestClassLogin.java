package com.SauceDemo.scripts;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.SauceDemo.constants.AutomationConstants;
import com.SauceDemo.pages.Login;
import com.SauceDemo.utilities.ExcelUtility;

public class TestClassLogin extends TestBase {

	Login objLog;

	@Test(priority = 1)
	public void TC01_verifyValidLogin() throws IOException {
		objLog = new Login(driver);

		String username = ExcelUtility.getCellData(1, 0);
		String password = ExcelUtility.getCellData(1, 1);
		objLog.setUserName(username);
		objLog.setPassword(password);
		objLog.clickLogin();
		String expectedTitle = AutomationConstants.HOMEPAGETITLE;
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);

	}

}
