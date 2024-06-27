package com.seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotUtils {

	public static void capture(WebDriver driver, String filename ) throws Exception {
		
		
		//instead of writing code again and again and  code reusability we created CaptureScreenshotUtils class it is applicable for entire project the repeated code in the screenshotwebdriver.java class we take and write here then simply we call this class in that class to simplify the code
		
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
		File sourcefile=takeScreenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(sourcefile, destfile);//copy file
		//destfile=new File("./Screenshots/img4.jpg")
		FileUtils.copyFile(sourcefile, new File("./Screenshots/"+filename+""));
		
		

	}

}
