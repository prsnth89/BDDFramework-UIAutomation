package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target/failed.txt"},
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "html:target/HTML/RerunReport.html",
                "json:target/JSON/cucumber.json"
                //"rerun:target/failed.txt"
        })
public class FailedTestCaseRunner {

}
