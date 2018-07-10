package firsttestngpackage;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import implementingBaseClass.BaseClass;


@SuppressWarnings("unused")
public class UseFindElements  extends BaseClass{
	@Test 
  public void useFindElements() 
  {
	  
	  /*System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();*/
	  driver.get("http://demo.guru99.com/test/ajax.html");
	  
	  List<WebElement> elementCount=driver.findElements(By.xpath("//input[contains(@name,'name')]"));
	  
	  int itemSize=elementCount.size();
	  for(int i=0;i<itemSize;i++)
	  {
		  System.out.println(elementCount.get(i).getAttribute("value"));
		  
	  }
  }
}
