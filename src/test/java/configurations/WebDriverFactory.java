package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Locale;

public class WebDriverFactory {

    public static WebDriver getWebDriverInstance(String browserType) {
        WebDriver driver = null;
        if (browserType.trim().toLowerCase().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/98_chromedriver.exe");
            driver = new ChromeDriver();
            WebDriverExecutor.setWebDriver(driver);
            driver = WebDriverExecutor.getDriver();
        } else if (browserType.trim().toLowerCase().equalsIgnoreCase("ie")) {
            //  System.setProperty("webdriver.ie.driver","drivers/98_chromedriver.exe");
            WebDriverExecutor.setWebDriver(driver);
            driver = WebDriverExecutor.getDriver();


        }
        return driver;
    }

}
