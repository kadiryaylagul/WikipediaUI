package pages.pageActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.pageElements.ResultPage;
import utilities.Driver;

public class ResultPage_Actions extends ResultPage {

    public String getTextFirstHeading(){
        return FIRST_HEADING.getText();
    }
    public void selectLanguageResultPage(String language) throws InterruptedException {

        LANGUAGE_RESULT_PAGE.click();
        LANGUAGE_SEARCH.click();
        LANGUAGE_SEARCH.sendKeys(language);
        Driver.get().findElement(By.xpath("//a[text()='"+language+"']")).click();
    }
    public void verifyResultPageInSelectedLanguage(String language) throws InterruptedException {

        try{
            selectLanguageResultPage(language);
        }catch (Exception e){
            //When this message is seen, result page is in selected language
            Assert.assertTrue(NO_RESULT_FOUND_MESSAGE.isDisplayed());
        }
    }

    public void verifyTheLinkToEnglish(){
        Assert.assertTrue(ENGLISH_LINK.isEnabled());
    }
}
