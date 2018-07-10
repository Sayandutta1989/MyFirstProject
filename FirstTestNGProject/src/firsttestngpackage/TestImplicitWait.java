package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestImplicitWait {
	
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;

    /*The implicit wait will tell to the web driver to wait for certain amount of time before it throws a "No Such Element Exception". The default setting is 0.
     *  Once we set the time, web driver will wait for that time before throwing an exception.
     */
    
  @Test
  public void WaitTest() {
	  
	  String baseUrl = "https://www.guru99.com/selenium-tutorial.html";
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  String eTitle="Free Selenium Tutorials";
	
	  
	  String aTitle =driver.getTitle();
	  if(aTitle.equals(eTitle))
	  {
		  
		  System.out.println("Test Passed");
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
	  
	  
  }
}
