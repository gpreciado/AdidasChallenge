package com.interview.com.interview.adidas;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adidas.interviewproject.pages.SamplePage;
import com.adidas.interviewproject.pages.StorePage;
import com.adidas.inteviewproject.utilities.BaseTest;

public class DemoTest extends BaseTest{
	
	StorePage store;
	SamplePage sample;
	
	@Test
	  public void DemoTest() {
		store = new StorePage(driver,10);
		sample = new SamplePage(driver, 10);
		 
		 driver.get(baseUrl);
		 store.navigate2SamplePage();
		 sample.wrongEmailComment();
		 
		 Assert.assertTrue(sample.isErrorDisplayed(), "Error Message is not displayed, please try again...");
		 
		 driver.navigate().back();
		 sample.goodEmailComment();
		 
		 Assert.assertTrue(sample.isNewCommentPresent(), "New comment has not been found, please try again...");
		
		
		 
		  		  
	  }
	
	
	
	
}
