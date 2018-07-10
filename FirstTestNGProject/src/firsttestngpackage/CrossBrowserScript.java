	package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class CrossBrowserScript {
	
	WebDriver driver;
	
  @Test
  @Parameters("browser")
  
  public void setup(@Optional("")String browser) throws Exception
  {
		//Check if parameter passed from TestNG is 'firefox'
		
		if(browser.equalsIgnoreCase("Firefox")){
		//create firefox instance
			System.setProperty("webdriver.firefox.marionette","C:\\Program Files\\SeleniumDriver\\geckodriver-v0.20.1-win32.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		//Check if parameter passed as 'chrome'
				else if(browser.equalsIgnoreCase("Chrome")){
					//set path to chromedriver.exe
					System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
					//create chrome instance
					driver = new ChromeDriver();
				}
		    //public void testParameterWithXML() throws InterruptedException{
			driver.get("http://demo.guru99.com/V4/");
			//Find user name
			WebElement userName = driver.findElement(By.name("uid"));
			//Fill user name
			userName.sendKeys("guru99");
			//Find password
			WebElement password = driver.findElement(By.name("password"));
			//Fill password
			password.sendKeys("guru99");
		}
  }

