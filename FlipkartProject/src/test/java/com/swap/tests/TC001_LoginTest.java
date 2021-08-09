package com.swap.tests;

import java.awt.AWTException;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swap.pom.BuyProduct;
import com.swap.pom.HomePage;
import com.swap.pom.LoginPage;
import com.swap.utilities.Utils;

public class TC001_LoginTest extends BaseClass {

	@Test(priority = 1)
	public void login() {

		LoginPage login = new LoginPage(driver);
		login.setEmail("ravibhagatbsi@gmail.com");
		login.setPassword("swapnil");
		login.clickLoginButton();
		login.clickLoginLink();
		login.setMobile("8805950461");
		login.setPassword("swapnil");
		login.clickLogin();
	}

	@Test(priority = 2, enabled = true)
	public void buyProduct() throws InterruptedException, AWTException {
		HomePage home = new HomePage(driver);
		home.typeIntoSearchBar("apple watch");

		home.clickOnSearchButton();
		BuyProduct buy = new BuyProduct(driver);

		buy.clickProduct();
		Thread.sleep(2000);

		Utils.switchWindow(driver, "44 mm Space Grey");
		try {
			buy.clickGoToCartButton();
		} catch (ElementClickInterceptedException e) {
			buy.clickGoToCartButton();
		}
		buy.clickplaceOrderButton();
		buy.clickContinueButton();
		buy.clickNetBankingRadio();
		buy.clickSbiRadio();
		buy.clickPayButton();
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://www.flipkart.com/checkout/init?otracker=search";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
}
