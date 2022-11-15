package com.Dynamic_Handling;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); 
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 12",Keys.ENTER);
		
		String price = d.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/descendant::span)[2]")).getText();
		
		System.out.println(price);
		
		
		
		
		
		
	}

}
