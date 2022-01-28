package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		WebElement user= driver.findElement(By.xpath("//input[@maxlength='75']"));
		user.sendKeys("Geetha");
		
		WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456789");
		
		WebElement log= driver.findElement(By.xpath("//div[text()='Log In']]"));
		log.click();
		
		
		
	}
}

