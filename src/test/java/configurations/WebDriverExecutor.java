package configurations;

import org.openqa.selenium.WebDriver;

public class WebDriverExecutor {
    private static final ThreadLocal<WebDriver> webDriver=new ThreadLocal<WebDriver>();

    public static void setWebDriver(WebDriver driver){
        webDriver.set(driver);
    }

    public static WebDriver getDriver(){
        return webDriver.get();
    }
}
