package com.swap.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.swap.utilities.Utils;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//form/div[1]/div/input")
	WebElement searchBar;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
	
	@FindAll(@FindBy(xpath = "//form/ul/li"))
	List<WebElement> searchOptions;
	
	
	
	public void typeIntoSearchBar(String item) {
		searchBar.click();
		searchBar.sendKeys(item);
		
	}
	public void clickOnSearchButton() {
		
		searchButton.click();
	}

	public void selectSearchOption(String option) {
		
		Utils.selectOption(searchOptions,option);
	}

}
