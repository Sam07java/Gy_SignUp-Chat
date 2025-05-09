package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.RegistrationPage;

public class Registration_Validation {

    WebDriver driver;
    RegistrationPage rp;

    @Given("Navigate Registration Page")
    public void navigate_registration_page() {
        rp = new RegistrationPage(Hook.driver);
        rp.click_Registration_Button();
    }

    @When("User Enter Email {string} and Password {string}")
    public void user_enter_email_and_password(String string, String string2) {
        rp.Enter_Email(string);
        rp.Enter_Password(string2);
        rp.click_checkBox_TermsAndCondition();
    }

    @Then("Click SignUp Button")
    public void click_sign_up_button() throws InterruptedException {
        rp.click_SignUp_Now();
        Thread.sleep(15000);
       // rp.registration_Validation();
    }


    @When("User Enter Email {string}, Password {string}, phoneNo {string}")
    public void userEnterEmailPasswordPhoneNo(String arg0, String arg1, String arg2) {
        rp.Enter_Email(arg0);
        rp.Enter_Password(arg1);
        rp.Enter_phoneNo(arg2);
        rp.click_checkBox_TermsAndCondition();
    }
}