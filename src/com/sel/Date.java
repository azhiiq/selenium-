package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
	
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Seleniumproject\\Driver3\\chromedriver.exe");
		 WebDriver driver  = new ChromeDriver();
		 driver.get("https://www.clinique.in/product/1687/83690/skin-care/moisturizers/new-moisture-surgetm-100h-auto-replenishing-hydrator?size=15_ml");
		 driver.manage().window().maximize();
		 
		//WebElement img = driver.findElement(By.xpath("(//*[local-name()='svg'])[4]"));
		
		WebElement img = driver.findElement(By.xpath("(//a[contains(@class,'header')])[12]"));
		img.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
