package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_attribute {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.actitime.com/login.do");
		//enter username(use forumula xpath by attribute
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//enter pwd
		
		dr.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		
		//click on login btm(use fromula xpath by text())
		dr.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
