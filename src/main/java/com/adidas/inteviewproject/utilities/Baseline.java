package com.adidas.inteviewproject.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Baseline {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public Baseline(WebDriver driver, int time) {
		this.driver = driver;
		wait = new WebDriverWait(driver, time);
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void clickElement (WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void writeOnElement(WebElement element, String keys) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(keys);
	}

}
