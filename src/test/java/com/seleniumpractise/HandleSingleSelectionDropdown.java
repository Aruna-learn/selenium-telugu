package com.seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSingleSelectionDropdown {
//handle single selection dropdown
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Thread.sleep(3000);

		Select courseDropdown = new Select(courseElement);// select class used for the dropdown option get and used all
															// the select class methods to select options

		List<WebElement> courseDropdownoptions = courseDropdown.getOptions();// print all elements in dropdown

		for (WebElement option : courseDropdownoptions) {
			System.out.println(option.getText());
		}
		Thread.sleep(3000);

		courseDropdown.selectByIndex(2);// we can select dropdown by 3ways index, value visibletext
		Thread.sleep(3000);

		courseDropdown.selectByValue("python");
		Thread.sleep(3000);

		courseDropdown.selectByVisibleText("Java");
		Thread.sleep(3000);
		


		String selectedText = courseDropdown.getFirstSelectedOption().getText();// selected options get
		System.out.println("selected text will be:" + selectedText);

	}

}
