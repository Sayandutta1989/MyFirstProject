package firsttestngpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNGClass {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ; 
    
  //@AfterTest: methods under this annotation will be executed after all test cases in the TestNG file are executed. 
  
  @AfterTest
  public void terminateBrowser() 
  {
	  driver.close();
  }
  //methods under this annotation will be executed prior to the first test case in the TestNG file
  
  @BeforeTest                           
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
  }
  
  //The placement of the annotation blocks can be interchanged without affecting the chronological order by which they will be executed. 
  
  @Test                                
  public void VerifyHomepageTitle() {
	    String expectedTitle="Welcome: Mercury Tours";
		String actualTitle= driver.getTitle();
		 
	//The Assert class is used to conduct verification operations in TestNG
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
 }
}
