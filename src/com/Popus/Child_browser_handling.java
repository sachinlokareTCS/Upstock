package com.Popus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_handling {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	   d.get("https://www.flipkart.com/");
	 
	   //click on cancel (x)button
	   d.findElement(By.xpath("//button[text()='✕']")).click();
	   //search for mobiles
	   d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
	  
	   //click on first mobile
	   d.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	  
	   d.findElement(By.xpath("(//div[text()='vivo T1 5G (Rainbow Fantasy, 128 GB)'])[2]")).click();
	   
	   d.findElement(By.xpath("//div[text()='vivo T1 44W (Ice Dawn, 128 GB)']")).click();
	   
	  
	   
	   d.findElement(By.xpath("//div[text()='vivo T1 44W (Starry Sky, 128 GB)']")).click();
	  
	   d.findElement(By.xpath("(//div[text()='vivo T1 5G (Starlight Black, 128 GB)'])[1]")).click();
	   Thread.sleep(5000);
	  Set<String> sessionid = d.getWindowHandles();
	  ArrayList<String> id=new ArrayList<String>(sessionid);
	  String main = id.get(0);
	  String first = id.get(1);
	  String second=id.get(2);
	  String third=id.get(3);
	  d.switchTo().window(first);
	  d.close();
	// d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	 //d.switchTo().window(main);
	//  d.switchTo().newWindow(WindowType);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	   
	}

}
