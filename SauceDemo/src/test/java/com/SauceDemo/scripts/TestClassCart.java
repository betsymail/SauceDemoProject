package com.SauceDemo.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.constants.AutomationConstants;
import com.SauceDemo.pages.Cart;
import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;

public class TestClassCart extends TestBase {

	Login objLog;
	Inventory objInv;
	Cart objCart;

	@Test(priority = 1)
	public void TC04_verifyItemsCart() throws IOException {
		objLog = new Login(driver);
		objLog.login();

		objInv = new Inventory(driver);
		objInv.addCart();
		objInv.cartLink.click();

		String actual = driver.getCurrentUrl();
		String expected = prop.getProperty("cartPage");
		Assert.assertEquals(actual, expected);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objCart = new Cart(driver);
		String act = objCart.backpack.getText();
		String exp = AutomationConstants.BACKPACK;
		Assert.assertEquals(act, exp);

		String act1 = objCart.onesie.getText();
		String exp1 = AutomationConstants.ONESIE;
		Assert.assertEquals(act1, exp1);

		String act2 = objCart.jacket.getText();
		String exp2 = AutomationConstants.JACKET;
		Assert.assertEquals(act2, exp2);

	}

	@Test(priority = 2)
	public void TC05_verifyCheckoutBtn() {

		objCart = new Cart(driver);
		objCart.checkOut.click();

		String actual = driver.getCurrentUrl();
		String expected = prop.getProperty("checkOutOne");
		Assert.assertEquals(actual, expected);

	}

}
