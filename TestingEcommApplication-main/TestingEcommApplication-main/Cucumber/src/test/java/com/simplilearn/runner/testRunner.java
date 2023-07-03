package com.simplilearn.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty",
				"html:target/report/cucumber.html",
				
		},
		features = {"Features"},
		glue = {"stepdefination"}
		)


public class testRunner {
	
	

}
