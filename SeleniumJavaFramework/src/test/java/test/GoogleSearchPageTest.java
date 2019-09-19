package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	static WebDriver driver=null;
public static void main(String[] args) {
	googleSearchTest();
}
public static void googleSearchTest(){
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 GoogleSearchPageObjects searchPagrobj= new GoogleSearchPageObjects(driver);
	 driver.get("http://www.google.com/");
	 searchPagrobj.setTextinSearchbox("a b c d");
	 searchPagrobj.clickSearchButton();
}
}
