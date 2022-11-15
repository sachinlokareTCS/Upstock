package com.Popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_alert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1323",Keys.ENTER);
		// first we need to switch control of selenium from main webpage to alert popup
		Thread.sleep(3000);
		
		Alert alt = d.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
		String text = alt.getText();
		System.out.println(text);
		
		
		
	}

}
