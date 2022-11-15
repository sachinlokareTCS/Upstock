package com.selenium2forpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.Pagesource;

public class WebDriver_13abstractmethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://demo.actitime.com/login.do"); //used for enter url return type-void
	Thread.sleep(4000);
	dr.manage().window().maximize();
	dr.get("https://www.amazon.com/");
	
	//dr.getCurrentUrl(); //used to get current url of webpage returntype-string
	//String t=dr.getPageSource();//
	//System.out.println(t);//used to source code of current page -string
	//String title=dr.getTitle();
	//System.out.println(title);// used to get title of current page-string
	Thread.sleep(4000);
	
	dr.manage().window().maximize();// manage=used to manage browser window-options
	Thread.sleep(3000);
	//dr.close();//close current browser window-void
	
	//dr.quit();//close all browser windows opened by selenium-void
	dr.navigate().back();
	Thread.sleep(2000);
	dr.navigate().forward();
	Thread.sleep(2000);
	dr.navigate().refresh();
	dr.quit();


	
	
	
	
	
	}

}
