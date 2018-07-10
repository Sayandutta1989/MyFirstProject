package implementingBaseClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@SuppressWarnings("unused")
public class BaseClass
{
	public WebDriver driver;
 
    @BeforeTest
	public void setupApplication() 
  {
      
	  String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
    
    
    @AfterMethod
    
        public void screenShot(ITestResult result){
    	
    	if(ITestResult.FAILURE==result.getStatus()){
    		 try{
    			 TakesScreenshot screenshot=(TakesScreenshot)driver;
    			 File src=screenshot.getScreenshotAs(OutputType.FILE);
    			 FileUtils.copyFile(src, new File("E:\\"+result.getName()+".jpeg"));
    			 System.out.println("Successfully captured a screenshot");
    		    }
    	     catch (Exception e)
    		 {
    		 System.out.println("Exception while taking screenshot "+e.getMessage());
    		 } 
    		 }	
    }
    	
    	@AfterTest
    	
    	public void driverClose()
    	{
        driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
    }
}
