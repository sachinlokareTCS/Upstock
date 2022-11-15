package com.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	       WebDriver m=new ChromeDriver();
	       m.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       
	       m.manage().window().maximize();
	       //switch to first frame
	       m.switchTo().frame("packageListFrame");
	       //tak any element and print it to confrim we are on frist frame
	       
	       
      String text1 = m.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	 Thread.sleep(3000);
      System.out.println(text1);
      //now we need to switch from frist frame to main frame
      m.switchTo().defaultContent();// now again we came to main page
      
      //switch to 2nd frame
      Thread.sleep(3000);
      m.switchTo().frame("packageFrame");
      //take any el
     String text2 = m.findElement(By.xpath("//a[text()='AddHasCasting']")).getText();
     Thread.sleep(3000);
     System.out.println(text2);
     //go to 3rd frame
     m.switchTo().defaultContent();
     m.switchTo().frame("classFrame");
     
   String text3 = m.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
     
   System.out.println(text3);
      
      
	
	}
	

}
