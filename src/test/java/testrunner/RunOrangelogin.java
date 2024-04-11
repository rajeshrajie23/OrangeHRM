package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    features="src/test/resources/features",
    glue={"stepdefinition"},
    tags = "@ValidLogin or @InvalidLogin",
    plugin = {"html:./target/LoginTestReport.html"},
    monochrome = true,
    name="user login",
    dryRun=false
)

public class RunOrangelogin {}
