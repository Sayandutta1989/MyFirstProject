package firsttestngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicElementHandle {
	

	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    
    
  @Test
  public void DynamicTable() {
	  
	    String baseUrl = "https://money.rediff.com/gainers/bsc/daily/groupa";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    WebDriver driver=new ChromeDriver();
	    driver.get(baseUrl);
	    
	    //using findElements and X-path //*[@id=\"leftcontainer\"]/table/thead/tr/th we get all the columns
	    
	    List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	    System.out.println("column size is " +col.size());
	    
	    List<WebElement> row=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	     System.out.println("row size is " +row.size());
	     
	     for(int cnum=0;cnum<col.size();cnum++)
	     {
	    	try
	    	 {
	    		 driver.findElement(By.xpath("//*[contains(text(),'IFCI Ltd.')]")).click();
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 
	    		 System.out.println("no such element found");
	    	 }
	    	 
	    	 
	     }
	    
  }
}
