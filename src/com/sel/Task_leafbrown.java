package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_leafbrown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebElement Dd=driver.findElement(By.xpath("//img[@alt='ListBox']"));
		Dd.click();
		Thread.sleep(3000);
		
		
		WebElement index= driver.findElement(By.id("dropdown1"));
		Select op= new Select (index);
		op.selectByIndex(1);
		Thread.sleep(3000);
		
		WebElement op2= driver.findElement(By.name("dropdown2"));
		Select s= new Select(op2);
		s.selectByVisibleText("Appium");
		Thread.sleep(1000);
		
		WebElement op3= driver.findElement(By.id("dropdown3"));
		Select s1=new Select (op3);
		s1.selectByValue("3");
		Thread.sleep(1000);
		
		WebElement option=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s2=new Select (option);
		List<WebElement> getop = s2.getOptions();
		for (WebElement ge : getop) {
			System.out.println(ge.getText());
		}
		Thread.sleep(1000);
		
		WebElement sendky=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sendky.sendKeys("Loadrunner");
		Thread.sleep(1000);
		
		WebElement op4=s.getFirstSelectedOption();
		System.out.println(op4.getText());
					
	}
}