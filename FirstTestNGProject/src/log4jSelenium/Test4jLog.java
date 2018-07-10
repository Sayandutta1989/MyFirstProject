package log4jSelenium;

import java.util.logging.Logger;

import org.testng.annotations.Test;

public class Test4jLog extends TestBase {
	
	public static final Logger logger=Logger.getLogger(Test4jLog.class.getName());
	@Test
	public void testLogin()
	{
		
		logger.info("Start");
		logger.info("Continue1");
		logger.info("Continue2");
		logger.info("Continue3");
		logger.info("End");
	}

	
	
}
