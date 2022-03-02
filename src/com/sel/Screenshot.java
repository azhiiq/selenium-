package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 //method to take screen shot
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 //location
		 File loc = new File("C:\\Selenium\\Seleniumproject\\Screenshots\\youtube.png");
		 FileUtils.copyFile(src,loc);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
