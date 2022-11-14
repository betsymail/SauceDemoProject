package com.SauceDemo.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.pages.Cart;
import com.SauceDemo.pages.CheckOutStepOne;
import com.SauceDemo.pages.CheckOutStepTwo;
import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;

public class TestClassCheckOutStepTwo extends TestBase {

	Login objLog;
	Inventory objInv;
	Cart objCart;
	CheckOutStepOne objCh1;
	CheckOutStepTwo objCh2;

	@Test(priority = 1)
	public void TC07_verifyCheckOutStepTwo() throws IOException {
		objLog = new Login(driver);
		objLog.login();

		objInv = new Inventory(driver);
		objInv.addCart();
		objInv.cartLink.click();

		driver.navigate().to(prop.getProperty("cartPage"));
		objCart = new Cart(driver);
		objCart.checkOut.click();

		objCh1 = new CheckOutStepOne(driver);
		objCh1.checkOutInfo();

		objCh2 = new CheckOutStepTwo(driver);
		Assert.assertTrue(objCh2.cardInfo.isDisplayed());
		Assert.assertTrue(objCh2.shipInfo.isDisplayed());
		Assert.assertTrue(objCh2.subTotal.isDisplayed());
		Assert.assertTrue(objCh2.tax.isDisplayed());
		Assert.assertTrue(objCh2.finalTotal.isDisplayed());

		objCh2.finishBtn.click();
		String act = driver.getCurrentUrl();
		String exp = prop.getProperty("checkOutComplete");
		Assert.assertEquals(act, exp);

	}

}
