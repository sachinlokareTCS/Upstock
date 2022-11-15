package com.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(4000);
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		//store in variable 
		WebElement dr = d.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(3000);
		//create object of select class
		
		Select c=new Select(dr);
		
		//take select class method
		//c.selectByVisibleText("2019");
		//c.selectByValue("2017");
		c.selectByIndex(3);
		
		
		
;
	}

}
