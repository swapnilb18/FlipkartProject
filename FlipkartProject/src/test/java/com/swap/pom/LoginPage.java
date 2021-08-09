package com.swap.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//form)[2]/div[1]/input")
	WebElement email;
	
	@FindBy(xpath = "(//form)[2]/div[2]/input")
	WebElement password;
	
	@FindBy(xpath = "(//form)[2]/div[4]/button")
	WebElement loginButton;
	
	@FindBy(xpath = "//a/span[contains(text(),'Log in')]")
	WebElement loginLink;
	
	@FindBy(xpath = "(//form)[2]/div[1]/input")
	WebElement mobile;
	
	@FindBy(xpath = "(//form)[2]/div[2]/input")
	WebElement pwd;
	
	@FindBy(xpath = "(//form)[2]/div[4]/button")
	WebElement login;
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	public void setMobile(String mob) {
		mobile.sendKeys(mob);
	
	}
	
	public void setPwd(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickLogin() {
		login.click();
	}
}
