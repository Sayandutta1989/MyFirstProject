package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*The parallel attribute of suite tag can accept four values:

tests	: All the test cases inside <test> tag of Testing xml file will run parallel.
classes	: All the test cases inside a Java class will run parallel
methods	: All the methods with @Test annotation will execute parallel.
instances:	Test cases in same instance will execute parallel but two methods of two different instances 
             will run in different thread.
The attribute thread-count allows you to specify how many threads should be allocated for this execution.*/

public class TestGuru99MultipleSession {
  @Test
  public void executeSessionOne(){
      //First session of WebDriver
	  String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/V4/";
		driver.get(baseUrl);
      //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
      
  }
  
@Test    
  public void executeSessionTwo(){
      //Second session of WebDriver
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver=new ChromeDriver();
	String baseUrl = "http://demo.guru99.com/V4/";
	driver.get(baseUrl);
  //find user name text box and fill it
    driver.findElement(By.name("uid")).sendKeys("Driver 2");
  
  }
  
@Test    
  public void executSessionThree(){
      //Third session of WebDriver
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver=new ChromeDriver();
	String baseUrl = "http://demo.guru99.com/V4/";
	driver.get(baseUrl);
  //find user name text box and fill it
    driver.findElement(By.name("uid")).sendKeys("Driver 3");
  
  }  
}
