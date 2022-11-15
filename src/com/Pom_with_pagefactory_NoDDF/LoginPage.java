package com.Pom_with_pagefactory_NoDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
         // Declaration
		@FindBy(xpath="//input[@id='username']")private WebElement UN;
		@FindBy(xpath="//input[@name='pwd']")private WebElement PWD ;
		@FindBy(xpath="//div[text()='Login ']")private WebElement loginBTN ;
			
	//initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void enterUN() {
			UN.sendKeys("admin");
		}
		public void enterPWD() {
			PWD.sendKeys("manager");
		}
		public void clickLoginBtn() {
			loginBTN.click();
		}
			
			
			
			



	}


