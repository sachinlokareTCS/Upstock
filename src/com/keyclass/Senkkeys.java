package com.keyclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkkeys {

	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	   d.get("https://demo.actitime.com/login.do");
	   Thread.sleep(4000);
	   d.manage().window().maximize();
	   d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	


	
	
	
	
}
}
