package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;

/*The chief problem with script maintenance is that if 10 different scripts are using the same page element, 
 with any change in that element, you need to change all 10 scripts. This is time consuming and error prone.
 
A better approach to script maintenance is to create a separate class file which would find web elements, 
fill them or verify them. This class can be reused in all the scripts using that element. In future, 
if there is a change in the web element, 
we need to make the change in just 1 class file and not 10 different scripts.

Advantages of POM
Page Object Pattern says operations and flows in the UI should be separated from verification.
 This concept makes our code cleaner and easy to understand.
The Second benefit is the object repository is independent of test cases,
 so we can use the same object repository for a different purpose with different tools.
  For example, we can integrate POM with TestNG/JUnit for functional Testing and 
  at the same time with JBehave/Cucumber for acceptance testing.
Code becomes less and optimized because of the reusable page methods in the POM classes.
Methods get more realistic names which can be easily mapped with the operation happening in UI. */


@SuppressWarnings("unused")
public class Test99GuruLogin {
	
	
	 WebDriver driver;

	 Guru99Login objLogin;

	 Guru99HomePage objHomePage;
	 public String baseUrl = "http://demo.guru99.com/V4/";
	 String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	
	 
	 
	/* @BeforeTest

	    public void setup(){

		 System.setProperty("webdriver.chrome.driver", driverPath);
		 WebDriver driver=new ChromeDriver();
		 driver.get(baseUrl);

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    */

  @Test
  public void test_Home_Page_Appear_Correct() 
  {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  objLogin = new Guru99Login(driver);
	  String loginPageTitle = objLogin.getLoginTitle();
	  Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	  
	  
	  
	  objLogin.loginToGuru99("mgr123", "mgr!23");
	  
	  objHomePage = new Guru99HomePage(driver);
	  
	  
	  Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
  }
}
