package com.SauceDemo.scripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.pages.Inventory;
import com.SauceDemo.pages.Login;

public class TestClassInventory extends TestBase {

	Login objLog;
	Inventory objInv;

	@Test(priority = 1)
	public void TC02_verifyAddtocart() throws IOException {
		objLog = new Login(driver);
		objLog.login();

		// filtering the results by 'Price (low to high)'
		objInv = new Inventory(driver);
		objInv.dropDown.click();
		Select filter = new Select(objInv.dropDown);
		filter.selectByVisibleText("Price (low to high)");

		// Adding 3 different items to the cart
		objInv.backPack.click();
		objInv.addToCart.click();
		objInv.backToProducts.click();
		objInv.onesieAddToCart.click();
		objInv.fleeceJacket.click();
		objInv.fleeceAddToCart.click();
		objInv.backToProducts.click();

		// Verify the total number of items in the cart
		String ActualItems = objInv.cartLink.getText();
		String ExpectedItems = "3";
		Assert.assertEquals(ActualItems, ExpectedItems);
	}

	@Test(priority = 2)
	public void TC03_verifyRemoveFromCart() throws IOException, Exception {

		// Remove an item from the cart and verify the number of items in the cart.
		objInv = new Inventory(driver);
		objInv.remove.click();
		Thread.sleep(1000);
		String ActualItems = objInv.cartLink.getText();
		String ExpectedItems = "2";
		Assert.assertEquals(ActualItems, ExpectedItems);

		// Add an item again to the cart and verify the total number of items
		objInv.backPack.click();
		objInv.addToCart.click();
		Thread.sleep(1000);
		String ActItems = objInv.cartLink.getText();
		String ExpItems = "3";
		Assert.assertEquals(ActItems, ExpItems);

	}

}
