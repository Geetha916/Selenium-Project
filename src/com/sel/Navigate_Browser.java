package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		//upcasting
		//parent               //child
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//navigate
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

		
	}
		
	}

