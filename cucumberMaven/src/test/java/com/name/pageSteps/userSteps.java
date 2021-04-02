package com.name.pageSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userSteps {
	
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement txt_userName;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	
	public userSteps(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void userLogin(String username, String password) {
		txt_userName.sendKeys(username);
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
		
	}
	//logout
	
	public void clickLogout() {
		btn_logout.click();
		
	}
}
