package pages;

import configurations.ParallelExecutor;
import org.openqa.selenium.By;
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

   public void verifyAmazonDeliverToIsDisplayed(){
      ParallelExecutor.getDriver().findElement(By.xpath("//span[contains(text(),'Deliver to')]")).isDisplayed();
   }
}
