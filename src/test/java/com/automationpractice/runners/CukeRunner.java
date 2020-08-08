package com.automationpractice.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@temp",
		features = "src/test/resources/com/automationpractice/features",
		glue = "com/automationpractice/stepDefs",
		plugin = {"summary", "pretty"}, // summary -> generate unimplemented step definitions in console
										// pretty -> more detailed output
		monochrome = true // fixes the ? on the console for windows users
		,dryRun = true  // skips the step definition execution -> used to generate SDs quickly
		
		
		)

public class CukeRunner {

}
