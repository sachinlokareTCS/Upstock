package com.Popus;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	   d.get("https://www.flipkart.com/");
	   d.manage().window().maximize();
	   d.findElement(By.xpath("//button[text()='✕']")).click();
	   d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles below 20000",Keys.ENTER);
	   Thread.sleep(3000);
	   d.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	   Thread.sleep(3000);
	   Set<String> allwindow = d.getWindowHandles();
	   //to arrange all windiw seqeuntially using arraylist
	   ArrayList<String> ids=new ArrayList<String>(allwindow);
	   // we want to peint session id
	   String main = ids.get(0);
	   System.out.println(main);
	   String child = ids.get(1);
	   System.out.println(child);
		
	}

}
