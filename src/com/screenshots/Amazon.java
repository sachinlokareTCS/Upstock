package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.com/");
		TakesScreenshot ts=(TakesScreenshot)d; //typecast here
		//use screenshot method and store in src
		File src = ts.getScreenshotAs(OutputType.FILE);
		//give path of folder where we need to store
		
		File dest = new File("C:\\Users\\Sachin Lokare\\OneDrive\\Desktop\\Screenshots//amazon.jpg");
	    //copy screenshot src to dest
		Files.copy(src, dest);
	
	}

}
