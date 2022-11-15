package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Business Logic Class
	//step 1declaration: we need to use variable make them private 
	// Take data members variables as private
		@FindBy(id="username") private WebElement un;
		@FindBy(name="pwd")private WebElement pwd;
		@FindBy(id="loginButton")private WebElement loginBtn;
		//Take constructor as public //
		//step2initialization: we need to use constructor make it public 
	   public LoginPage (WebDriver driver){
		 PageFactory.initElements(driver,this);
	   }
		// Take method as public
	   //step3implemantation: use method make it public to use it another class
	   public void enterUserName() {
		   un.sendKeys("admin");
	   }
	   public void enterPassWord() {
		   pwd.sendKeys("manager");
	   }
	   public void clickonButton() {
		   loginBtn.click();
	   }

}
