package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearcPage;
public class GoogleSearchTest {
	static WebDriver driver =null;
	 public static void main(String[] args){
		 GoogleSearch();
	 }
	 public static void GoogleSearch(){
		//String projectpath = System.getProperty("uder.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearcPage.textbox_search(driver).sendKeys("step by step automation");
		GoogleSearcPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
	 }
}
