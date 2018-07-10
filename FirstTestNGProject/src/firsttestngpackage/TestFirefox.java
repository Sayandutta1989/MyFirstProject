package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirefox {
	
	
  @Test
  public void Test_Gmail_Login() {
	  System.setProperty("webdriver.firefox.marionette","C:\\Program Files\\SeleniumDriver\\geckodriver-v0.20.1-win32.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  driver.findElement(By.id("Email")).sendKeys("Enter user name");
	  driver.findElement(By.id("next")).click();
	  
	  driver.findElement(By.id("Passwd")).sendKeys("Enter Password");
	  driver.findElement(By.id("signIn")).click();
	  
	  String title_Of_Page = driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), title_Of_Page);
	  System.out.println("Page title matched");
	  }
}
