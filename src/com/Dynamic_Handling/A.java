package com.Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Lokare\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//d.get("https://covid19.who.int/?gclid=Cj0KCQjwhY-aBhCUARIsALNIC07sfXHsc0u5-uQII2zngHfD4FqA9JQfzML0hvkjaVlhRDB6GFxC2PgaAuyHEALw_wcB");
		d.get("https://www.worldometers.info/coronavirus/country/uk");
		
		String coronavirus= d.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println(coronavirus);
		

		String death= d.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(death);
		

		String recover = d.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(recover);
		

	}

}
