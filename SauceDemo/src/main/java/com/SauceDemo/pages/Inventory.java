package com.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventory {

	WebDriver driver;

	@FindBy(className = "product_sort_container")
	public WebElement dropDown;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	public WebElement backPack;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement addToCart;

	@FindBy(id = "remove-sauce-labs-backpack")
	public WebElement remove;

	@FindBy(xpath = "//button[@id='back-to-products']")
	public WebElement backToProducts;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Onesie']")
	public WebElement onesie;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	public WebElement onesieAddToCart;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
	public WebElement fleeceJacket;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	public WebElement fleeceAddToCart;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cartLink;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public WebElement noOfItemsCart;

	public Inventory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addCart() {
		addToCart.click();
		onesieAddToCart.click();
		fleeceAddToCart.click();
	}

}
