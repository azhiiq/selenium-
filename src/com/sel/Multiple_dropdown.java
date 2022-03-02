package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s= new Select(multiple);
		boolean mul = s.isMultiple();
		System.out.println("Is multiple:" + mul);
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		s.deselectByVisibleText("Loadrunner");
		
		//s.deselectAll();
		
		System.out.println("All options");
		List<WebElement> alloptions = s.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
		}
		
		
		System.out.println();
		System.out.println("All selected Options");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement allselected : allSelectedOptions){
			String text = allselected.getText();
			System.out.println(text);
			
			System.out.println();
			
			System.out.println("First Selected Option");
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text2 = firstSelectedOption.getText();
			System.out.println(text2);
			
		
			
		
			
		}
	}
}


