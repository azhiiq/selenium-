package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+  "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/table.html");
		

		driver.manage().window().maximize();
		
		//all data
		System.out.println("**All Data**");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
	   for (WebElement all : alldata) {
		String text = all.getText();
		System.out.println(text);
	}
		
	   //row data
	   System.out.println("**** Row Data****");
	   
	   List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	   
	   for (WebElement row : rowdata) {
		   String text = row.getText();
		System.out.println(text);
	}
		
	   //column data
	   
	   System.out.println("***Column data***");
	   
	   List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
	   
	   for (WebElement column : columndata) {
		   String text = column.getText();
		   System.out.println(text);
		
	}
	   
	   //particular data
	   System.out.println("****particular data****");
	   
	   WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
	   String text = particulardata.getText();
	   System.out.println(text);
	   
	   //headers
	   
	   System.out.println("***Headers***");
	   
	   List<WebElement> headers = driver.findElements(By.tagName("th"));
	   
	   for (WebElement head : headers) {
		   String text2 = head.getText();
		   System.out.println(text2);
		
	}
	 
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
