package com.selenium2forpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver m=new ChromeDriver();
       m.get("https://www.zomato.com/");
       //maximize
       m.manage().window().maximize();
       //setsize
       Dimension d=new Dimension(300, 200);
       m.manage().window().setSize(d);
       
       Point f=new Point(100, 200);
       m.manage().window().setPosition(f);
       
	}

}
