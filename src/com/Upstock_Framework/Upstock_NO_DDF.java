package com.Upstock_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstock_NO_DDF {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://login-v2.upstox.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.findElement(By.xpath("//input[@id='userCode']")).sendKeys("262306");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("M@lind321");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='yob']")).sendKeys("1994");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		String expT = "Upstox Pro";
		String actT = d.getTitle();
		if(actT.equals(expT)) {
			System.out.println("User navigate to home page and Test case is Pass");
		}
		else {
			System.out.println("Test Case is Fail");
		}

	}

}
