package com.seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicittimeout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(new Duration(6,Duration.seconds));
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();//click on button1//loads in 5sec
		driver.findElement(By.id("txt1")).sendKeys("Aruna Reddy");//driver not waits the time to load txt1 box throws no such element exception to over come this we use implicit time at driver initialization level onetime only and it applicable for whole browser session so it waits that time and not load elements in that time it throws exceptions then
				
		driver.findElement(By.id("btn2")).click();//click on button1
		driver.findElement(By.id("txt2")).sendKeys("Aruna");//loads in 10sec i give 11seconds so no error otherweise we get an error
		
	}

}

//selenium follows the w3c webdriver protocol in that for implicit timeou default time is 0sec
