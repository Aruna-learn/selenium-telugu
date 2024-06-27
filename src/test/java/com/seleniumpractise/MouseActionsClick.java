package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsClick {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		
	   WebElement compon=	driver.findElement(By.linkText("Components"));// mouseover
	   Thread.sleep(3000);
		WebElement camera = driver.findElement(By.xpath("//a[normalize-space()='Web Cameras (0)']"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(compon).moveToElement(camera).click().perform();
		Thread.sleep(3000);
		
		
		
		//double click
//		WebElement doublecick = driver.findElement(By.name("q"));
//		doublecick.sendKeys("Aruna");
//		Thread.sleep(3000);
//
//		action.doubleClick(doublecick).perform();



	}

}


//for orangehrm website we have login
//driver.get("https://opensource-demo.orangehrmlive.com/");
//Thread.sleep(5000);
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

//we are using webiste without login and perform mouseover
//https://www.canva.com/en_in/