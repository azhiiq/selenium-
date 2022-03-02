package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumproject1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumproject\\Driver\\chromedriver.exe");
	
	
	//Browser  Launch
	WebDriver driver = new ChromeDriver();
	
	//get
	driver.get("https://www.amazon.in/");
	
	//maximize
	driver.manage().window().maximize();
	
	//navigate
	driver.navigate().to("https://www.myntra.com/login");
	
	//Back
	driver.navigate().back();
	
	//getTitle
	String title = driver.getTitle();
	System.out.println("Title is: "+title);
	
	driver.navigate().forward();
	
	// get CurrentUrl
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("CurrentUrl is:" +currentUrl);
	
	Thread.sleep(2000);
	
	//refresh
	driver.navigate().refresh();
	
	//close
	driver.close();

	
}
}