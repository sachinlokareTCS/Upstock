package com.multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int count=0;
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[text()='✕']")).click();
		//we need to handle multiple elements
		List<WebElement> allele = d.findElements(By.xpath("//div"));
		// we need to use for each loop
		for(WebElement i:allele) {
			String text = i.getText();
			System.out.println(text);
			count++;
			
		}
		System.out.println(count);
		
		
		

	}

}
