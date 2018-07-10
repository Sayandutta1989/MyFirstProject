package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*To pass multiple data to the application at runtime, we need to parameterize our test scripts.
This concept which we achieve by parameterization is called Data Driven Testing.*/

/*There are two ways by which we can achieve parameterization in TestNG.
1. With the help of Parameters annotation and TestNG XML file.Parameters from Testng.xml can be suite or test level
2. With the help of DataProvider annotation.Parameter from DataProvider can take Method and ITestContext as the parameter*/

public class ParameterWithTestNGXML {
	
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    
  @Test
  @Parameters({"author","searchKey"})
  
  /*Your @Parameters do not have a corresponding value in testdata.xml.
   You can solve this situation by adding @optional annotation in the corresponding parameter in the test method*/
  public void testdataXml(@Optional("")String author, String searchKey) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  String baseUrl = "https://in.yahoo.com";
	  driver.get(baseUrl);
	  
	  WebElement GooglesearchText=driver.findElement(By.xpath("//*[@id=\"uh-search-box\"]"));
	  GooglesearchText.sendKeys(searchKey);
	  System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
      System.out.println("Thread will sleep now");
      Thread.sleep(3000);
      System.out.println("Value in Google Search Box = " +GooglesearchText.getText());
	  
  }
}
