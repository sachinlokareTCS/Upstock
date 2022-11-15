package com.Upstock_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_Upstock {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://login-v2.upstox.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.findElement(By.xpath("//input[@id='userCode']")).sendKeys("AD2192");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Sachu@1234");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='yob']")).sendKeys("1990");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		

	}

}
