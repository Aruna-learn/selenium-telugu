package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeElementsPropertiesTagAttributeCSS {

	//How to get TagName, HTML Attribute value, css value, text using selenium webdriver
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://github.com/login");
		 
		 //TagName
		 System.out.println(driver.findElement(By.name("commit")).getTagName());
		 
		 
		 
		 
		 //HTML Attribute value
		 System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		 
		 
		 
		 
		 //text box text
		WebElement usertxt=driver.findElement(By.id("login_field"));
		Thread.sleep(3000);
		usertxt.sendKeys("aruna@gmail.com");
		System.out.println(usertxt.getAttribute("value"));
		 
		 
		//text other than textbox
		
		//System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceeding-sibling::label")).getText());
		
		
		//css value
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
