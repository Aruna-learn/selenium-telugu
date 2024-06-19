package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlealerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		// alert box

//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
//		Thread.sleep(3000);
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		
		
//confirm box
//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();//ok button
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
//		Thread.sleep(3000);
//
//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();//cancel button
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("output")).getText());// prints output
//		
		
		
		//prompt box
		
		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Aruna Reddy");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//ok button
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Aruna Reddy");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();//cancel button
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());// prints output
		Thread.sleep(3000);
		
		
		
	}

}
