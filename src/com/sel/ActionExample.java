package com.sel;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		WebElement But1 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions ac = new Actions(driver);
		ac.click(But1).build().perform();
		
		WebElement But2 = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(But2).build().perform();
		
		WebElement But3 = driver.findElement(By.id("doubleClickBtn"));
		ac.contextClick(But3).build().perform();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement Shoe = driver.findElement(By.xpath("//img[contains(@alt,'aadi Running Shoes For Men')]"));
		ac.moveToElement(Shoe).build().perform();
		
		Thread.sleep(3000);
		
		ac.click(Shoe).build().perform();
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://leafground.com/pages/drop.html");
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(Drag, Drop).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
