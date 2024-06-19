package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathpractise9 {

		private static WebDriver driver;
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			chapter9();
			

	}
		public static void highlight(WebDriver driver, WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",
					element);

		}
		
		//X path shortcuts
		public static void chapter9() throws Throwable {
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			highlight(driver,driver.findElement(By.xpath("//h1[.='Register']")));//h1[text()='Register']// instead of text() use .
			
			//text .
		       //a[contains(text(),'account')]
			highlight(driver,driver.findElement(By.xpath("//a[contains(.,'account')]")));
			
			
			//td[starts-with(text(),'Giovanni Rovelli')]
			highlight(driver,driver.findElement(By.xpath("//td[starts-with(.,'Giovanni Rovelli')]")));	
			
			//label[normalize-space(text(),'First Name ')]
			//highlight(driver,driver.findElement(By.xpath("//label[normalize-space(.,'First Name')]")));
			
			
			
			//child >  /
			highlight(driver,driver.findElement(By.xpath("//div[@class='container']/child::h1 ")));
			highlight(driver,driver.findElement(By.xpath("//div[@class='container']/h1 ")));
			highlight(driver,driver.findElement(By.xpath("//div[@class='container']/a")));
			highlight(driver,driver.findElement(By.xpath("//div[@class='container']/*")));
			
			
			
			
			//parent > /..
			//*[@id="post-body-299858861183690484"]/div/form/div[1]/label[4]
			highlight(driver,driver.findElement(By.xpath("//h1[.='Register']/..")));
			
			
			//descendent //
			
			highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/descendent::td ")));
			highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']//td")));
			
			
			List<WebElement> elements = driver.findElements(By.xpath("//table[@id='contactList']//td"));
			for (WebElement element : elements) {
				highlight(driver, element);//all 30cells will highlight
			
			Thread.sleep(3000);
			driver.quit();
		}

}
		
}
