package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;
import page.Student_DashBoard;
import page.Student_DashBoard_InnerChatBox;
import utility.DatePicker;

import java.util.Scanner;

public class InnerBoxTextEntering {

    LoginPage lop;
    Student_DashBoard_InnerChatBox sd;
    HomePage hp;
    DatePicker dp;
    Student_DashBoard sdi;

    @Given("Enter Student Valid Credential on SigIn Page Email {string} and Password {string}")
    public void enter_student_valid_credential_on_sig_in_page_email_and_password(String string, String string2) {
        lop= new LoginPage(Hook.driver);
        hp=new HomePage(Hook.driver);
        hp.SignIn_with_Email();
        lop.EnterUserName(string);
        lop.EnterPassword(string2);
    }

    @When("Click SignIn Button")
    public void click_sign_in_button() throws InterruptedException {
        lop.ClickSign_Now();
        Thread.sleep(4000);
    }

    @When("Enter User detail on Dashboard Inner ChatBox")
    public void enter_user_detail_on_dashboard_inner_box() throws InterruptedException {
        sd=new Student_DashBoard_InnerChatBox(Hook.driver);
        sd.enter_Your_FullName("Suraj Venjaramood");
       // sd.select_Your_DOB("12/01/1998");
        dp=new DatePicker(Hook.driver);
        dp.datepickerG("17","January","2015");
        sd.enter_main_learning_goal("To get Higher Mark");
        sd.select_Gender();
        sd.enter_Mother_Name("Saara P");
        sd.enter_Father_Name("Nasar S");
        sd.enter_Quardian_Name("Sharafudheen S");
        sd.Upload_Profile_Picture("C:\\Users\\WIIS\\Pictures\\one piece\\1471770.jpg");
        sd.select_institute_type("School");
        sd.select_your_board();
        sd.select_your_class();
        sd.choose_your_hobbies("running");
        sd.select_known_language("Hindi");
        sd.select_proficiency();
        sd.select_your_mobile_number_country_code();
        sd.What_is_your_mobile_number("9898765443");
        sd.What_is_your_WhatsApp_number("9876543422");
        sd.Select_your_subject_name("English");
        sd.What_is_your_preference("Mathematics");
        sd.Add_your_score_in_percentage("67");
        sd.select_your_current_country_of_residence("india");
        sd.which_state_do_you_currently_reside_in("Kerala");
        sd.which_district("alappuzha");
        sd.which_city("cherthala");
        sd.enter_pin_Code("767676");
        sd.enter_first_address("Manzil");
        sd.what_is_your_second_address("same");
    }

    @Then("Validate whether Inner ChatBox is Completed")
    public void enter_phone_no() throws InterruptedException {

        sd.validateInnerChatBox();
        System.out.println("Profile Inner Chat Automated Successfully");
        Thread.sleep(4000);
        sdi=new Student_DashBoard(Hook.driver);
        sdi.logOut();

    }


}
