package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.By;
import page.Student_DashBoard;
import page.studentprofile_edit.*;

import static hooks.Hook.driver;

public class profileEditPage_Validation_With_SignUpChat {

    Student_DashBoard sd;
    Basic_informationPage bi;
    AddressPage ap;
    Hobbies_LanguagePage hpp;
    Academic_HistoryPage ahh;
    Contact_Details cd;
    Subject_Preference sp;

    @When("Validate whether First Name {string} with given input of SignUp Chat")
    public void validate_whether_first_name_with_given_input_of_sign_up_chat(String string) throws InterruptedException {
        sd=new Student_DashBoard(driver);
        sd.profile_edit_page();
        Thread.sleep(2000);
        bi=new Basic_informationPage(driver);
        try {
            Assert.assertEquals(string, bi.First_Name());
            System.out.println(bi.First_Name());
        }
        catch(AssertionError ignored)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.First_Name() + "]");
            Assert.fail("First Name Validation Failed");

        }


    }

    @When("Validate Last Name {string} with SignUp Chat Input.")
    public void validate_last_name_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, bi.Last_Name());
            System.out.println(bi.Last_Name());
        }
        catch (AssertionError ignored)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Last_Name() + "]");
            Assert.fail("Last Name Validation Failed");

        }
    }

    @When("Validate Date of Birth {string} with SignUp Chat Input.")
    public void validate_date_of_birth_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, bi.Date_of_Birth());
            System.out.println(bi.Date_of_Birth());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Date_of_Birth() + "]");
            Assert.fail("DOB Validation Failed");

        }
    }

    @When("Validate Father Name {string} with SignUp Chat Input.")
    public void validate_father_name_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, bi.Father_Name());
            System.out.println(bi.Father_Name());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Father_Name() + "]");
            Assert.fail("Father Name Validation Failed");

        }
    }

    @When("Validate Mother Name {string} with SignUp Chat Input.")
    public void validate_mother_name_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, bi.Mother_Name());
            System.out.println(bi.Mother_Name());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Mother_Name() + "]");
            Assert.fail("Mother Name Validation Failed");

        }
    }

    @When("Validate Quardian Name {string} with SignUp Chat Input.")
    public void validate_quardian_name_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, bi.Guardian_Name());
            System.out.println(bi.Guardian_Name());
        }
        catch (AssertionError error)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Guardian_Name() + "]");
            Assert.fail("Guardian Name Validation Failed");
        }
    }

    @When("Validate Gender with SignUp Chat Input.")
    public void validate_gender_with_sign_up_chat_input() {

            Assert.assertTrue(bi.Gender());

    }

    @Then("Click Submit Button")
    public void click_submit_button() {
        bi.Submit_Butten();
    }

    @Then("Validate whether the Address Page is Displayed")
    public void validate_whether_the_address_page_is_displayed() {
        ap=new AddressPage(driver);
    }

    @Then("Check if Country Selected is correct with the input from the SignUP chat {string}.")
    public void check_if_country_selected_is_correct_with_the_input_from_the_sign_up_chat(String string) {
        try {
            Assert.assertEquals(string, ap.Country_DropDown());
            System.out.println(ap.Country_DropDown());
        }
        catch (AssertionError e)
        {System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Country_DropDown() + "]");
            Assert.fail("Country selected Validation Failed");
        }
    }

    @Then("Check if State Selected is correct with the input from the SignUP chat {string}.")
    public void check_if_state_selected_is_correct_with_the_input_from_the_sign_up_chat(String string) {
        try {
            Assert.assertEquals(string, ap.State_DropDown());
            System.out.println(ap.State_DropDown());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.State_DropDown() + "]");
            Assert.fail("State selected Validation Failed");
        }
    }

    @Then("Check First Address with SignUp Input {string}")
    public void check_first_address_with_sign_up_input(String string) {
        try {
            Assert.assertEquals(string, ap.FirstAddress());
            System.out.println(ap.FirstAddress());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.FirstAddress() + "]");
            Assert.fail("First Address Validation Failed");
        }
    }

    @Then("Check Second Address with SignUp Input {string}")
    public void check_second_address_with_sign_up_input(String string) {
        try {
            Assert.assertEquals(string, ap.Address2());
            System.out.println(ap.Address2());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Address2() + "]");
            Assert.fail("Second Address Validation Failed");

        }
    }

    @Then("Check City Name with SignUp Input {string}")
    public void check_city_name_with_sign_up_input(String string) {
        try {
            Assert.assertEquals(string, ap.City());
            System.out.println(ap.City());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.City() + "]");
            Assert.fail("City Name Validation Failed");

        }
    }

    @Then("Check District Name with SignUp Input {string}")
    public void check_district_name_with_sign_up_input(String string) {
        try {
            Assert.assertEquals(string, ap.District());
            System.out.println(ap.District());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.District() + "]");
            Assert.fail("District Name Validation Failed");

        }
    }

    @Then("Check PinCode with SignUp Input {string}")
    public void check_pin_code_with_sign_up_input(String string) {
        try {
            Assert.assertEquals(string, ap.Pincode());
            System.out.println(ap.Pincode());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Pincode() + "]");
            Assert.fail("PinCode Validation Failed");

        }
    }

    @Then("Click the Same As Current Address.")
    public void click_the_same_as_current_address() {
        ap.Click_SameAs_Current_Address();
    }

    @Then("Click The Next Button.")
    public void click_the_next_button() {
        ap.Click_Next_Button();
    }

    @Then("Naviagte to Hobbies and Language Page.")
    public void naviagte_to_hobbies_and_language_page() {
        hpp=new Hobbies_LanguagePage(driver);
    }

    @Then("Verify that the hobbies are selected correctly with {string}.")
    public void verify_that_the_hobbies_are_selected_correctly_with(String string) throws InterruptedException {
        Thread.sleep(1000);
        try {
            Assert.assertEquals(string, hpp.Hobbies());
            System.out.println(hpp.Hobbies());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + hpp.Hobbies() + "]");
            Assert.fail("Hobbies selected Validation Failed");

        }
    }

    @Then("Verify that the language are selected corectly with {string}.")
    public void verify_that_the_language_are_selected_corectly_with(String string) {
        try {
            Assert.assertEquals(string, hpp.Language());
            System.out.println(hpp.Language());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + hpp.Language() + "]");
            Assert.fail("Language selected Validation Failed");

        }
    }

    @Then("Click Next Button")
    public void click_next_button() {
        hpp.Click_Button();
    }

    @Then("Verify whether Academic History Page is displayed or not")
    public void verify_whether_academic_history_page_is_displayed_or_not() {
        ahh=new Academic_HistoryPage(driver);
    }

    @Then("Verify the Institute type is {string} or {string} by Input of SignUp chat.")
    public void verify_the_institute_type_is_or_by_input_of_sign_up_chat(String string, String string2) {
        try {
            Assert.assertEquals(string, ahh.Institute_Type());
            System.out.println(ahh.Institute_Type());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Institute_Type() + "]");
            Assert.fail("Language selected Validation Failed");
        }
    }
    @Then("Check the board is {string} , {string} and {string} by Input of SignUp chat.")
    public void check_the_board_is_and_by_input_of_sign_up_chat(String string, String string2, String string3) {
        try {
            Assert.assertEquals(string, ahh.Board());
            System.out.println(ahh.Board());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Board() + "]");
            Assert.fail("Board selected Validation Failed");

        }
    }

    @Then("Check the Class is selected by Input of SignUp Chat {string}.")
    public void check_the_class_is_selected_by_input_of_sign_up_chat(String string) {
        try {
            Assert.assertEquals(string, ahh.Class());
            System.out.println(ahh.Class());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Class() + "]");
            Assert.fail("Class selected Validation Failed");

        }
    }

    @Then("Click the Next Button of Academic History")
    public void click_the_next_button_of_academic_history() {
        ahh.Click_Next_Button();
    }

    @Then("Check if Contact Details Page is Displayed or not")
    public void check_if_contact_details_page_is_displayed_or_not() {
        cd=new Contact_Details(driver);
    }

    @Then("Verify the mobile Number {string} with Input of SighUp Chat.")
    public void verify_the_mobile_number_with_input_of_sigh_up_chat(String string) {
        try {
            Assert.assertEquals(string, cd.Mobile_No());
            System.out.println(cd.Mobile_No());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Mobile_No() + "]");
            Assert.fail("Mobile Number Entered Validation Failed");
        }
    }

    @Then("Verify the whatzapp Number {string} with Input of SignUp Chat.")
    public void verify_the_whatzapp_number_with_input_of_sign_up_chat(String string) {
        try {
            Assert.assertEquals(string, cd.Whatsapp_No());
            System.out.println(cd.Whatsapp_No());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Whatsapp_No() + "]");
            Assert.fail("Whatzapp Number Entered Validation Failed");
        }
    }

    @Then("Check the Email dispayed Correct with sign in data {string}.")
    public void check_the_email_dispayed_correct_with_sign_in_data(String string) {
        try {
            Assert.assertEquals(string, cd.Email_id());
            System.out.println(cd.Email_id());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Email_id() + "]");
            Assert.fail("User Email Validation Failed");
        }
    }

    @Then("Click the Next Button of Contact Deatil Page.")
    public void click_the_next_button_of_contact_deatil_page() {
        cd.Click_Next_Button1();
    }

    @Then("Check if Subject Preference Page is displayed or not.")
    public void check_if_subject_preference_page_is_displayed_or_not() {
        sp=new Subject_Preference(driver);
    }

    @Then("Verify the Subject is selected {string} correct with signUp Chat.")
    public void verify_the_subject_is_selected_correct_with_sign_up_chat(String string) throws InterruptedException {
        Thread.sleep(1000);
        try {
            Assert.assertEquals(string, sp.Subject());
            System.out.println(sp.Subject());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Subject() + "]");
            Assert.fail("User Email Validation Failed");
        }
    }

    @Then("Check the subject preference is entered {string} is correct with SignUp chat Input.")
    public void check_the_subject_preference_is_entered_is_correct_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, sp.Preferene());
            System.out.println(sp.Preferene());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Subject() + "]");
            Assert.fail("User Email Validation Failed");
        }
    }

    @Then("Validate the Score Percentage {string} with SignUp Chat Input")
    public void validate_the_score_percentage_with_sign_up_chat_input(String string) {
        try {
            Assert.assertEquals(string, sp.Score_Percentage());
            System.out.println(sp.Score_Percentage());
        }
        catch (AssertionError e)
        {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Score_Percentage() + "]");
            Assert.fail("User Score Percentage Validation Failed");
        }
    }

    @Then("Click Submit button of Subject Preference page.")
    public void click_submit_button_of_subject_preference_page() {
        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill submit-btn']")).click();
    }

    @Then("Validate Profile Edit page is entered Completed or not.")
    public void validate_profile_edit_page_is_entered_completed_or_not() {
        System.out.println("Validation with SignUp chat with Profile edit details is successfull");
    }

}
