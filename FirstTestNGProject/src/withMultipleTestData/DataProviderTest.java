package withMultipleTestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	 
	 @DataProvider(name="Authentication")
	 
	 public static Object[][] credentials()
	 {
		 return new Object[][] { { "testuser_1", "Test@123" }, 
			 { "testuser_1", "Test@123" },
			 { "testuser_1", "Test@123" }};
	 }
	
	
	 @Test(dataProvider = "Authentication")
	
  
	 public void test(String sUsername, String sPassword) 
	{
		  String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  WebDriver driver=new ChromeDriver();
		  String baseUrl = "http://www.store.demoqa.com";
		  driver.get(baseUrl);
		  
		  driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		  driver.findElement(By.id("log")).sendKeys(sUsername);
		  driver.findElement(By.id("pwd")).sendKeys(sPassword);
	      driver.findElement(By.id("login")).click();
		 
    }
}
