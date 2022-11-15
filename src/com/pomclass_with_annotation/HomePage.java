package com.pomclass_with_annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//td[text()='Enter Time-Track']")private WebElement text;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifytext() {
		
		String actText = text.getText();
		return actText;

}

	}


