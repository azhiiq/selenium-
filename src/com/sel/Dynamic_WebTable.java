package com.sel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	
	static int indexOfTotal , indexOfRecovered , indexOfActive;
	static String country="USA";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +  "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.worldometers.info/coronavirus/");
	    
	    driver.manage().window().maximize();
	    
	    //all headers 
	    
	    List<WebElement> allheaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
	    
	    for (int i=0; i< allheaders.size(); i++) {
	    	String text = allheaders.get(i).getText();
	    	//System.out.println(text);
	    	
	    	String header = text.replaceAll("\n", " ");
	    	System.out.println(header);
	    
	    if(header.equalsIgnoreCase("Total cases")) {
	    	
	    	indexOfTotal= i;
	    	System.out.println("Index of Total Cases: " + indexOfTotal);
	    	
	    }
	    else if(header.equalsIgnoreCase("total Recorved ")) {
	    	indexOfRecovered= i;
	    	System.out.println("Index of Recovered Cases:"+ indexOfRecovered);
	    	
	    }
	    else if(header.equalsIgnoreCase("Active Cases")) {
	    	indexOfActive= i;
	    	System.out.println("Index of Active Cases:"+ indexOfActive);
	    	}
	    
	    }
	    //traverse into body 
	    // All row
	    List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
	    
	    //Iterate Row
	    
	    for(int i=0; i<allrow.size();i++) {
	    	List<WebElement> alldata = allrow.get(i).findElements(By.tagName("td"));
	    	
	    	//Iterate Column
	    	for(int j=0; j<alldata.size();j++) {
	    		if (alldata.get(j).getText().equalsIgnoreCase(country)) {
	    			System.out.println("Total Cases:"+ alldata.get(indexOfTotal).getText());
	    			System.out.println("Recovered cases:"+ alldata.get(indexOfRecovered).getText());
	    			System.out.println("Active cases:"+ alldata.get(indexOfActive).getText());
	    			
	    		}
	    		
	    	}
	    	
	    }
	    
	 
	    
	    	
	  
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
