package com.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutComplete {

	WebDriver driver;

	@FindBy(xpath = "//h2[@class='complete-header']")
	public WebElement thankYou;

	@FindBy(xpath = "//button[@id='back-to-products']")
	public WebElement backHome;

	public CheckOutComplete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
