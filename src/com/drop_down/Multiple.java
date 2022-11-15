package com.drop_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(300000));
		d.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		d.manage().window().maximize();
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
		Thread.sleep(4000);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		//create object of select class
		Select p1=new Select(month);
		
		// methods of select class selct by value
		//s.selectByVisibleText("May");
		//selct by vlaue
		//s.selectByValue("6");
		p1.selectByIndex(0);
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

	}

}
