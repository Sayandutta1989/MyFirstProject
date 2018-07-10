package firsttestngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import implementingBaseClass.BaseClass;



@SuppressWarnings("unused")
public class SelectingElements extends BaseClass{
	
	
	@Test
  public void selectingElements() 
  {
	 /* System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();*/
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	  
	  
	  Select elementSelect = new Select(driver.findElement(By.id("selenium_commands")));
	  List<WebElement> countElement=elementSelect.getOptions();
	  
	  int iSize=countElement.size();
	  for(int i=0; i<iSize;i++)
	  {
		  
		  String sValue=countElement.get(i).getText();
		  System.out.println(sValue);
		  	   
	  }
	  
  }
}
