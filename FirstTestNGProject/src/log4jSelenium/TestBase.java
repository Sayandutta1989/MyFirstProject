package log4jSelenium;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static final Logger logger=Logger.getLogger(TestBase.class.getName());
	
	
	@BeforeTest
	public void loadlog4j() {
		
		String log4jConfPath=System.getProperty("C:\\Users\\sayan\\workspace1\\FirstTestNGProject\\src\\log4jSelenium\\log4j.properties");
		PropertyConfigurator.configure(log4jConfPath);
		
			
	}

}
