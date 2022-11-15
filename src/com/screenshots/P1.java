package com.screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class P1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.mphasis.com/home.html");
		TakesScreenshot ts=(TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sachin Lokare\\OneDrive\\Desktop\\Screenshots//logo.png");
		Files.copy(src, dest);

	}

}
