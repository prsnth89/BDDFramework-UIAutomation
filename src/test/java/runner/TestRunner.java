package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue = {"stepdefinitions"}, //define the step definition
        monochrome = false, // if given as trueshows result in neat manner
        dryRun = false, //if given as true it will generate step def
        plugin = {"pretty",
                "html:target/HTML/ConsolidateReport.html",
                "json:target/JSON/cucumber.json",
                "junit:target/cucumberexecution.xml"}
      //  tags = "@amazon"
)
public class TestRunner {
}
