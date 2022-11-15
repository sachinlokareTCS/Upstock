package com.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		d.manage().window().maximize();
		//we have use switch method for first frame
		d.switchTo().frame("packageListFrame");
		//to confrim its on first frame take any element on first frame
		String text = d.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	    Thread.sleep(3000);
		System.out.println(text);
		
		//now go back to main window frame
		d.switchTo().defaultContent();
		//now go to 2nd frame
		d.switchTo().frame("packageFrame");
		
		//to confrim we are 2nd frame take any element from 2nd frame
		String text2 = d.findElement(By.xpath("//a[text()='AddHasCasting']")).getText();
		Thread.sleep(3000);
		System.out.println(text2);
		//now we have to come on main window of selenium
		d.switchTo().defaultContent();
		//now go on 3rd frame
		d.switchTo().frame("classFrame");
		//to confirm we are on third frame take any element from that frame
		String text3 = d.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
        Thread.sleep(3000);
        System.out.println(text3);
	}

}
