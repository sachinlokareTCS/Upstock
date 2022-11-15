package com.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //impliciit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //delete all coockies
	    driver.manage().deleteAllCookies();
	    //maximize 
	    driver.manage().window().maximize();
	    //open the application
	    driver.get("https://demo.actitime.com/login.do");
	    //enter username
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    //enter password
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    //click on login btn
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    //add something on home page
	    driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("sachin");
	    //actual title
	    String act = driver.getTitle();
	    System.out.println(act);
	    //exp title
	    String exp="actiTIME - Enter Time-Track";
	    //compare both
	    if(exp.equals(act)) {
	    	System.out.println("TC is pass");
	    }
	    else {
	    	System.out.println("TC is fail");
	    }
	}
	    
	

	}


