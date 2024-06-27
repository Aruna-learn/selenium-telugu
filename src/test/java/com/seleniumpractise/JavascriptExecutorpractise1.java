package com.seleniumpractise;


import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorpractise1 {

	public static void main(String[] args) throws Throwable {
		
		//highlight the  elements usng javascript executor
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jsex=(JavascriptExecutor) driver;
		
		//find element js and highlight using js
//jsex.executeScript("document.getElementById('email').style.border='12px pink solid';");//border[if no px provided defaault it takes and solid no means none and color no means black it takes]
//Thread.sleep(3000);
//	jsex.executeScript("document.querySelector('#pass').style.background='green';");	//background
//		
//	Thread.sleep(3000);
//		jsex.executeScript("document.getElementsByName('email').setAttribute('style','border:2px solid red; background:green');");//border +background
//		
		Thread.sleep(3000);
		//find element using webdrier and highlight using js
          WebElement	ele	= driver.findElement(By.id("email"));
         // jsex.executeScript("arguments[0].style.background='green';",ele);
          Thread.sleep(3000);
         // jsex.executeScript("arguments[0].style.border='12px pink solid';",ele);
          Thread.sleep(3000); 
          jsex.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:green');",ele);
		
          
          Thread.sleep(3000);
		//we can remove the highlight also by removing the styling
          jsex.executeScript("arguments[0].setAttribute('style','border:; background:');",ele);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//scroll
		//scrollto 3 types 1.specific position 2. bottom of webpage 3. to element location
//		driver.get("https://www.hyrtutorials.com/");
//		jsex.executeScript("window.scrollTo(0,500)");//specific location
//		Thread.sleep(3000);
//		
//		jsex.executeScript("window.scrollTo(0,document.body.scrollHeight)");//bottom of webpage, using document.body.scrollHeight find the webpage height then scroll according to height to bottom of webpage
//				
//		Thread.sleep(3000);
//		
//		//to element location
//		WebElement element=driver.findElement(By.xpath("//a[text()='Windows Automation']"));
//		jsex.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y);
//		
//		
//		
//		//scrollBy
//		jsex.executeScript("window.scrollBy(0,500)");
//		
//		Thread.sleep(3000);
//		
//		
//		//ScrollIntoView
//		jsex.executeScript("document.getElementById('ty_footer').scrollIntoView();");
//		
//		Thread.sleep(3000);
//		jsex.executeScript("arguments[0].scrollIntoView()", element);//scrollinto view by taking the element

		
//		WebElement usr=driver.findElement(By.id("email"));//find element using selenium webdriver
//		jsex.executeScript("arguments[0].style.background='green';", usr);//perform actions using javascript executor
		
		
          Thread.sleep(8000);
          driver.quit();
		
		
	}

}
