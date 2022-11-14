package com.SauceDemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.utilities.ExcelUtility;

public class CheckOutStepOne {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement zipCode;

	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continueBtn;

	public CheckOutStepOne(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setFirstName(String strFirstName) {
		firstName.sendKeys(strFirstName);
	}

	public void setLastname(String strLastname) {
		lastName.sendKeys(strLastname);
	}

	public void setZipCode(String strZipcode) {
		zipCode.sendKeys(strZipcode);
	}

	public void checkOutInfo() throws IOException {
		setFirstName(ExcelUtility.getCheckoutData(1, 0));
		setLastname(ExcelUtility.getCheckoutData(1, 1));
		setZipCode(ExcelUtility.getCellPostalCodeCheckout(1, 2));
		continueBtn.click();
	}
}
