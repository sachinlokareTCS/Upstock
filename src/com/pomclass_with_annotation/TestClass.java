package com.pomclass_with_annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestClass{
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	HomePage h;
	
	@BeforeClass
	public void openbrowse() throws Throwable{
		FileInputStream f=new FileInputStream("C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\Sachu.xlsx");
		sh = WorkbookFactory.create(f).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.actitime.com/login.do");
		l=new LoginPage(driver);
		h=new HomePage(driver);
		}
	@BeforeMethod
	public void openapp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickLoginBtn();
	}
	@Test
	public void Testcase() {
		Reporter.log("running TC1",true);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String actText = h.verifytext();
		Assert.assertEquals(expText, actText,"if both are different then TC fails");
		
	}
	@AfterMethod
	public void closeapp() {
		Reporter.log("close app",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close browser",true);
	}

}
