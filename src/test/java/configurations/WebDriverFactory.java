package configurations;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
   private WebDriver driver = null;
    public WebDriver initializeWebDriver(@NotNull String browserType) {

        if (browserType.trim().toLowerCase().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/98_chromedriver.exe");
            driver = new ChromeDriver();
            } else if (browserType.trim().toLowerCase().equalsIgnoreCase("ie")) {
            //  System.setProperty("webdriver.ie.driver","drivers/98_chromedriver.exe");
            driver =new InternetExplorerDriver();

        }
        return driver;
    }

}
