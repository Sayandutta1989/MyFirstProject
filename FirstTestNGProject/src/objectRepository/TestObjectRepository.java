package objectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import implementingBaseClass.BaseClass;

public class TestObjectRepository extends BaseClass{
 
	/* However, object repositories can be built using the key-value pair approach 
	 * wherein the key refers to the name given to the object and value refers
	 * to the properties used to uniquely identify an object within the web page.

The following are the types of object repositories that can be created in Selenium WebDriver.

Object Repository using Properties file
Object Repository using XML file*/
	
	@Test
  public void ObjTest() throws IOException {
		driver.get("http://demo.guru99.com/test/guru99home/");					
	    driver.manage().window().maximize();
	    
	 // Load the properties File		
	    Properties obj = new Properties();					
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/objectRepository/application.properties");									
	    obj.load(objfile);	
	  
	  
	 // Nagigate to link Mobile Testing and Back		
	    driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
	    driver.navigate().back();	
	    
	 // Enter Data into Form		
	    driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");									
	    driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();	
  }
}
