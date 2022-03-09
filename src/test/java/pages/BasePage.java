package pages;

import configurations.WebDriverExecutor;
import configurations.WebDriverFactory;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utilities;

public class BasePage {
    WebDriver driver;

    public void clickElement(String locatorType, String locator) {
        WebDriverExecutor.getDriver();
        WebDriverExecutor.getDriver().findElement(By.xpath(locator)).click();
        System.out.println("Clicked element successfully");
    }

    public void navigateToURL(String url) {
        WebDriverExecutor.getDriver().get(url);
        System.out.println("Navigated to url successfully");
    }

    public void openBrowser(String browserType){
       driver= WebDriverFactory.getWebDriverInstance(browserType);
    }

    public void closeBrowser(){
        WebDriverExecutor.getDriver().close();
    }

}
