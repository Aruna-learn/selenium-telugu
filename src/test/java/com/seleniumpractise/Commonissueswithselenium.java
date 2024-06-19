package com.seleniumpractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonissueswithselenium {

	public static void main(String[] args) {
		
		//1.WebDriver driver=new ChromeDriver();//webdriver cananot resolved  so type webdriver the ctrl+space selecte the webdriver means import the required statements
		
		//2.chomedriver.exe no downloaded means file poperties see .exe extension then file view chek the file with extension
		//3.set path correctly absolute or relative
		//System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe" );
		//4 if path is not correct or last chromedriver.exe not giving
		//.exe
		//5.check browser version and driver version
		//6.normal java project downlod driver then create folder in project and copy theose driver file then build path we can see in .cache in norma java project and .m2 in maven project
		//7.implicit wait, webdriver wait, pageloadtimeout use with duration.of seconds()
		
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS)
				//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		//8.change jre system library the right click on project- buildpath-confugure-libraries select the libraries or use auto suggestions in eclipse
		
		
		
		
		

	}

}
