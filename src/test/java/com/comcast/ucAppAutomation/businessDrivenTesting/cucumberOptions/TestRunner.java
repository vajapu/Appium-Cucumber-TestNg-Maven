package com.comcast.ucAppAutomation.businessDrivenTesting.cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.java.BeforeStep;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.comcast.ucAppAutomation.utils.DriverFactory;
import com.comcast.ucAppAutomation.utils.TestListner;

@CucumberOptions(features = "src/test/java/com/comcast/ucAppAutomation/businessDrivenTesting/features/", 
				glue = {""}, 
				tags = {"not @Ignore"}, 
				plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
						"json:target/cucumber-reports/CucumberTestReport.json",
						"rerun:target/cucumber-reports/rerun.txt" })
//@CucumberOptions(strict = true, plugin = "json:target/cucumber-report-feature-composite.json")

@Listeners(TestListner.class)
public class TestRunner extends AbstractTestNGCucumberTests {
	private static int count=-1;

//    @DataProvider(parallel = true)
//    @Override
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
    
	@BeforeMethod()
	private void setUp() throws MalformedURLException {
//		String[] udids = { "51baca80","dev2"};
//		for (String udid : udids) {
//			DriverFactory df = new DriverFactory();
//			try {
//				df.createDriver(udid);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		DriverFactory df = new DriverFactory();
		try {
			df.createDriver(String.valueOf(count));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    @AfterMethod
    private void tearDown() {
    	DriverFactory df= new DriverFactory();
    	df.teardown();
	}   
    
    @BeforeClass
    private void pub() {
		// TODO Auto-generated method stub
    	count++;
	}
    
}