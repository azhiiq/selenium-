package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
           WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men'][@class='desktop-main']"));

		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(men).build().perform();

		
		//a[text()='Jeans']
		
		//#desktop-header-cnt > div.desktop-bound > nav > div > div:nth-child(1) > div > div > div > div > li:nth-child(2) > ul > li:nth-child(2) > a
		
		//*[c@id="desktop-header-nt"]/div[2]/nav/div/div[1]/div/div/div/div/li[2]/ul/li[2]/a
		
		
		
		
		
		
		
		
	}

}
