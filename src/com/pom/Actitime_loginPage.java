package com.pom;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Actitime_loginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//@FindBy(XPath="//input[@id='username']") WebElement UN;
		//@FindBy(xpath= "//input[@name='pwd']") private WebElement Pwd;
		//@FindAll(xpath="//div[text()='Login ']")WebElement Login btn;
		
		
	}

}
