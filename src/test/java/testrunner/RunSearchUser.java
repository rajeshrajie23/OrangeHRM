package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    features = "src/test/resources/features",
    glue = "stepdefinition",
    tags = "@Search",
    plugin = {"html:./target/SearchTestReport.html"},
    monochrome = true,
    dryRun = false
)

public class RunSearchUser {}
