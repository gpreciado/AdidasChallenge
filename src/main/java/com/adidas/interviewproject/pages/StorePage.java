package com.adidas.interviewproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adidas.inteviewproject.utilities.Baseline;

public class StorePage extends Baseline {

	public StorePage(WebDriver driver, int time) {
		super(driver, time);
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-54\"]/a")
	WebElement samplePage;
	
	public void navigate2SamplePage() {
		clickElement(samplePage);
	}

}
