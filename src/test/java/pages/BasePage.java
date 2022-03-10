package pages;

import configurations.ParallelExecutor;
import configurations.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public void clickElement(String locatorType, String locator) {
        ParallelExecutor.getDriver();
        ParallelExecutor.getDriver().findElement(By.xpath(locator)).click();
        System.out.println("Clicked element successfully");
    }

    public void navigateToURL(String url) {
        ParallelExecutor.getDriver().get(url);
        System.out.println("Navigated to url successfully");
    }

    public void openBrowser(String browserType){
       driver= WebDriverFactory.getWebDriverInstance(browserType);
    }

    public void closeBrowser(){
        ParallelExecutor.getDriver().close();
    }

}
