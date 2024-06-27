package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorPractise {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsex=(JavascriptExecutor) driver;//driver object is webdriver type for we hve to typecast here and created reference for javascript executor
	
		//jsex.executeScript(" document.getElementById('email')");//find element using js executor
		
		
		//find element using id
		
		
	//WebElement element=	(WebElement) jsex.executeScript(" return document.getElementById('email')");//after finding element and stores in webelement element and using return stores and see the element and typecasted here
		//element.sendKeys("a@gmail.com");// enter the gmail in textbox
		
		
		//find element using name
		//WebElement element=	(WebElement) jsex.executeScript(" return document.getElementsByName('email')[0]");
		//element.sendKeys("name");
		
		
		//find element using class
		//WebElement element=	(WebElement) jsex.executeScript(" return document.getElementsByClassName('inputtext')[0]");
		//element.sendKeys("class");
//		
//		
//		
//		//find element using tag
//		WebElement element=	(WebElement) jsex.executeScript(" return document.getElementsByTagName('input')[2]");
//		element.sendKeys("tag");
//		
//		
//		//find element using xpath
	//	WebElement element=	(WebElement) jsex.executeScript(" return document.evaluate(\"//input[@id='email']\",document,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue");
//		element.sendKeys("xpath");
//		
//		
//		
//		//find element using css
	//			WebElement element=	(WebElement) jsex.executeScript(" return document.querySelector('#email')");
	//			element.sendKeys("css");
		
		
		
	/*
	 * driver.get("https://www.google.com");
	 * 
	 * JavascriptExecutor jsex=(JavascriptExecutor) driver;
	 * jsex.executeScript("alert('Hello')" );//alert created in google
	 */
		
		//enter text in textbox
//		jsex.executeScript(" document.getElementById('email').value='id';");
//		Thread.sleep(3000);
//		jsex.executeScript("document.getElementsByName('email')[0].value='name';");
//		Thread.sleep(3000);
//
//		jsex.executeScript(" document.getElementsByClassName('inputtext')[0].value='class';");
//		Thread.sleep(3000);
//
//		jsex.executeScript("document.getElementsByTagName('input')[2].value='tag';");
//		Thread.sleep(3000);
//
//		jsex.executeScript("document.querySelector('#email').value='css';");
//		Thread.sleep(3000);
//
//		jsex.executeScript("document.evaluate(\"//input[@id='email']\",document,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");
//		
		
	//click operations	
		//we can find element using js and js click
		//we can find element using webdriver and click
		//we can find elemnt using webdriver and js click
		
		
		//jsex.executeScript("document.getElementsByName('login')[0].click()");//js find and js click
		//driver.findElement(By.name("login")).click();//driver element find and driver click
		
		
	WebElement link=	driver.findElement(By.name("login"));
	jsex.executeScript("arguments[0].click()", link);//driver element find and js click
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	
		

	}

}


//Javascript methods to find elements
//static -id =document.getElementById('email')
//-name=document.getElementsByName('email') to get uniique pass iindex, document.getElementsByName('email')[0]
//-classname=document.getElementsByClassName('inputtext'), document.getElementsByClassName('inputtext')[0]
//tagname=document.getElementsByTagName('input'), document.getElementsByTagName('input')[2]



//dynamic
//css selector= document.querySelector('#email'))using queryselector method
//xpath=document.evaluate("//input[@id='email']",document,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;(using evaluate method)







