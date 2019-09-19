package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemowithtestNG {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	static WebDriver driver=null;
	@BeforeSuite
public void setUp(){
	htmlreporter = new ExtentHtmlReporter("ExtentReport1.html");

		//creating extent reports and attach reports
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
}
	@BeforeTest
	public void setUpTest() throws IOException{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	@Test
public void test1() throws IOException{
		ExtentTest test = extent.createTest("Google test one","google test functionality");
		test.log(Status.INFO,"this shows test logs");
		test.pass("navigate to google");
		test.info("it shows info");
		test.fail("it shows failed test");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	@Test
public void test2() throws IOException{
		ExtentTest test = extent.createTest("Google test one","google test functionality");
		test.log(Status.INFO,"this shows test logs");
		test.pass("navigate to google");
		test.info("it shows info");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	@AfterTest
	 public void tearDownTest(){
		 driver.close();
		 System.out.println("test completed");
	} 
	@AfterSuite
public void tearDown(){
	extent.flush();
}
}
