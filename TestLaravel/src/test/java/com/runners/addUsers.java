package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"}, 
tags = "@addUser",
monochrome = true,
plugin = {"pretty", "html:target/HtmlReport/report.html",
		"json:target/JSONReport/report.json", 
		 }
)
public class addUsers extends AbstractTestNGCucumberTests {

}

