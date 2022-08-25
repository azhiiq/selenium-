package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandls {

	public static void main(String[] args) {
		
		
		
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		 driver.manage().window().maximize();
		 
		 Actions ac = new Actions(driver);
		 
		 
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 
		WebElement makup = driver.findElement(By.xpath("//*[text()='makeup']"));
		 
		 ac.moveToElement(makup);
		 
		 ac.build().perform();
		 
		 WebElement Fp = driver.findElement(By.xpath("//*[text()='Face Primer']"));
		 
		 Fp.click();
		 
		 
		 JavascriptExecutor js=  (JavascriptExecutor)driver;
		 
		 js.executeScript("windows.scrollBy(0,500)", "");
		 
		 
		 //WebElement PS = driver.findElement(By.xpath("//*[@class='wishlist_button_text css-10vr0dt'] // following::*[text()='Preview Shades'][5]"));
		
		// PS.click();
		 
		 
		 
	}

}
