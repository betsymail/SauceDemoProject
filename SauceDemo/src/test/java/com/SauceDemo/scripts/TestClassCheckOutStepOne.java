package com.SauceDemo.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.pages.Cart;
import com.SauceDemo.pages.CheckOutStepOne;
import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;

public class TestClassCheckOutStepOne extends TestBase {

	Login objLog;
	Inventory objInv;
	Cart objCart;
	CheckOutStepOne objCh1;

	@Test(priority = 1)
	public void TC06_verifyCheckOutStepOne() throws IOException {
		objLog = new Login(driver);
		objLog.login();

		driver.navigate().to(prop.getProperty("checkOutOne"));
		objCh1 = new CheckOutStepOne(driver);
		objCh1.checkOutInfo();
		String act = driver.getCurrentUrl();
		String exp = prop.getProperty("checkOutTwo");
		Assert.assertEquals(act, exp);

	}

}
