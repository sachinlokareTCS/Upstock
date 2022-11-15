package com.Popus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	   d.get("https://www.flipkart.com/");
	   
	   //click on cancel button of popup
	   d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	

	}

}
