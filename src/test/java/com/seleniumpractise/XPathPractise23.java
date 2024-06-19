package com.seleniumpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathPractise23 {

	
	       private static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//chapter2();
		chapter3();


	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green')",element);
		
	}
	//Types of Xpath
	public static void chapter2() {
		//driver.get("https://www.w3schools.com/");
		//Absolute Xpath
		//highlight(driver, driver.findElement(By.xpath("/html/body/div[3]/a[6]")));

		//relative
		//tagname[@attribute='value']-syntax for relative xpath
		//highlight(driver, driver.findElement(By.xpath("//a[@title='Exercises']")));
       
	}
	
	//Xpath Using Attribute
	public static void chapter3() throws Exception {
		
		driver.get("https://www.w3schools.com/");
		//highlight(driver, driver.findElement(By.xpath("//a[@id='w3-logo']")));//using id locator
		//highlight(driver,driver.findElement(By.xpath("//a[@title='Login to your account']")));//using title attribute
		Thread.sleep(5000);

		//highlight(driver,driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")));
		highlight(driver,driver.findElement(By.xpath("//div[@class='w3-main w3-light-grey']")));//using class locator
		Thread.sleep(5000);
	
		driver.quit();
		
		
		//a[@title]- it shows all the title tags in the html document without using value
		//body/a[@title]-specific title tags
	}

}
