package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.Jvm_report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step",dryRun=false,tags= {"@unit"},
plugin= {"html:src\\test\\resources\\reports\\htmlreport","json:src\\test\\resources\\reports\\jsonreport.json"})

public class Run_Class {
	@AfterClass
	public static void jvmreportgen() {
		Jvm_report.genratejvmreport("C:\\Users\\home\\eclipse-workspace\\eclipse workspace\\Cucumbersep1\\src\\test\\resources\\reports\\jsonreport.json");
		

	}

}
