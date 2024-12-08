package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.Student_DashBoard_InnerChatBox;

public class InnerBoxTextEntering {

    WebDriver driver;
    LoginPage lop;
    Student_DashBoard_InnerChatBox sd;

    @Given("Enter Student Valid Credential on SigIn Page Email {string} and Password {string}")
    public void enter_student_valid_credential_on_sig_in_page_email_and_password(String string, String string2) {
        lop= new LoginPage(Hook.driver);
        lop.SignIn_with_Email();
        lop.EnterUserName(string);
        lop.EnterPassword(string2);
    }

    @When("Click SignIn Button")
    public void click_sign_in_button() throws InterruptedException {
        lop.ClickSign_Now();
        Thread.sleep(4000);
    }

    @When("Enter User detail on Dashboard Inner Box")
    public void enter_user_detail_on_dashboard_inner_box() {
        sd=new Student_DashBoard_InnerChatBox(driver);
        sd.enter_Your_FullName("Suraj Venjaramood");
    }

    @Then("Enter phone no.")
    public void enter_phone_no() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
