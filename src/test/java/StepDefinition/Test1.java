package StepDefinition;

import Browser.browser;
import Screenshot.Capturescreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static Browser.browser.driver;

public class Test1
{
    @Given("As a User opens the browser")
    public void as_a_user_opens_the_browser() throws Exception
    {
        browser.setDriver();
    }
    @Then("As a user enters the url {string} of the application")
    public void as_a_user_enters_the_url_of_the_application(String string) throws Exception
    {
      browser.geturl();
    }
    @And("As a user verify the Title of the application")
    public void as_a_user_verify_the_title_of_the_application() throws Exception {
        Capturescreen.screenShot(1);
        Assert.assertEquals(driver.getTitle(), "Smartbazaar – World of Asian Foods");
    }
    @Then("As a user close the browser")
    public void as_a_user_close_the_browser()
    {
       browser.closebrowser();
    }


}
