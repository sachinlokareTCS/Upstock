package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {//User Logic Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
				
			// Create the object of Login page
		    LoginPage lp=new LoginPage(driver);
		    
				lp.enterUserName();
				lp.enterPassWord();
				lp.clickonButton();


	}

}
