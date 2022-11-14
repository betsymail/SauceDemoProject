package com.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	WebDriver driver;

	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkOut;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
	public WebElement backpack;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]")
	public WebElement onesie;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Fleece Jacket')]")
	public WebElement jacket;

	public Cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
