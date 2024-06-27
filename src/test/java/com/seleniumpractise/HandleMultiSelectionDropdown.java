package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select idedropdown = new Select(ideElement);

		List<WebElement> idedropdownoptions = idedropdown.getOptions();
		for (WebElement option : idedropdownoptions) {
			System.out.println(option.getText());
             
		}
//		Thread.sleep(3000);
//		idedropdown.selectByIndex(0);// eclipse
//		Thread.sleep(3000);
//		idedropdown.selectByValue("ij");// Intellij Idea
//		Thread.sleep(3000);
//
//		idedropdown.selectByVisibleText("NetBeans");// net beans
//		Thread.sleep(3000);
//		//idedropdown.deselectAll();
//		idedropdown.deselectByVisibleText("IntelliJ IDEA");//multiselection dropdown feature as compared to single dropdown  we can deselect all also, vivible text, value, index
//		Thread.sleep(3000);
//		
//		
//
//		List<WebElement> selectedoption = idedropdown.getAllSelectedOptions();//get all selected option but in single selected we have only get first selected
//		for (WebElement option : selectedoption) {
//			System.out.println("selected visible text-" + option.getText());
//		}

	}

}
//witout using select drop down we can select the options
//List<WebElement> idedropdownoptions = idedropdown.getOptions();
//for (WebElement option : idedropdownoptions) {
//	System.out.println(option.getText());
//     if(option.getText().equals("ij"))
//    	 option.click()
//    	 break;
//}


