package com.POM_pagefactory_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\ddf.xlsx");
		Sheet sh = WorkbookFactory.create(f).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//1st object
		String username = sh.getRow(1).getCell(0).getStringCellValue();
		LoginPage1 l1=new LoginPage1(driver);
		l1.enterUN(username);
		
		String password = sh.getRow(1).getCell(1).getStringCellValue();
		l1.enterPWD(password);
		
		l1.clickLoginBtn();
       //2nd object
		String expText = sh.getRow(1).getCell(2).getStringCellValue();
		HomePage1 h=new HomePage1(driver);
		h.verifytext(expText);
		}


	}


