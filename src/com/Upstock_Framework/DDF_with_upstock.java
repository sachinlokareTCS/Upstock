package com.Upstock_Framework;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_with_upstock {
	public static void main(String[] args) throws Throwable {
		// Parameterization
		FileInputStream fl=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\ddf.xlsx");
       Sheet sh = WorkbookFactory.create(fl).getSheet("Sheet1");
       //set the properties
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://login-v2.upstox.com/");
		//enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		d.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
		//enter pwd
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		String dob = sh.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='yob']")).sendKeys(dob);
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		String expT = sh.getRow(0).getCell(3).getStringCellValue();
		String actT = d.getTitle();
		if(actT.equals(expT)) {
			System.out.println("User Navigate to Homepage TC Is Pass");
		}
		else {
			System.out.println("Test case is fail");
		} 
	}

}
