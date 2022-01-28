package com.sel;

import java.util.concurrent.TimeUnit;


import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

public class Project_Purchase {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		
		WebElement log = driver.findElement(By.xpath("//a[@class='login']"));
		log.click();
		
       
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Take Screenshot mainpage
		TakesScreenshot screen0= (TakesScreenshot) driver;
		File src0 = screen0.getScreenshotAs(OutputType.FILE);
		File dest0 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp.png");
		FileUtils.copyFile(src0, dest0);
		
		//sign in
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("Geethaa91661@gmail.com");
		
		WebElement Create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		Create.click();
		
		TakesScreenshot screen1= (TakesScreenshot) driver;
		File src1 = screen1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp1.png");
		FileUtils.copyFile(src1, dest1);
		
		WebElement radi = driver.findElement(By.xpath("//label[@for='id_gender2']"));
		radi.click();
		 
		WebElement fn = driver.findElement(By.id("customer_firstname"));
		fn.sendKeys("Geetha");
		
		WebElement Ln = driver.findElement(By.id("customer_lastname"));
		Ln.sendKeys("Manikandan");
		Thread.sleep(3000);
		
		TakesScreenshot screen4= (TakesScreenshot) driver;
		File src4 = screen4.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp2.png");
		FileUtils.copyFile(src4, dest4);
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Geethu@");
		
		WebElement day = driver.findElement(By.id("days"));
		Select send=new Select(day);
		send.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("months"));
		Select mo=new Select(month);
		mo.selectByIndex(11);
		
		WebElement ya = driver.findElement(By.id("years"));
		Select year=new Select(ya);
		year.selectByValue("1994");
		
		WebElement checkb1 = driver.findElement(By.id("newsletter"));
		checkb1.click();
		
		WebElement checkb2 = driver.findElement(By.id("optin"));
		checkb2.click();
		
		TakesScreenshot screen5= (TakesScreenshot) driver;
		File src5 = screen5.getScreenshotAs(OutputType.FILE);
		File dest5 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp3.png");
		FileUtils.copyFile(src5, dest5);
		
		WebElement com = driver.findElement(By.id("company"));
		com.sendKeys("Geethakumar Pvt lmt");
		
		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("Po Box 6099, Lake view road");
		
		WebElement add1 = driver.findElement(By.id("address2"));
		add1.sendKeys("Flintridge road");
		
		WebElement cit = driver.findElement(By.id("city"));
		cit.sendKeys("Los Angeles");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select st=new Select(state);
		st.selectByIndex(5);
		
		WebElement pin = driver.findElement(By.id("postcode"));
		pin.sendKeys("91011");
		
		WebElement num = driver.findElement(By.id("phone"));
		num.sendKeys("+165659862458");
		
		WebElement num1 = driver.findElement(By.id("phone_mobile"));
		num1.sendKeys("+619677105689");
		
		WebElement add2 = driver.findElement(By.id("alias"));
		add2.sendKeys("time square");
		
		WebElement submit = driver.findElement(By.id("submitAccount"));
		submit.click();
		Thread.sleep(3000);
		
		TakesScreenshot screen2= (TakesScreenshot) driver;
		File src2 = screen2.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp4.png");
		FileUtils.copyFile(src2, dest2);
	
    	WebElement cli = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cli);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(0, 800)","");
		
		
		
		WebElement view = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		Actions act=new Actions(driver);
		act.click(view).build().perform();
		
		driver.switchTo().frame(0);
		
		WebElement quan = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		quan.click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select mi=new Select(size);
    	mi.selectByIndex(2);
    	
    	TakesScreenshot screen3= (TakesScreenshot) driver;
		File src3 = screen3.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp5.png");
		FileUtils.copyFile(src3, dest3);
    	
    	WebElement cart = driver.findElement(By.name("Submit"));
    	cart.click();
    	
    	
    	TakesScreenshot screen6= (TakesScreenshot) driver;
		File src6 = screen6.getScreenshotAs(OutputType.FILE);
		File dest6 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp6.png");
		FileUtils.copyFile(src6, dest6);
    	
    	
    	
    	driver.switchTo().defaultContent();
    	
    	WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
    	checkout.click();
    	Thread.sleep(3000);
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	TakesScreenshot screen10= (TakesScreenshot) driver;
		File src10 = screen10.getScreenshotAs(OutputType.FILE);
		File dest10 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp7.png");
		FileUtils.copyFile(src10, dest10);
    	
    	
    	WebElement checkout1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
    	checkout1.click();
    	Thread.sleep(3000);
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	WebElement checkout2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[5]"));
    	checkout2.click();
    	Thread.sleep(3000);
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	WebElement save = driver.findElement(By.id("submitAddress"));
    	save.click();
    	
    	TakesScreenshot screen7= (TakesScreenshot) driver;
		File src7 = screen7.getScreenshotAs(OutputType.FILE);
		File dest7 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp8.png");
		FileUtils.copyFile(src7, dest7);
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	WebElement checkout5 = driver.findElement(By.name("processAddress"));
    	checkout5.click();
    	Thread.sleep(3000);
    	
    
    	WebElement checkbox = driver.findElement(By.id("cgv"));
    	checkbox.click();
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	
    	WebElement checkout4 = driver.findElement(By.name("processCarrier"));
    	checkout4.click();
    	Thread.sleep(3000);
    	
    	TakesScreenshot screen8= (TakesScreenshot) driver;
		File src8 = screen8.getScreenshotAs(OutputType.FILE);
		File dest8 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp9.png");
		FileUtils.copyFile(src8, dest8);
    	
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
    	payment.click();
    	
    	TakesScreenshot screen11= (TakesScreenshot) driver;
		File src11 = screen11.getScreenshotAs(OutputType.FILE);
		File dest11 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp.png");
		FileUtils.copyFile(src11, dest11);
		
    	js.executeScript("window.scrollBy(0, 900)","");
    	
    	WebElement placeorder = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
    	placeorder.click();
    	
    	TakesScreenshot screen9= (TakesScreenshot) driver;
		File src9 = screen9.getScreenshotAs(OutputType.FILE);
		File dest9 = new File("D:\\Data\\Downloads\\eclipse-jee-2019-06-R-win32-x86_64\\eclipse\\Selenium_Concept\\Pic\\sanp10.png");
		FileUtils.copyFile(src9, dest9);
				
		
}
}