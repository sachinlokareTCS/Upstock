package com.Popus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 20000",Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();	
	         //take all window together
		Set<String> allwindow = driver.getWindowHandles();
		//arrange all window sequentially using arraylist
		ArrayList<String> al=new ArrayList<String>(allwindow);
		// copy all session id in ref variables
		String A = al.get(0);
		String B = al.get(1);
		String C = al.get(2);
		String D = al.get(3);
		// if we need to handle elements on C window, control switch on it
		driver.switchTo().window(B);
		String text = driver.findElement(By.xpath("//span[text()='Add to Cart']")).getText();
		System.out.println(text);
		}
	}
