package com.SauceDemo.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.pages.Cart;
import com.SauceDemo.pages.CheckOutComplete;
import com.SauceDemo.pages.CheckOutStepOne;
import com.SauceDemo.pages.CheckOutStepTwo;
import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;

public class TestClassCheckOutComplete extends TestBase {

	Login objLog;
	Inventory objInv;
	Cart objCart;
	CheckOutStepOne objCh1;
	CheckOutStepTwo objCh2;
	CheckOutComplete objCom;

	@Test(priority = 1)
	public void TC08_verifyCheckOutComplete() throws IOException {
		objLog = new Login(driver);
		objLog.login();
		objInv = new Inventory(driver);
		objInv.cartLink.click();
		objCart = new Cart(driver);
		objCart.checkOut.click();
		objCh1 = new CheckOutStepOne(driver);
		objCh1.checkOutInfo();
		objCh2 = new CheckOutStepTwo(driver);
		objCh2.finishBtn.click();
		objCom = new CheckOutComplete(driver);
		Assert.assertTrue(objCom.thankYou.isDisplayed());
		objCom.backHome.click();
		String act = driver.getCurrentUrl();
		String exp = prop.getProperty("inventoryPage");
		Assert.assertEquals(act, exp);

	}

}
