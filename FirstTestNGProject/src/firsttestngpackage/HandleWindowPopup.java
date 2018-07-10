package firsttestngpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowPopup {
	
	
	String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
    public WebDriver driver ;
 
    
    @Test
  public void WindowPopup() {
    	String baseUrl = "http://demo.guru99.com/popup.php";
  	    System.setProperty("webdriver.chrome.driver", driverPath);
  	    WebDriver driver=new ChromeDriver();
  	    driver.get(baseUrl);
  	    
  	    driver.findElement(By.xpath("/html/body/p/a")).click();
  	    
 	 
 	 
 	 String Mainwindow=driver.getWindowHandle();
 	 
 	 Set<String> s1=driver.getWindowHandles();
 	 Iterator<String> i1=s1.iterator();
 	 
 	 while(i1.hasNext())
 	 {
 		 String Childwindow=i1.next();
 		 if(!Mainwindow.equalsIgnoreCase(Childwindow))
 		 {
 			 driver.switchTo().window(Childwindow);
 			 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sayandutta1989@gmail.com");
 			 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
 			 driver.close(); 
 		 
 	     }
 	 }
 	driver.switchTo().window(Mainwindow)  ;  
  }
}
