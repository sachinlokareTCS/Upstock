package com.Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customize_box {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//identify drop down or listbox which we need to handle and store it in ref variable
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		//create object of actions class
		Actions act=new Actions(d);
		//click on month
		act.click(month).perform();
		//move upside by one
		act.sendKeys(Keys.ARROW_UP).perform();
		//move on step down
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		//click on october
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		//using actions class we can handle customized list box
//step1: first we need to identify list box  which we need to handle and store it in ref varibale
		//stpe2: create object of actions class 
//i) if want move down then ref of actions class and use send keys method inside it arrow-up. perform()
//ii)same for arrowdown
//then use ref varibele of actions and inside sendkeys method Keys.enter and element get selected
		
		
		
		
		
		

	}

}
