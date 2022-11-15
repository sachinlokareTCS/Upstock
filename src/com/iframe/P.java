package com.iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver m=new ChromeDriver();
	       //m.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       m.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       Thread.sleep(3000);
	       m.manage().window().maximize();
		
	}	

	}

