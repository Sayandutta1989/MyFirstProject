package pomDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import implementingBaseClass.BaseClass;

public class FbLoginPage extends BaseClass {

	public FbLoginPage()
	
	{ 
        //Locating elements
	  String baseUrl = "https://www.facebook.com/";
	  	  
	  WebElement facebookEmail= driver.findElement(By.xpath("FBEmail"));
	  WebElement facebookPassword= driver.findElement(By.id("FBPassword"));
	  WebElement facebookLogin= driver.findElement(By.id("FBLogintn"));
	  
	// Defining all the user actions (Methods)
	  
	  public void setEmail(String strEmail)
	    {
			facebookEmail.sendKeys(strEmail);
		}
		// This method is to set Password in the password text box
		public void setPassword(){
			facebookPassword.sendKeys("Welcome@108");
		}
		// This method is to click on Login Button
		public void clickOnLoginButton(){
			facebookLogin.click();
		}	
	  
	 }
	}
