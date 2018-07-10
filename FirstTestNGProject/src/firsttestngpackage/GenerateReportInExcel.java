package firsttestngpackage;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class GenerateReportInExcel {

	public static void main(String[] args)throws ParserConfigurationException, IOException, SAXException {
		{
			{
				ExcelReportGenerator.generateExcelReport("MyProject.xls", "E:\\Java Selenium\\Excel Output");

				}
		    }

	}

}
