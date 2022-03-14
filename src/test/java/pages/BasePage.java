package pages;

import configurations.ParallelExecutor;
import configurations.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage  {
    private WebDriverFactory driverFactory;

   /* public BasePage(){
        System.out.println("Initialize BasePage logs etc");
    }*/
  /*  public BasePage(WebDriver driver) {
     //   this.driver=driver;
    }*/



    protected void clickElement(String locatorType, String locator) {

        ParallelExecutor.getDriver().findElement(By.xpath(locator)).click();
        System.out.println("Clicked element successfully");
    }

    protected void navigateToURL(String url) {
        ParallelExecutor.getDriver().get(url);
        System.out.println("Navigated to url successfully");
    }

    public WebDriver openBrowser(String browserType){
       driverFactory=new WebDriverFactory();
      // this.driver= driverFactory.initializeWebDriver(browserType);
       ParallelExecutor.setWebDriver(driverFactory.initializeWebDriver(browserType));
       return ParallelExecutor.getDriver();
    }


    protected void closeBrowser(){
        ParallelExecutor.getDriver().close();
    }

    protected void verifyTextFromGivenUrl(String textToVerify){
        String currentUrl=ParallelExecutor.getDriver().getCurrentUrl();
        System.out.println("Current URL---"+currentUrl);
        System.out.println("TextToVerify---"+textToVerify);
        Assert.assertTrue(currentUrl.contains(textToVerify.trim()));
    }




}
