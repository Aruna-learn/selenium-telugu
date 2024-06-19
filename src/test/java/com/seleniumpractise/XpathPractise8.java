package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractise8 {

	
		private static WebDriver driver;
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			chapter8();

	}
		
		
		
		public static void highlight(WebDriver driver, WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",
					element);

		}
		//Xpath Axes
		public static void chapter8() throws Exception {
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			
			//Following-sibling
		//highlight(driver,driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));//using email find the textbox
		
		//Preceedng-sibling
	//driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();;//finding checkbox using the Francisco chang element
		
			
			//child
		//highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/child::tr")));//child element find

		//parent
		//		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/parent::tr")));//parent element find
		
		
		//Ancestor(parent and grand parents)
		
		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::tr")));
		System.out.println(driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::tr")));
//		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::div")));
//		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::*")));
//		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::td")));
		
		//ancestor or self
//		highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor-or-self::*")));//it includes helen and prints the results, helen element also highlights
		
		//descendent(child and grand child)
		
		//highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/descendent::*")));
		//System.out.println(driver.findElement(By.xpath("//table[@id='contactList']/descendent::*")));
		
//		highlight(driver,driver.findElement(By.xpath("//table[@id='contact list']/descendent::tr")));
//		highlight(driver,driver.findElement(By.xpath("//table[@id='contact list']/descendent::td")));

		
		
		//descendent or self
	//	highlight(driver,driver.findElement(By.xpath("//table[@id='contact list']/descendent-or-self::*")));//includes the element and give results

		
		
		//following
		//highlight(driver, driver.findElement(By.xpath("//label[text()='Password']/following::input")));
		
		//preceeding
		//highlight(driver, driver.findElement(By.xpath("//label[text()='Password']/preceding::input[1]")));
		
		Thread.sleep(3000);	
		driver.quit();	
		}

}
