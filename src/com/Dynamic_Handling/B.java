package com.Dynamic_Handling;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.findElement(By.xpath("//button[text()='✕']")).click();
		

		d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
		
		//String text = d.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']/descendant::div)[3]")).getText();
        //System.out.println(text);
	}

}
