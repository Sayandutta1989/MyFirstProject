package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSwitchiFrame {

	public static void main(String[] args) {
		String driverPath = "C:\\\\Program Files\\\\SeleniumDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/guru99home/";
		driver.get(baseUrl);
		
	/*Frame is a web page which is embedded in another web page or an HTML document embedded inside another HTML document.
    The IFrame is often used to insert content from another source,
    such as an advertisement, into a Web page. The <iframe> tag specifies an inline frame.
    we can switch over the elements in frames using 3 ways.
   By Index
   By Name or Id
   By Web Element	*/
		
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2000)");
	driver.switchTo().frame("a077aa5e");
	System.out.println("Frame selection done");
	//driver.findElement(By.xpath("//*[@id=\"a077aa5e\"]")).click();
	driver.findElement(By.xpath("html/body/a/img")).click();;
	
	System.out.println("We are done");

	}

}
