package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGMultibrowserDemo {
WebDriver driver = null;
@Parameters("browseName")	
@BeforeTest
	public void setUP(String browseName){
		System.out.println("browse name is:"+browseName);
		System.out.println("thread id:"+Thread.currentThread().getId());
		System.out.println("thread name:"+Thread.currentThread().getName());
		if(browseName.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browseName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\SeleniumJavaFramework\\src\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
		}
	
}
	
	@Test
	public void test4() throws InterruptedException{
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		System.out.println("test completed successfully");
	}
}
