package implementingBaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestBase extends BaseClass

{
  @Test
  public void findElements() {
	  driver.get("http://demo.guru99.com/test/ajax.html");
	  List<WebElement> elementCount=driver.findElements(By.xpath("//input[contains(@name,'name')]"));
	  int itemSize=elementCount.size();
	  for(int i=0;i<itemSize;i++)
	  {
		  System.out.println(elementCount.get(i).getAttribute("value"));
		  
	  }
  }
}
