package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemenfindingseightlocators {

	
	//how to find elements using selenium webdriver
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup(); if browser not opened then only we can use this for particular browsers either chrome, edge, firefox etc

         WebDriver driver=new ChromeDriver();
        driver.get("https://www.github.com/login");
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.id("login_field")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.name("password")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.className("header-logo")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.linkText("Forgot password?")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.partialLinkText("Create an")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.tagName("h1")));
        Thread.sleep(4000);
        highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"))); 
        Thread.sleep(4000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));		
       
        
		
	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",element);
		
	}
	
	
}
