package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage{

    @FindBy(id = "firstHeading")
    public WebElement FIRST_HEADING;

    @FindBy(css = ".mw-interlanguage-selector.mw-ui-button")
    public WebElement LANGUAGE_RESULT_PAGE;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement LANGUAGE_SEARCH;

    @FindBy(css = "h2.uls-no-results-found-title")
    public WebElement NO_RESULT_FOUND_MESSAGE;

    @FindBy(xpath = "//span[text()='English']")
    public WebElement ENGLISH_LINK;
}
