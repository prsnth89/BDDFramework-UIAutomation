package pages;

import configurations.ParallelExecutor;
import org.openqa.selenium.WebDriver;

public class AmazonPage extends BasePage {
  /* public AmazonPage(WebDriver driver) {
      super(ParallelExecutor.getDriver());
   }*/


   public void navigateToAmazonPage(){
      navigateToURL("https://www.amazon.com");
   }

   public void verifyText(String textToVerify){
        verifyTextFromGivenUrl(textToVerify);
   }
}
