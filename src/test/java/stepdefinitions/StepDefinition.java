package stepdefinitions;

import configurations.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;

public class StepDefinition extends BasePage {
    @Given("open the given {string}")
    public void open_the_given(String browserType) {
       openBrowser(browserType);
    }
    @Then("navigate to given url {string}")
    public void navigate_to_given_url(String url) {
        navigateToURL(url);
    }

    @Then("close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        closeBrowser();
    }

    }
