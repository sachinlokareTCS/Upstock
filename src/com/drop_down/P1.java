package com.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement p = d.findElement(By.xpath("//select[@id='day']"));
		//then we have to create object of select class
		Select s=new Select(p);
		//use select class method
	    //s.selectByVisibleText("9");
		s.selectByIndex(18);
		
		
		

	}

}
