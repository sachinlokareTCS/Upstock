package com.Popus;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	   d.get("https://www.flipkart.com/");
	   //click on cancel (x)button
	   d.findElement(By.xpath("//button[text()='✕']")).click();
	   //search for mobiles
	   d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
	   Thread.sleep(3000);
	   //click on first mobile
	   d.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	   Thread.sleep(3000);
		//by default selenium control ids  on main window we need to take all window
	   Set<String> allwindows = d.getWindowHandles();
	   Thread.sleep(3000);
	   //using arraylist we can store all window sequentially
	   ArrayList<String> al=new ArrayList<String>(allwindows);
	   // i want to print address of main window
	   Thread.sleep(3000);
	   String mainwindow = al.get(0);
	   Thread.sleep(3000);
	   System.out.println(mainwindow);
	   String childwindow = al.get(1);
	   System.out.println(childwindow);
	   // if we want to handle child browser control should switch on child browser
	   
	   d.switchTo().window(childwindow);

	}

}
