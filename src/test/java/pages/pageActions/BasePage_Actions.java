package pages.pageActions;

import org.openqa.selenium.support.ui.Select;
import pages.pageElements.BasePage;
import utilities.Driver;

public class BasePage_Actions extends BasePage {

    public void typeInSearchBox (String str) {
        SEARCH_BOX.sendKeys(str);
    }

    public void clickSearchButton(){
        SEARCH_BUTTON.click();
    }
    public void selectLanguage(String language){
        LANGUAGE_BUTTON.click();
        Select languageDropdown = new Select(LANGUAGE_BUTTON);
        String firstSelectedOption = languageDropdown.getFirstSelectedOption().getText();

        if(firstSelectedOption.equals(language)){
            languageDropdown.getFirstSelectedOption().click();
        }else{
            languageDropdown.selectByVisibleText(language);
        }
    }
}
