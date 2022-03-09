package utils;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class Utilities {
    static int i;

    public static void takeScreenshot(Scenario scenario, WebDriver driver, WebElement element){
        i=i++;
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
      //  scenario.attach(screenshotBase64);
        scenario.attach(screenshotBase64,".png","tc001");
    }
}
