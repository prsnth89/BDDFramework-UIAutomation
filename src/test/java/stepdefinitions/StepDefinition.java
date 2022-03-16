package stepdefinitions;

import com.fasterxml.jackson.databind.ser.Serializers;
import configurations.ParallelExecutor;
import configurations.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.AmazonPage;
import pages.BasePage;
import pages.GooglePage;
import utils.Hooks;

import java.io.File;
import java.io.IOException;

public class StepDefinition {
    BasePage basePage;
    AmazonPage amazonPage;
    GooglePage googlePage;
    WebDriver driver;
    ParallelExecutor parallelExecutor;
    public  StepDefinition() {
        System.out.println("Initialize step def");
        basePage=new BasePage();
       // this.driver=basePage.openBrowser("chrome");
      //  basePage=new BasePage(ParallelExecutor.getDriver());
        amazonPage =new AmazonPage();
        googlePage=new GooglePage();
        ParallelExecutor.printCurrentThread();
    }

@Before()
public void openBrowser(){

        ParallelExecutor.setWebDriver(basePage.openBrowser("chrome"));
}




    @Given("open the given {string}")
    public void open_the_given(String browserType) {

    }
    @Given("navigate to given url {string}")
    public void navigate_to_given_url(String url) {

    }
    @Given("navigate to given url of amazon")
    public void navigate_to_given_url_of_amazon() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.navigateToAmazonPage();
    }

    @And("validate the amazon page got loaded successfully by validating text {string}")
    public void validate_the_amazon_page_got_loaded_successfully_by_validating_text(String textToValidate) {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.verifyText(textToValidate);
        amazonPage.verifyAmazonDeliverToIsDisplayed();
    }

    @Given("navigate to given url of google")
    public void navigate_to_given_url_of_google() {
        googlePage.navigateToGooglePage();
    }
    @Given("validate the google page got loaded successfully by validating text {string}")
    public void validate_the_google_page_got_loaded_successfully_by_validating_text(String string) {
        googlePage.verifyGooglePageLoaded();
    }

    @After()
    public void closeWebBrowser(){
        System.out.println("After --close the driver");
        ParallelExecutor.getDriver().close();

    }

    @AfterStep()
    public void addScreenshot(Scenario scenario) throws IOException {
         if(scenario.isFailed()){
        System.out.println("Taking screenshot");
            byte[] screenShot= ((TakesScreenshot)ParallelExecutor.getDriver()).getScreenshotAs(OutputType.BYTES);
          //  byte file[]= FileUtils.readFileToByteArray(screenShot);
            scenario.attach(screenShot,"image/png","image");

        }
    }


}
