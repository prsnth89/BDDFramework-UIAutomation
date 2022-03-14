package utils;

import com.fasterxml.jackson.databind.ser.Serializers;
import configurations.ParallelExecutor;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Hooks {
    WebDriver driver;
    public ParallelExecutor parallelExecutorDriver;
    public BasePage basePage;
    public Hooks(WebDriver driver) {
       basePage=new BasePage();
       ParallelExecutor.getDriver();
    }



    public void openWebBrowser(){
        this.driver=basePage.openBrowser("chrome");
        ParallelExecutor.setWebDriver(this.driver);

    }

    public void closeBrowser(){
        ParallelExecutor.getDriver().close();
    }


}
