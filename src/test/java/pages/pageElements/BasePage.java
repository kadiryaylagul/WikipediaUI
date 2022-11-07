package pages.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement SEARCH_BOX;

    @FindBy(css = "button[type='submit']")
    public WebElement SEARCH_BUTTON;

    @FindBy(id = "searchLanguage")
    public WebElement LANGUAGE_BUTTON;

    @FindBy(id = "js-link-box-en")
    public WebElement ENGLISH_LANGUAGE_BUTTON;


    @FindBy(id = "wpName1")
    public WebElement USER_NAME_INPUT;

    @FindBy(id = "wpPassword1")
    public WebElement PASSWORD_INPUT;

    @FindBy(id = "wpLoginAttempt")
    public WebElement SIGN_IN_BUTTON;

    @FindBy(xpath = "//span[text()='Log in']")
    public WebElement LOG_IN_BUTTON;

    @FindBy(xpath = "//li[@id='pt-userpage']/a")
    public WebElement LOGIN_CONTROL;






}
