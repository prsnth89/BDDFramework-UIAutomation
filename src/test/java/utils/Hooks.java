package utils;

import com.fasterxml.jackson.databind.ser.Serializers;
import configurations.ParallelExecutor;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.io.File;
import java.io.IOException;

public class Hooks {
    WebDriver driver;
    public ParallelExecutor parallelExecutorDriver;
    public BasePage basePage;
   /* public Hooks(WebDriver driver) {
       basePage=new BasePage();
       ParallelExecutor.getDriver();
    }*/



  /*  public void openWebBrowser(){
        this.driver=basePage.openBrowser("chrome");
        ParallelExecutor.setWebDriver(this.driver);

    }
*/


}
