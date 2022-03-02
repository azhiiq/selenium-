package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//single frame
		driver.switchTo().frame("SingleFrame");
		
		WebElement Textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		Textbox1.sendKeys("marteena");
		
		//default Content-from frame to main page
		
		driver.switchTo().defaultContent();
		
		//Multi Frames
		
		WebElement iframebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframebutton.click();
		
		//Switch to outer frame 
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		//switch to inner frame
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement Textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		Textbox2.sendKeys("Mohammed Ashiq");
		
		//parent frame---inner to outer frame
		driver.switchTo().parentFrame();
		
		//main page
		driver.switchTo().defaultContent();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
