package implementingBaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

@DataProvider(name="Authentication")

public static Object[][] credentials()
{
	 return new Object[][] { { "testuser_1", "Test@123" }, 
		 { "testuser_1", "Test@123" },
		 { "testuser_1", "Test@123" }};
}


@Test(dataProvider = "Authentication")

  public void Test(String sUsername, String sPassword) 
{
	  String baseUrl = "http://www.store.demoqa.com";
	  driver.get(baseUrl);
	  
	  driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	  driver.findElement(By.id("log")).sendKeys(sUsername);
	  driver.findElement(By.id("pwd")).sendKeys(sPassword);
      driver.findElement(By.id("login123")).click();
	 
}
}
