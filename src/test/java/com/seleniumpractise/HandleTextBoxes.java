package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes {

	
	//how to handle textboxes using selenium webdriver
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup(); if browser not opened then only we can use this for particular browsers either chrome, edge, firefox etc

		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();

		driver.get("https://www.github.com/login");
		Thread.sleep(3000);
		//WebElement usernameTxt=driver.findElement(By.id("login_field"));
		WebElement usernameTxt=driver.findElement(By.name("password"));
		
		
		if(usernameTxt.isDisplayed()){
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("Arunareddy");
				String enteredTxt=usernameTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(4000);
				usernameTxt.clear();
				
			
				
		}
			else
				System.err.println("not enabled");
		}
		else 
			System.err.println("Not displayed");
			
		}
	}


