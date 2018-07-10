package firsttestngpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99TakeScreenshot {
  @Test
  public void testGuru99TakeScreenShot() throws Exception{
  
    String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver=new ChromeDriver();
	String baseUrl = "http://demo.guru99.com/V4/";
	driver.get(baseUrl);
	
	//Call take screenshot function

    this.takeSnapShot(driver, "E:\\Java Selenium\\test.png") ;     

  
}

  
  /*Step 1) Convert web driver object to TakeScreenshot
   TakesScreenshot scrShot =((TakesScreenshot)webdriver);

   Step 2) Call getScreenshotAs method to create image file
   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

   Step 3) Copy file to Desired Location */
  
  
private void takeSnapShot(WebDriver webdriver,String fileWithPath) throws IOException {
	//Convert web driver object to TakeScreenshot

    
	TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
          //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);
            
                      
}
}