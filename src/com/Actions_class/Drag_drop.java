package com.Actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//inspect first element
		
		WebElement ele1 = d.findElement(By.xpath("//div[@id='draggable']"));
		
		//inspect 2nd element
		WebElement ele2 = d.findElement(By.xpath("//div[@id='droppable']"));
		//create object of Actions class
		
		Actions act=new Actions(d);
		Thread.sleep(3000);
		
		act.dragAndDrop(ele1, ele2).perform();

	}

}
