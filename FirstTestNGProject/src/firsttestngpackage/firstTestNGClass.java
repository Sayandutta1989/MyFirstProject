package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import implementingBaseClass.BaseClass;

@SuppressWarnings("unused")
public class firstTestNGClass extends BaseClass
{
	/*@Test is used to tell that the method under it is a test case. 
	 * In this case, we have set the verifyHomepageTitle() method to be our test case
	 */
	

  @Test
  public void verifyHomepageTitle() {
	  
	    
		String baseurl="http://demo.guru99.com/test/newtours/";
		driver.get(baseurl);
		
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle= driver.getTitle();
		 
	//The Assert class is used to conduct verification operations in TestNG
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
  }
}
