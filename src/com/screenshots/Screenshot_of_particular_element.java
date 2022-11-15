package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_of_particular_element {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		WebElement particular = d.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src = particular.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Sachin Lokare\\OneDrive\\Desktop\\Screenshots//sachin2.jpg");
		Files.copy(src, dest);
		
		

	}

}
