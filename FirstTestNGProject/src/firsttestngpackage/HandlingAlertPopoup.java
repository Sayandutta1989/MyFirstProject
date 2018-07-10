package firsttestngpackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlertPopoup {
	
	
    String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
    
    
    
  @Test
  public void AlertPopup() throws NoAlertPresentException,InterruptedException
  {
	  String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();;
	  
	  Alert alert=driver.switchTo().alert();
	  String alertmsg=driver.switchTo().alert().getText();
	  System.out.println(alertmsg);
	  alert.accept();
	  Thread.sleep(5000);
	  
  }
 }  


