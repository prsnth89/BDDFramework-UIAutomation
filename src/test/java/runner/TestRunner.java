package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue = {"stepdefinitions"},
        dryRun = false,
        plugin = {"pretty",
                "html:target/HTML/ConsolidateReport.html",
                "json:target/JSON/cucumber.json"}
      //  tags = "@amazon"
)
public class TestRunner {
}
