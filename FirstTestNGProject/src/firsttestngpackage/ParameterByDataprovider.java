package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class ParameterByDataprovider {
	
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    String baseUrl = "https://in.yahoo.com";
    
  
	  @Test(dataProvider="SearchProvider")
	  public void testData(String author, String searchKey) throws InterruptedException{
	  {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get(baseUrl);
		  
		  WebElement searchText=driver.findElement(By.xpath("//*[@id=\"uh-search-box\"]"));
		  searchText.sendKeys(searchKey);
		  System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	      System.out.println("Thread will sleep now");
	      Thread.sleep(3000);
	      String testValue=searchText.getAttribute("Value");
	      System.out.println(testValue+"::"+searchKey);
	      
	  }  
  }
	 /* @BeforeTest
	  public void launchURL()
	  {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get(baseUrl);
		  
	  } */ 
	  
/*@Parameters annotation is easy but to test with multiple sets of data we need to use Data Provider.
To fill thousand's of web forms using our testing framework we need a different methodology 
which can give us a very large dataset in a single execution flow.
Data provider returns a two-dimensional JAVA object to the test method and the test method, will invoke M times in a M*N type of object array. 
For example, if the DataProvider returns an array of 2*3 objects, 
the corresponding testcase will be invoked 2 times with 3 parameters each time.
If DataProvider is present in the different class then the class where the test method resides, DataProvider should be static method.*/
	  
	  @DataProvider(name="SearchProvider")
	  
	  public Object[][] getDatafromDataProvider()
	  {
		  
		  /*
		     * @return Object[][] where first column contains 'author'
		     * and second column contains 'searchKey'
		     */		  
		  return new Object[][]
				  {
						  
					  { "Guru99", "India" },
			            { "Krishna", "UK" },
			            { "Bhupesh", "USA" }
				  };
	  }
}
