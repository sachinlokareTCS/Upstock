package com.Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement element = d.findElement(By.xpath("//a[text()='Gmail']"));
		 
		Actions v=new Actions(d);
		Thread.sleep(3000);
		//we are performing multiple actions within single statement using build method
		v.moveToElement(element).contextClick().click().build().perform();

		// actions class have 3 methods 1) movetoelement curser move thst particular element
		//2) conetextclieck method wwhich will be right click for that element
		//draganddrop method for dragging element in another box 
		//build method used for perform all actions method in single statement
	}

}
  