package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm_report {
	public static void genratejvmreport(String json) {
		//C:\Users\home\eclipse-workspace\eclipse workspace\Cucumbersep1\src\test\resources\reports\JvmReport
		File f=new File("C:\\Users\\home\\eclipse-workspace\\eclipse workspace\\Cucumbersep1\\src\\test\\resources\\reports\\JvmReport");
		Configuration con=new Configuration(f, "adactin");
		con.addClassifications("platform", "window7");
		con.addClassifications("browser", "chrome");
		con.addClassifications("version", "85.2");
		con.addClassifications("sprint", "40");
		
		List<String> jsonfiles=new ArrayList<String>();
		jsonfiles.add(json);
		
		ReportBuilder report=new ReportBuilder(jsonfiles, con);
		
		report.generateReports();
		
		
		
	}

}
