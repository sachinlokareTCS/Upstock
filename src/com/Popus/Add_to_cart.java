package com.Popus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 20000",Keys.ENTER);
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> id=new ArrayList<String>(ids);
	
	String main = id.get(0);
	System.out.println(main);
	
	String child = id.get(1);
	System.out.println(child);
	
	driver.switchTo().window(child);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}



	}

