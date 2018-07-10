package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class TestFluentWait {
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    
/*The fluent wait is used to tell the web driver to wait for a condition, 
 * as well as the frequency with which we want to check the condition before throwing an "ElementNotVisibleException" exception.
 Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time */
    
  @Test
  public void FluentwaitClass() {
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  
	  String baseUrl = "https://www.guru99.com/selenium-tutorial.html";
	  driver.get(baseUrl);
	  
	  String aTitle="Free Selenium Tutorials";
	  String eTitle=driver.getTitle();
	  if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
	  
	  @SuppressWarnings("deprecation")
	  Wait<WebDriver> wait=new FluentWait <WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	  WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Home')]")));
	  link.click();
	  System.out.println("Link Clicked");
  }
}
