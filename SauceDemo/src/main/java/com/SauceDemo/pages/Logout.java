package com.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	public WebElement logoutDropDown;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	public WebElement logoutBtn;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
