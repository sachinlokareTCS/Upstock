package com.Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement element = d.findElement(By.xpath("//a[text()='Gmail']"));
		 
		Actions v=new Actions(d);
		v.contextClick(element).perform();

	}

}
