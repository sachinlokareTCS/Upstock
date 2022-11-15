package com.Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiole_elelistbox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement day=d.findElement(By.xpath("//select[@id='day']"));
		//identify drop down or listbox which we need to handle and store it in ref variable
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Actions act=new Actions(d);
		act.click(day).perform();
		//move upside by one
		act.sendKeys(Keys.ARROW_UP).perform();
		//move on step down
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		act.click(month).perform();
		//move upside by one
		act.sendKeys(Keys.ARROW_UP).perform();
		//move on step down
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
	
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		act.click(year).perform();
		//move upside by one
		act.sendKeys(Keys.ARROW_UP).perform();
		//move on step down
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
