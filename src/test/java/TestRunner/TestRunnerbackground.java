package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(features = "src//test//resources//Background",glue = {"StepDefinition"},
            plugin = {"pretty","html:target/Cucumber report/report.html"})
    public class TestRunnerbackground extends AbstractTestNGCucumberTests
    {

    }

