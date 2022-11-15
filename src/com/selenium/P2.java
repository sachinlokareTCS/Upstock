package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		Thread.sleep(3000);
		d.get("https://www.amazon.com/");
		Thread.sleep(3000);
		d.navigate().back();// now control goes to google
		Thread.sleep(2000);
		d.navigate().forward();//now control goes to amazon
		d.navigate().refresh();//whenever page is refreshed in automation at that time address of web page can be changed
		
        d.close();
	}

}
