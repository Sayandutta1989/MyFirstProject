package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethodTest {

	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ; 


@BeforeTest                           
public void launchBrowser()
{
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
}

//@BeforeMethod: methods under this annotation will be executed prior to each method in each test case.

//AfterMethod: methods under this annotation will be executed after each method in each test case.


//@BeforeMethod should contain methods that you need to run before each test case while
//@AfterMethod should contain methods that you need to run after each test case.


@BeforeMethod

public void verifyHomepageTitle() {
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
}

/*@Test: The annotated method is a part of a test case
If you want the methods to be executed in a different order, use the parameter "priority". 
Parameters are keywords that modify the annotation's function
0 having the highest priority value */

@Test(priority=0)

public void register(){
    driver.findElement(By.linkText("REGISTER")).click() ;
    String expected = "Register: Mercury Tours";
    String actual = driver.getTitle();
    Assert.assertEquals(actual, expected);
}

@AfterMethod
public void goBackToHomepage ( ) {
      driver.findElement(By.linkText("Home")).click() ;
}

@AfterTest
public void terminateBrowser(){
    driver.close();
}









}