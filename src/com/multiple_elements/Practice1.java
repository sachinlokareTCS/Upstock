package com.multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int count=0;
		d.get("https://www.amazon.com/");
		
		List<WebElement> E = d.findElements(By.xpath("//div"));
		
		for( WebElement c:E) {
		String s = c.getText();
		System.out.println(s);
		count++;
			
		}
		System.out.println(count);

	}

}
