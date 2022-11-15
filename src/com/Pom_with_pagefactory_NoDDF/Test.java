package com.Pom_with_pagefactory_NoDDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//object 1st 
		LoginPage l=new LoginPage(driver);
		l.enterUN();
		l.enterPWD();
		l.clickLoginBtn();
		//object 2nd
		HomePage h=new HomePage(driver);
		h.verifytext();
		
	}


	}


