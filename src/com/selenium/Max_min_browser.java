package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_min_browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https:www.amazon.com/");
		//maximize
		d.manage().window().maximize();
		Thread.sleep(4000);
		//minimize
		//d.manage().window().minimize();
		//setsize()
		Dimension s=new Dimension(100, 200);
		d.manage().window().setSize(s);
		//setposition
		Point p=new Point(300, 400);
		d.manage().window().setPosition(p);
		
		
		
		
	}

}
