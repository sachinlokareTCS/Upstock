package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.actitime.com/login.do");
		//enter username
		
		d.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		//enter pwd
		d.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");

	}

}
