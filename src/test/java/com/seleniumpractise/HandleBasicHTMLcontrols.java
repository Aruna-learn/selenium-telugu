package com.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBasicHTMLcontrols {

	public static void main(String[] args) throws Throwable {

		// how to handle link, button, radio button, checkbox using selenium webdriver
		// WebDriverManager.chromedriver().setup(); if browser not opened then only we
		// can use this for particular browsers either chrome, edge, firefox etc
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichk = driver.findElement(By.id("hindichbx"));
		hindichk.click();//check hindi button
		Thread.sleep(3000);

		if (hindichk.isSelected()) {
			hindichk.click();//uncheck hindi button
		}

		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);

		driver.findElement(By.linkText("Click here to navigate to the home page")).click();

	}

}
