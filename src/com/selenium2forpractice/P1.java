package com.selenium2forpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver d=new ChromeDriver();
       d.get("https://www.google.com/");
       Thread.sleep(3000);
      
       d.get("https://www.myntra.com/");
       
       Thread.sleep(4000);
       d.get("https://www.infosys.com/");
       
       Thread.sleep(3000);
       d.navigate().back();
       Thread.sleep(2000);
       
      d.navigate().forward();
       
      d.navigate().refresh();
       
       
       
	}

}
