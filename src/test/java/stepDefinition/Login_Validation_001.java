package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
//import hooks.Hook;

public class Login_Validation_001 {

    WebDriver driver;
    LoginPage lop;

    @Given("Navigate to Login Page")
    public void navigate_to_login_page() throws InterruptedException {

        //Thread.sleep(2000);
            lop= new LoginPage(Hook.driver);
            lop.SignIn_with_Email();
    }
    @When("Enter the valid Credential")
    public void enter_the_valid_credential() {

        lop.EnterUserName("arunmba@gmail.com");
        lop.EnterPassword("Arun@123");

    }
    @Then("Validate Dashboard Displayed or not")
    public void validate_dashboard_displayed_or_not() {
        lop.ClickSign_Now();
        lop.validatestudentpriflelogin();

    }

}
