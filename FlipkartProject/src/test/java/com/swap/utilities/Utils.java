package com.swap.utilities;


import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utils {

	public static void selectOption(List<WebElement> list,String option) {
		for (WebElement op : list) {
			if (op.getText().equalsIgnoreCase(option)) {
				op.click();
				break;
			}
		}
	}

	public static void jsClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void actionCLick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.click(element).perform();
	}
	public static String getCurrentWindow(WebDriver driver) {

		return driver.getWindowHandle();
	}
	
	public static void switchWindow(WebDriver driver,String window) {
		Set<String> windows=driver.getWindowHandles();
		for (String string : windows) {
			WebDriver element = driver.switchTo().window(string);
			if (element.getTitle().contains(window)) {
				break;
			}
		}
		
	}
}
