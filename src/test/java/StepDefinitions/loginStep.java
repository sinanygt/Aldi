package StepDefinitions;

import POM.loginTag;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import utulities.ConfigurationReader;
import utulities.Driver;

import java.util.concurrent.TimeUnit;

public class loginStep  {


    @Given("Go to Aldi website")
    public void go_to_aldi_website() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @And("Click Cookies")
    public void clickCookies() {
        new loginTag().Cookies.click();

    }

    @Given("Click Anmeldan")
    public void click_anmeldan_login() {
    new loginTag().login.click();
    }

    @Given("Click E-Mail adresse box")
    public void click_e_mail_adresse_box() {
        new loginTag().email.click();
    }


    @Given("Write E-Mail adresse")
    public void write_e_mail_adresse() {
        //String email = ConfigurationReader.get("email");
       // Driver.get().get(email);
        new loginTag().email.sendKeys("sinanyigit8@gmail.com");
    }

    @Given("Click Password box")
    public void click_password_box() {
       new loginTag().password.sendKeys("123456");
    }

    @When("Click submit button")
    public void click_submit_button() {
        new loginTag().submit.click();
    }

    @Then("Verify success message")
    public void verify_success_message() {
       new loginTag().assertMyMessage();


    }


}
