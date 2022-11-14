package com.SauceDemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.utilities.ExcelUtility;

public class Login {

	WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errorMessage;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String strUserName) {
		username.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}

	public void clearUsername() {
		username.clear();
	}

	public void clearPassword() {
		password.clear();
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}

	public void clickLogin() {
		loginButton.click();
	}

	public void login() throws IOException {

		String username = ExcelUtility.getCellData(1, 0);
		String password = ExcelUtility.getCellData(1, 1);
		setUserName(username);
		setPassword(password);
		clickLogin();

	}

}
