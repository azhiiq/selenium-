package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		UN.sendKeys("Ashiqashi");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys("ashiqteena");
		
		WebElement Login = driver.findElement(By.xpath("//input[@type='Submit']"));
		Login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByValue("Paris");
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s2 =new Select(hotels);
		s2.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByValue("Super Deluxe");
		
		WebElement Norm = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(Norm);
		s4.selectByValue("1");
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.sendKeys("05/05/2022");
		
		WebElement chckout = driver.findElement(By.id("datepick_out"));
		chckout.sendKeys("10/05/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("1");
		
		//WebElement Sub = driver.findElement(By.id("Submit"));
		//Sub.click();
		
		WebElement Radiobtn = driver.findElement(By.id("radiobutton_0"));
		Radiobtn.click();
		
		//Thread.sleep(3000);
		
		WebElement Conti = driver.findElement(By.xpath("//input[@type='submit']"));
		Conti.click();
		
		WebElement FN = driver.findElement(By.xpath("//input[@name='first_name']"));
		FN.sendKeys("Mohammed Ashiq");
		
		WebElement LN = driver.findElement(By.id("last_name"));
		LN.sendKeys("Teena");
		
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("kovaipudur");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234567890987654");
		WebElement ccno = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(ccno);
		s7.selectByValue("AMEX");
		
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select s8 =  new Select(exp);
		s8.selectByValue("4");
		WebElement expd = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expd);
		s9.selectByValue("2022");
		
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("221");
		
		//Thread.sleep(3000);
		
		WebElement BOKNW = driver.findElement(By.id("book_now"));
		BOKNW.click();
		
		WebElement iti = driver.findElement(By.id("my_itinerary"));
		iti.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Selenium\\Seleniumproject\\Screenshots\\adactin.png");
		
		FileUtils.copyFile(src, dest);
		
	}

}
