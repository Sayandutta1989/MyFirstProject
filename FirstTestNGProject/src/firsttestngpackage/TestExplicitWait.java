package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestExplicitWait {
	
	
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    
    /*The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected Conditions) 
     * or the maximum time exceeded before throwing an "ElementNotVisibleException" exception.
     */
  @Test
  public void TestWaitExplicit() {
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  
	  String baseUrl = "https://www.guru99.com/selenium-tutorial.html";
	  driver.get(baseUrl);
	  
	/*In the below example, we are creating reference wait for "WebDriverWait" class and instantiating using "WebDriver" reference, 
	  and we are giving a maximum time frame of 20 seconds.*/  
	  
	  
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  
	  String aTitle="Free Selenium Tutorials";
	  String eTitle=driver.getTitle();
	  if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
	  
	  WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Home')]")));
	  link.click();
	  System.out.println("Link Clicked");
	  
  }
}
