package com.automationpractice.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/com/automationpractice/features",
		glue = "com/automationpractice/stepDefs"
		
		
		
		)

public class CukeRunner {

}
