package com.drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		//d.manage().window().maximize();
		//click on create account
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000); 
		//select dropdown which we need to handle
		WebElement day=d.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(3000);
		//create object of select class
		Select s=new Select(day);
		Thread.sleep(3000);
		//use select class method slectbytxt
		Thread.sleep(3000);
		//s.selectByVisibleText("26");
		//selct by valu
		s.selectByValue("31");

	}

}
