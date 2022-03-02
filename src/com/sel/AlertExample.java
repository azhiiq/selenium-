package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		//simple alert
		WebElement Button1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		Button1.click();
		
		Thread.sleep(2000);
		
		Alert Simplealert = driver.switchTo().alert();
		Simplealert.accept();
		
		//Confirm alert
		WebElement Button2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		Button2.click();
		
		Thread.sleep(2000);
		
		Alert ConfirmAlert = driver.switchTo().alert();
		//ConfirmAlert.accept();
		ConfirmAlert.dismiss();
		
		//prompt alert
		WebElement Button3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		Button3.click();
		
		Thread.sleep(2000);
		
		Alert PromptAlert = driver.switchTo().alert();
		//PromptAlert.sendKeys("web");
		String text = PromptAlert.getText();
		System.out.println(text);
		PromptAlert.accept();
		
				
	}

}
