package com.seleniumpractise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendarutilities {
	
	//calendar utility functions
	////dynamically  date selections, that identify valid invalid previous future date and rturn output code duplication reduced

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		driver.findElement(By.id("first_date_picker")).click();
		selectdate(driver,"09/June/2021");//dynamically  date selections, that identify valid invalid previous future date and rturn output code duplication reduced
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("second_date_picker")).click();
		selectdate(driver, "05/June/2025");
		
		
		
	}
		
		public static void selectdate(WebDriver driver, String Date) throws Exception {
			
			Calendar cal = Calendar.getInstance();
			try {
				SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
				targetDateFormat.setLenient(false);
				Date formatteddate = targetDateFormat.parse(Date);
				cal.setTime(formatteddate);
			} catch (ParseException e) {
				//throw new Exception("invalid date");
			}

				int targetmonth = cal.get(cal.MONTH);
				int targetyear = cal.get(cal.YEAR);

				driver.findElement(By.id("first_date_picker")).click();
				//select current year
				String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();//read current date
				cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				int currentMonth = cal.get(Calendar.MONTH);
				int currentYear = cal.get(Calendar.YEAR);
				int targetDay = cal.get(Calendar.DAY_OF_MONTH);
				
				while(currentMonth <targetmonth || currentYear < targetyear) {// if current month or year less than target then click on next nd select the target month or year
					driver.findElement(By.className("ui-datepicker-next")).click();	
					
					 currentDate = driver.findElement(By.className("ui-datepicker-title")).getText(); //after click on next update the date info in runtime and removewd the int string declarations and using directly
					cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
					 currentMonth = cal.get(Calendar.MONTH);
					 currentYear = cal.get(Calendar.YEAR);
				
				
				}
				
				
				while(currentMonth > targetmonth || currentYear > targetyear) {//// if current month or year greater than target then click on previous nd select the target month or year
					driver.findElement(By.className("ui-datepicker-prev")).click();
					currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();//after click on next update the date info in runtime and removewd the int string declarations and using directly
					cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
					currentMonth = cal.get(Calendar.MONTH);
					currentYear = cal.get(Calendar.YEAR);
				}
//				if(currentMonth == targetmonth && currentYear == targetyear)
//					driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
//				
				
				
				
				
				
				
				
				
				
				
				
				

			
			Thread.sleep(4000);
			driver.quit();

		}
		
		
	}


