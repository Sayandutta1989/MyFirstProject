package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexOfIframe {

	public static void main(String[] args) {
		
		
		String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/guru99home/";
		driver.get(baseUrl);
		
		
		int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++)
	    {
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    
	    
	    }

	}

}
