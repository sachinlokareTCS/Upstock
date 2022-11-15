package com.Popus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
      //create object of browser setting class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		Thread.sleep(3000);
		WebDriver d=new ChromeDriver(c);
		Thread.sleep(3000);
		d.manage().window().maximize();
		d.get("https://www.hdfc.com/");

	}

}
