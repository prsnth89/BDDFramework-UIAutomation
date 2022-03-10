package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static WebDriver getWebDriverInstance(String browserType) {
        WebDriver driver = null;
        if (browserType.trim().toLowerCase().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/98_chromedriver.exe");
            driver = new ChromeDriver();
            ParallelExecutor.setWebDriver(driver);
            driver = ParallelExecutor.getDriver();
        } else if (browserType.trim().toLowerCase().equalsIgnoreCase("ie")) {
            //  System.setProperty("webdriver.ie.driver","drivers/98_chromedriver.exe");
            ParallelExecutor.setWebDriver(driver);
            driver = ParallelExecutor.getDriver();


        }
        return driver;
    }

}
