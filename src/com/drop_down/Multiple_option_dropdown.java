package com.drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_option_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		//first identify drop down which we need to handle and store it in ref variable
		WebElement multiele = driver.findElement(By.xpath("//select[@id='cars']"));
		//create object of select class
		Select s=new Select(multiele);
		//use methods of select class and select multiple element at a time
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		//if we want to print all element use getallselectedooption method
		List<WebElement> listOfOptions = s.getAllSelectedOptions();
		//use for each loop to print multiple element in drop down
		for(WebElement i:listOfOptions) {
			String text = i.getText();
			System.out.println(text);
			
		}
		

	}

}
