package com.Scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)d;
		
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-1000);");
		

	}

}
