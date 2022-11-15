package com.Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Customized_box {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		
		Actions a=new Actions(d);
		
		a.click(day).perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).perform();
		

	}

}
