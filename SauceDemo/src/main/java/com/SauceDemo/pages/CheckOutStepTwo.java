package com.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwo {

	WebDriver driver;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Onesie']")
	public WebElement onesie;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	public WebElement backPack;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
	public WebElement jacket;

	@FindBy(xpath = "//div[normalize-space()='SauceCard #31337']")
	public WebElement cardInfo;

	@FindBy(xpath = "//div[normalize-space()='FREE PONY EXPRESS DELIVERY!']")
	public WebElement shipInfo;

	@FindBy(xpath = "//div[@class='summary_subtotal_label']")
	public WebElement subTotal;

	@FindBy(xpath = "//div[@class='summary_tax_label']")
	public WebElement tax;

	@FindBy(xpath = "//div[@class='summary_total_label']")
	public WebElement finalTotal;

	@FindBy(xpath = "//button[@id='finish']")
	public WebElement finishBtn;

	public CheckOutStepTwo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
