package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.pageActions.BasePage_Actions;
import pages.pageActions.ResultPage_Actions;
import utilities.ConfigurationReader;
import utilities.Driver;

public class WikipediaStepDefs {

    BasePage_Actions basePageActions = new BasePage_Actions();
    ResultPage_Actions resultPageActions = new ResultPage_Actions();

    @Given("Navigate to URL")
    public void navigate_to_URL() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Type {string} in the search input field")
    public void type_in_the_search_input_field(String str) throws InterruptedException {
        basePageActions.typeInSearchBox(str);
        Thread.sleep(3000);
    }

    @And("Select {string} as the search language")
    public void selectAsTheSearchLanguage(String language) {
        basePageActions.selectLanguage(language);
    }

    @When("Click the search button")
    public void click_the_search_button() {
        basePageActions.clickSearchButton();
    }

    @Then("Validate that the first heading of the search results page matches {string} \\(ignoring the case)")
    public void validate_that_the_first_heading_of_the_search_results_page_matches_ignoring_the_case(String heading) {
        Assert.assertEquals(heading.toLowerCase(), resultPageActions.getTextFirstHeading().toLowerCase());
    }

    @And("Verify that the search results page is available in {string}")
    public void verifyThatTheSearchResultsPageIsAvailableIn(String language) throws InterruptedException {
        resultPageActions.selectLanguageResultPage(language);
        resultPageActions.verifyResultPageInSelectedLanguage(language);
    }

    @Then("Validate that the search results page in the new language includes a link to the version in English")
    public void validate_that_the_search_results_page_in_the_new_language_includes_a_link_to_the_version_in_English() {
        resultPageActions.verifyTheLinkToEnglish();
    }

    @Given("Select English language")
    public void selectEnglishLanguage() {
        basePageActions.ENGLISH_LANGUAGE_BUTTON.click();
    }

    @When("Click Login Button")
    public void clickLoginButton() {
        basePageActions.LOG_IN_BUTTON.click();
    }

    @Then("Set Valid Username and Password to Input boxes")
    public void setValidUsernameAndPasswordToInputBoxes() {
        basePageActions.USER_NAME_INPUT.sendKeys(ConfigurationReader.get("userName"));
        basePageActions.PASSWORD_INPUT.sendKeys(ConfigurationReader.get("password"));
    }

    @And("Click to Sign In Button")
    public void clickToSignInButton() {
        basePageActions.SIGN_IN_BUTTON.click();
    }


    @Then("Verify to successfull login")
    public void verifyToSuccessfullLogin() {
        String actualResult=basePageActions.LOGIN_CONTROL.getAttribute("href");
        String expectedResult=ConfigurationReader.get("userName");
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
