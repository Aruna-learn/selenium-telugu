package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropActionsClass {

	public static void main(String[] args) throws Exception {
		//we can perform drag and drop using actions class
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(5000);
		
		WebElement from=driver.findElement(By.id("angular"));
		Thread.sleep(5000);
		WebElement to=driver.findElement(By.id("droparea"));
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
//		act.clickAndHold(from);
//		act.release();//and we have move to element also, click, doubleclick, right or context click
		act.dragAndDrop(from, to).perform();
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());

	}

}
