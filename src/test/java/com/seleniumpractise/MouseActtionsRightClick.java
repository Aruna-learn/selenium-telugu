package com.seleniumpractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActtionsRightClick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(5000);
		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();//right click or context click
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//li[.='Edit']")).click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();//switch to alert
//		System.out.println(alert.getText());
//		alert.accept();
		
		driver.findElement(By.xpath("//li[.='Paste']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();//switch to alert
		System.out.println(alert.getText());
		alert.accept();
		
		

	}

}
