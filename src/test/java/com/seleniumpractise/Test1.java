package com.seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
       WebDriverManager.chromiumdriver().setup();// if browser not opens we use system.set property(in Test.java) manually to over come we ue webdrivermanager
//       WebDriverManager.edgedriver().setup(); 
//       WebDriverManager.firefoxdriver().setup();
//       WebDriverManager.iedriver().setup();
       
       
       WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com");
         driver.getCurrentUrl();
       System.out.println(driver.getTitle()); 
         
         
         
	}

}
