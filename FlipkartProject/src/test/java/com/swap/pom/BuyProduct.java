package com.swap.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.swap.utilities.Utils;

public class BuyProduct {

	WebDriver driver;

	public BuyProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[contains(text(),'Black ')])[4]")
	WebElement product;

	@FindBy(xpath = "//button[text()='ADD TO CART'] ")
	WebElement goToCartButton;

	@FindBy(xpath = "(//form)[2]/button")
	WebElement placeOrderButton;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	WebElement continueButton;

	@FindBy(xpath = "//input[@type='radio' and @id='NET_OPTIONS']")
	WebElement netBankingRadio;

	@FindBy(xpath = "//label[@for='NET_OPTIONS']//input[@id='SBI']")
	WebElement sbiRadio;

	@FindBy(xpath = "//label[@for='NET_OPTIONS']//button")
	WebElement payButton;

	public void clickProduct() {
		product.click();
	}

	public void clickGoToCartButton() {
		goToCartButton.click();

	}

	public void clickplaceOrderButton() {
		placeOrderButton.click();
	}

	public void clickContinueButton() {
		continueButton.click();
	}

	public void clickNetBankingRadio() {

		Utils.jsClick(driver, netBankingRadio);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clickSbiRadio() {
		Utils.jsClick(driver, sbiRadio);
	}

	public void clickPayButton() {
		payButton.click();
	}

}
