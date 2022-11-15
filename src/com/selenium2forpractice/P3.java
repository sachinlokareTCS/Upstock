package com.selenium2forpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demo.actitime.com/login.do");
		
		//enter username
		dr.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		dr.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		

	}

}
