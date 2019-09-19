package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearcPage;
public class TestNG_Demo {
	static WebDriver driver =null;
	@BeforeTest
	 public void setUp(){
		 System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	 }
	 @Test
	 public void GoogleSearch(){
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 }
	 @AfterTest
	 public void tearDown(){
		 driver.close();
		 System.out.println("test completed");
	 }
}
