package com.Actions_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin Lokare\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.com/");
	
	}

}
