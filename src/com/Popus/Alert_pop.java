package com.Popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345",Keys.ENTER);
		
		//use alert interface
		Alert alt=d.switchTo().alert();
		//want to click on button
		//alt.accept();//automatically ok button will be clicked
		//click on cancel button
		Thread.sleep(3000);
		//alt.dismiss();
		//get the text on popup
		String text = alt.getText();
		System.out.println(text); //apple iphone 14 pro max phone 256 gb

	}

}
