package com.seleniumpractise;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeout {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS)
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(-12));// if we give duration in neagative it shows
																			// invalid argument exception
		driver.manage().window().maximize();

		Instant starttime = Instant.now();// take time before page loads
		System.out.println(starttime.toString());

		// driver.get("https://seleniumautomationtester.wordpress.com/2017/03/29/java-programs-asked-in-interviews/");
		// driver.get("https://www.royalmansour.com/en");//pageloadtimeoutexception if
		// the time limit to open page exceeds the page to overcome this we can write
		// code as like in after webdriver line no 17 and 18 so we can restrict the time
		// to load page
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Instant endtime = Instant.now();// take time after page loads
		System.out.println(endtime.toString());

		Duration duration = Duration.between(starttime, endtime);// difference time between start and end
		System.out.println("page load time: " + duration.toSeconds() + "seconds");

		System.out.println(driver.getTitle());// get title
		driver.quit();

	}

}

//1.default max time limit is 300seconds w3c webdriver timeouts refer
//2. if exceeds time get the timout exception, for url driver.get("https://www.royalmansour.com/en");
//3.if negative number gives shows the invalid argument.negative number exception, 		//driver.manage().timeouts().pageLoadTimeout(-5, TimeUnit.SECONDS)
