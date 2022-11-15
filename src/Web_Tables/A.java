package Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Lokare\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("file:///C:/Users/Sachin%20Lokare/OneDrive/Documents/Data.html");
//print student name
String sn = d.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
System.out.println(sn);
//print city name
String ct= d.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
System.out.println(ct);
//print samiksha
String n = d.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
System.out.println(n);
String n1 = d.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
System.out.println(n1);
//print particular row data
String row = d.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
System.out.println(row);

	}

}
