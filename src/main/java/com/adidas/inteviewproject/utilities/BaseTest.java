package com.adidas.inteviewproject.utilities;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	
	protected WebDriver driver;
	protected String baseUrl;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "/Users/gabrielpreciado/Downloads/Automation Folder/geckodriver");
	  driver = new FirefoxDriver();
	  baseUrl = "http://store.demoqa.com/";
	  
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
 @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }
}
