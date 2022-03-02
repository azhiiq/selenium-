package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("ashistd22@gmail.com");
		
		 
        String attribute = emailId.getAttribute("name");
        System.out.println(attribute);
        
        String attribute2 = emailId.getAttribute("value");
        System.out.println(attribute2);
        
        boolean displayed = emailId.isDisplayed();
		System.out.println("Is Displayed:" + displayed);
		
		 WebElement password = driver.findElement(By.name("pass"));
         password.sendKeys("123456789");
       
         emailId.clear();
        
        boolean enabled = password.isEnabled();
        System.out.println("Is Enabled : " + enabled);
        
        WebElement signIn = driver.findElement(By.name("login"));
        
        boolean selected = signIn.isSelected();
        System.out.println("IS Selected :" + selected);
        
         signIn.click();


      
        
      

        
	}

}
