package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("Geetha916@gamil.com");
		
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("Geetha916");
		
		WebElement log= driver.findElement(By.name("Log In"));
		log.click();	

	}
}

