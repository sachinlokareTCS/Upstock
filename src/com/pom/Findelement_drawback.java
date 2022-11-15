package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement_drawback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		//we need to refresh page==
		//whenever we refresh page at that new page new session id will be created
		//but FE/FE's method doesn't have ability to capture updated session ID,hence we will
		//end up with staleelement reference exception
		driver.navigate().refresh();
		//now we can write username boss we will get stale element reference exception
		UN.sendKeys("admin");

	}

}
