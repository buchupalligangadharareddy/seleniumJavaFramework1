package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
static WebDriver driver =null;
	public static void main(String[] args) {
		//start reports
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("ExtentReport.html");

		//creating extent reports and attach reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
//creating togle for the given test 
ExtentTest test1 = extent.createTest("Google test one","google test functionality");
System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
test1.log(Status.INFO,"starting test case");
driver.get("https://www.google.com/");
test1.pass("navigate to google");
driver.findElement(By.name("q")).sendKeys("automation step by step");
test1.pass("text enterd");
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
test1.pass("presed keyboard enter key");
driver.close();
driver.quit();
test1.pass("closed the browser");
test1.info("test completed");
extent.flush();

	}

}
