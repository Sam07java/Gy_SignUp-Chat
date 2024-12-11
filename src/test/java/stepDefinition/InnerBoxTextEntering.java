package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.Student_DashBoard_InnerChatBox;
import utility.DatePicker;

public class InnerBoxTextEntering {

    WebDriver driver;
    LoginPage lop;
    Student_DashBoard_InnerChatBox sd;
    DatePicker dp;

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
    public void enter_user_detail_on_dashboard_inner_box() throws InterruptedException {
        sd=new Student_DashBoard_InnerChatBox(Hook.driver);
        sd.enter_Your_FullName("Suraj Venjaramood");
      //  Thread.sleep(3000);
       // sd.dateClick();
       // sd.select_Your_DOB("12/01/1998");
        dp=new DatePicker(Hook.driver);
        dp.datepickerG("17","May","2017");

       // sd.datepicker();
        sd.enter_main_learning_goal("asasasasa");
        sd.select_Gender("ma");
        sd. enter_Mother_Name("Sarasu P");
        sd.enter_Father_Name("Sushanth S");
        sd.enter_Quardian_Name("Sharafudheen S");
        sd.Upload_Profile_Picture("C:\\Users\\WIIS\\Pictures\\one piece\\1471770.jpg");
    }

    @Then("Enter phone no.")
    public void enter_phone_no() {

    }


}
