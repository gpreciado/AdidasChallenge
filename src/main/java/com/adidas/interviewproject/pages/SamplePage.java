package com.adidas.interviewproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.adidas.inteviewproject.utilities.Baseline;

public class SamplePage extends Baseline {

	public SamplePage(WebDriver driver, int time) {
		super(driver, time);
	}
	
	@FindBy(css="#comment")
	WebElement comment;
	@FindBy(id="author")
	WebElement name;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="submit")
	WebElement postComment;
	@FindBy(xpath="//*[@id=\"error-page\"]/p[2]")
	WebElement errorMessage;
	@FindBy(name="back")
	WebElement backButton;
	@FindBy(xpath="//div[starts-with(@id, 'comment-')]")
	WebElement newComment;
	
	
	public void wrongEmailComment() {
		wait.until(ExpectedConditions.elementToBeClickable(comment));
		writeOnElement(comment, "Comment for Testing Purposes");
		writeOnElement(name, "Gabriel");
		writeOnElement(email, "preciadoledezma@@gmail");
		postComment.submit();
		
	}
	
	public boolean isErrorDisplayed() {
		return errorMessage.isDisplayed();
	}
	
	public void goodEmailComment() {
		wait.until(ExpectedConditions.elementToBeClickable(comment));
		writeOnElement(comment, "New comment is intended for testing purposes");
		writeOnElement(name, "Gabriel");
		writeOnElement(email, "preciadoledezma@gmail.com");
		postComment.submit();
	}
	
	public boolean isNewCommentPresent() {
		//wait.until(ExpectedConditions.visibilityOf(newComment));
		return newComment.isDisplayed();
	}

}
