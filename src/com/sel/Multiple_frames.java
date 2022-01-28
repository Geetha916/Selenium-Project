package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		click.click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));

		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement find = driver.findElement(By.xpath("//input[@type='text'][1]"));
		find.sendKeys("success");			
	
	}
}