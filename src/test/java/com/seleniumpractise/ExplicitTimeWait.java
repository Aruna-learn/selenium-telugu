package com.seleniumpractise;

import java.awt.Dimension;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitTimeWait {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofMillis(5000));//DEFAULT_SLEEP_TIMEOUT=500 millisec means it check element and if not found sleep for 500millisec and repeats
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(500));
		
	driver.get("https://www.rainforestqa.com/blog/free-test-automation-tools");
		//driver.get("https://mailosaur.com/blog/getting-started-with-testproject");
	//driver.get("https://www.website.com/sign-in/?source=SC&country=IN");	
		
		String parentwindowhandle=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Log in")).click();
		Set <String> windowhandles=driver.getWindowHandles();
		for (String windowhandle : windowhandles) {
			if(!windowhandle.equals(parentwindowhandle)) {
				driver.switchTo().window(windowhandle);
				
//				Function<WebDriver, Boolean> f=new Function<WebDriver, Boolean>() {//2.If we want to implement function rather than using expected conditions we use this
//
//					public Boolean apply(WebDriver webdriver) {
//						// TODO Auto-generated method stub
//						return webdriver.findElement(By.name("email")).isDisplayed();
//					}
//					
//					
				}
				
				//wait.until(f);
				//wait.until(d->d.findElement(By.name("email")).isDisplayed());//3. we can use lamda expession or anonymous class also for explicit wait
				
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));//1.expected condition by selenium people for explicit wait
			
				driver.findElement(By.name("email")).sendKeys("test@gmail.com");
				System.out.println("email entered successfully");
			}
			
		}
		
		
		
		
		

	}

//To define explicit wait create object in 2 ways
//webdriver wait
   //expected condition
   //function
   //lambda or anonymous function
//fluentwait
