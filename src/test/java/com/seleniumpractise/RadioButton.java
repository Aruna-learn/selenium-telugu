package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='radio-button1']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='radio-button2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='radio-button3']")).click();

	}

}
