package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_HotelBooking {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
    	username.sendKeys("Geethakumar");
    	
    	WebElement password = driver.findElement(By.id("password"));
    	password.sendKeys("Geetha@123");
    	
    	WebElement log = driver.findElement(By.id("login"));
    	log.click();
    	
    	WebElement location = driver.findElement(By.id("location"));
    	Select loc=new Select(location);
    	loc.selectByIndex(6);
    	
    	WebElement hotels = driver.findElement(By.id("hotels"));
    	Select ho=new Select(hotels);
    	ho.selectByIndex(4);
    	
    	WebElement type = driver.findElement(By.id("room_type"));
    	Select ty=new Select(type);
    	ty.selectByIndex(3);
    	
    	WebElement rnumber = driver.findElement(By.id("room_nos"));
    	Select nos=new Select(rnumber);
    	nos.selectByIndex(3);
    	
    	WebElement indate = driver.findElement(By.id("datepick_in"));
    	indate.clear();
    	indate.sendKeys("24/12/2021");
    	
    	WebElement outdate = driver.findElement(By.id("datepick_out"));
    	outdate.clear();
    	outdate.sendKeys("25/12/2021");
    	
    	WebElement adult = driver.findElement(By.id("adult_room"));
    	Select room=new Select(adult);
    	room.selectByIndex(3);
    	
    	WebElement childnum = driver.findElement(By.id("child_room"));
    	Select childroom=new Select(childnum);
    	childroom.selectByIndex(2);
    	
    	WebElement search = driver.findElement(By.id("Submit"));
    	search.click();
   	
    	WebElement table = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
    	WebElement radio = driver.findElement(By.id("radiobutton_0"));
    	radio.click();
    	
        WebElement contin = driver.findElement(By.id("continue"));
        contin.click();
        
        WebElement fname = driver.findElement(By.id("first_name"));
    	fname.sendKeys("Geetha");
    	
    	WebElement lname = driver.findElement(By.id("last_name"));
    	lname.sendKeys("Mani");
    	
    	WebElement address = driver.findElement(By.id("address"));
    	address.sendKeys("No 25,los Angeles, CA");
    	
    	WebElement creditnum = driver.findElement(By.id("cc_num"));
    	creditnum.sendKeys("2536-4256-7888-7157");
    	
    	WebElement cardtype = driver.findElement(By.id("cc_type"));
    	Select cc=new Select(cardtype);
    	cc.selectByIndex(2);
    	
    	WebElement carddate= driver.findElement(By.id("cc_exp_month"));
    	Select cd=new Select(carddate);
    	cd.selectByIndex(4);
    	
    	WebElement cardyear= driver.findElement(By.id("cc_exp_year"));
    	Select cy=new Select(cardyear);
    	cy.selectByIndex(12);
    	
    	WebElement cvv = driver.findElement(By.id("cc_cvv"));
    	cvv.sendKeys("546");
    	
    	WebElement book = driver.findElement(By.id("book_now"));
        book.click();
        
        JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(0, 800)","");
        
        WebElement itinerary = driver.findElement(By.id("my_itinerary"));
        itinerary.click();
    	
    	
    	
    	
        
    	
    	
		
		
		
		
		
		
		
//		WebElement createus = driver.findElement(By.xpath("//td[@class='login_register']"));
//		createus.click();
//		Thread.sleep(3000);
//		
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("Geethamani");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Geetha@123");
//		
//		WebElement confirmpassword = driver.findElement(By.id("re_password"));
//		confirmpassword.sendKeys("Geetha@123");
//		
//		WebElement fullname = driver.findElement(By.id("full_name"));
//		fullname.sendKeys("Geetha Kumar");
//		
//		WebElement email = driver.findElement(By.id("email_add"));
//		email.sendKeys("Geetha@gmail.com");
//		Thread.sleep(3000);
//		
//		WebElement imgcapcha = driver.findElement(By.id("captcha"));
//		Thread.sleep(3000);
//		
//		WebElement capcha = driver.findElement(By.id("captcha-form"));
//		capcha.sendKeys("" + imgcapcha);
//		
//		WebElement check = driver.findElement(By.id("tnc_box"));
//		check.click();
//		
//		WebElement submit = driver.findElement(By.id("Submit"));
//		submit.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
