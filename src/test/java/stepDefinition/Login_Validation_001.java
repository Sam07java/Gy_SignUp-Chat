package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import page.LoginPage;
import page.Student_DashBoard;
//import hooks.Hook;

public class Login_Validation_001 {

    LoginPage loginpage;
    HomePage hp;
    Student_DashBoard sd;

    @Given("Navigate to Login Page")
    public void navigate_to_login_page() throws InterruptedException {

        //Thread.sleep(2000);
        loginpage= new LoginPage(Hook.driver);
        hp=new HomePage(Hook.driver);
        hp.SignIn_with_Email();
    }
    @When("Enter the valid Credential {string} and {string}")
    public void enter_the_valid_credential_and(String username, String password) {
        loginpage.EnterUserName(username);
        //runmba@gmail.com
        loginpage.EnterPassword(password);

    }
    @Then("Validate Dashboard is Displayed")
    public void validate_dashboard_displayed_or_not() throws InterruptedException {
        loginpage.ClickSign_Now();
        loginpage.validatestudentpriflelogin();

        sd=new Student_DashBoard(Hook.driver);
        sd.logOut();



    }

}
