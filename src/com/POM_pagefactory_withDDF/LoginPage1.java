package com.POM_pagefactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//declaration
	@FindBy(xpath="//input[@id='username']")private WebElement UN ;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD ;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBTN ;
		
//initialization
	public  LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLoginBtn() {
		loginBTN.click();
	}

}


