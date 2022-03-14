package pages;

import configurations.ParallelExecutor;
import org.openqa.selenium.WebDriver;

public class GooglePage extends  BasePage{
  /*  public GooglePage(WebDriver driver) {
        super(ParallelExecutor.getDriver());
    }
*/
    public void navigateToGooglePage(){
        navigateToURL("https://www.google.com");
    }

    public void verifyGooglePageLoaded(){
        verifyTextFromGivenUrl("google");
    }
}
