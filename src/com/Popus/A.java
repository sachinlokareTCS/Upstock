package com.Popus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile under 20K",Keys.ENTER);
	    
// Print 1st mobile Price	    
	    
	    String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	    
	    System.out.println(price);
	    
// Print Title	    
	    
	    String Title = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
	    
	    System.out.println(Title);
	    
//1 child
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

//2 child
	     driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();

//3	 child
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();

//4	 child
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();

//5	 child   
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")).click();

//copy session id
        Set<String> ids =driver.getWindowHandles();
        
        ArrayList<String> id =new ArrayList<String>(ids);
    	
    	String main = id.get(0);     //mainwin
    	String child1 = id.get(1);    //child1
    	String child2 = id.get(2);    //child2
    	String child3 = id.get(3);    //child3
    	String child4 = id.get(4);    //child4
    	String child5 = id.get(5);    //child5
    	
// move control from main to any child    	
    	
    	driver.switchTo().window(child4);
    	
    	
    	//driver.switchTo().window(child1);
    	
    	
    	

	}

}
