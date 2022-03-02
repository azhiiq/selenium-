package com.sel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_MiniProject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+  "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		
		WebElement Text = driver.findElement(By.id("email_create"));
		Text.sendKeys("ashistd22@gmail.com");
		
		WebElement Create = driver.findElement(By.id("SubmitCreate"));
		Create.click();
		
		WebElement Mr = driver.findElement(By.xpath("//label[@for='id_gender1']"));
		Mr.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
