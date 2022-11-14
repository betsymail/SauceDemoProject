package com.SauceDemo.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;
import com.SauceDemo.pages.Logout;

public class TestClassLogout extends TestBase {

	Login objLog;
	Inventory objInv;
	Logout objLogout;

	@Test(priority = 1)
	public void TC09_verifyLogout() throws IOException {
		objLog = new Login(driver);
		objLog.login();
		objLogout = new Logout(driver);
		objLogout.logoutDropDown.click();
		objLogout.logoutBtn.click();
		String act = driver.getCurrentUrl();
		String exp = prop.getProperty("url");
		Assert.assertEquals(act, exp);

	}

}
