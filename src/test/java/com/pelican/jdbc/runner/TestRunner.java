package com.pelican.jdbc.runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
       dryRun=false,
       strict=false,
       monochrome=true,
       features = {"src/test/resources/features"},
       glue = {"com.pelican.jdbc.stepDef"},
       plugin = {       "pretty",
    	                "html:target/cucumber-reports/cucumber-pretty"
    	        }
    //   ,
     //  tags= {"@BookFlightAndHotel","@BookFlight", "@BookHotel"}
        )

@Test
public class TestRunner extends AbstractTestNGCucumberTests{

//	private TestNGCucumberRunner testNGCucumberRunner;
	
//	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	
	
	
}
