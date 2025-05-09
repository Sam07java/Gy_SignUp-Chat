package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import page.Student_DashBoard;
import page.studentprofile_edit.*;

import java.util.List;

import static hooks.Hook.driver;

public class profileEditPage_Validation_With_SignUpChat {

    Student_DashBoard sd;
    Basic_informationPage bi;
    AddressPage ap;
    Hobbies_LanguagePage hpp;
    Academic_HistoryPage ahh;
    Contact_Details cd;
    Subject_Preference sp;
    SoftAssert sa;

    @When("Validate whether First Name {string} with given input of SignUp Chat")
    public void validate_whether_first_name_with_given_input_of_sign_up_chat(String firstName) throws InterruptedException {
        sd=new Student_DashBoard(driver);
       // sd.profile_edit_page();
       // Thread.sleep(2000);
        bi=new Basic_informationPage(driver);
        sa=new SoftAssert();

        try {
            sa.assertEquals(firstName, bi.First_Name());
            System.out.println(bi.First_Name());
        } catch(AssertionError ignored) {
            System.out.println("Assertion failed: Expected [" + firstName + "], but found [" + bi.First_Name() + "]");
            sa.fail("First Name Validation Failed");
        }
     //   sa.assertAll();
    }

    @When("Validate Last Name {string} with SignUp Chat Input.")
    public void validate_last_name_with_sign_up_chat_input(String string) {
       // SoftAssert sa1=new SoftAssert();
        try {
            sa.assertEquals(string, bi.Last_Name());
            System.out.println(bi.Last_Name());
        } catch (AssertionError ignored) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Last_Name() + "]");
            sa.fail("Last Name Validation Failed");
        }
      //  sa.assertAll();

    }

    @When("Validate Date of Birth {string} with SignUp Chat Input.")
    public void validate_date_of_birth_with_sign_up_chat_input(String string) {

      //  SoftAssert sa2=new SoftAssert();
        try {
            sa.assertEquals(string, bi.Date_of_Birth());
            System.out.println(bi.Date_of_Birth());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Date_of_Birth() + "]");
            sa.fail("DOB Validation Failed");
        }
       // sa2.assertAll();
    }

    @When("Validate Father Name {string} with SignUp Chat Input.")
    public void validate_father_name_with_sign_up_chat_input(String string) {
      //  SoftAssert sa3=new SoftAssert();
        try {
            sa.assertEquals(string, bi.Father_Name());
            System.out.println(bi.Father_Name());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Father_Name() + "]");
            sa.fail("Father Name Validation Failed");
        }
       // sa3.assertAll();
    }

    @When("Validate Mother Name {string} with SignUp Chat Input.")
    public void validate_mother_name_with_sign_up_chat_input(String string) {
     //   SoftAssert sa4=new SoftAssert();
        try {
            sa.assertEquals(string, bi.Mother_Name());
            System.out.println(bi.Mother_Name());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Mother_Name() + "]");
            sa.fail("Mother Name Validation Failed");
        }
       // sa4.assertAll();
    }

    @When("Validate Quardian Name {string} with SignUp Chat Input.")
    public void validate_quardian_name_with_sign_up_chat_input(String string) {
      //  SoftAssert sa5=new SoftAssert();
        try {
            sa.assertEquals(string, bi.Guardian_Name());
            System.out.println(bi.Guardian_Name());
        } catch (AssertionError error) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + bi.Guardian_Name() + "]");
            sa.fail("Guardian Name Validation Failed");
        }
      //  sa5.assertAll();
    }

    @When("Validate Gender with SignUp Chat Input.")
    public void validate_gender_with_sign_up_chat_input() {
        SoftAssert s=new SoftAssert();
            sa.assertTrue(bi.Gender());

    }

    @Then("Click Submit Button")
    public void click_submit_button() {
        bi.Submit_Butten();
      // sa.assertAll();
    }

    @Then("Validate whether the Address Page is Displayed")
    public void validate_whether_the_address_page_is_displayed() {
        ap=new AddressPage(driver);
    }

    @Then("Check if Country Selected is correct with the input from the SignUP chat {string}.")
    public void check_if_country_selected_is_correct_with_the_input_from_the_sign_up_chat(String string) {
     //   SoftAssert sa6=new SoftAssert();
        try {
            sa.assertEquals(string, ap.Country_DropDown());
            System.out.println(ap.Country_DropDown());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Country_DropDown() + "]");
            sa.fail("Country selected Validation Failed");
        }
       // sa.assertAll();
    }

    @Then("Check if State Selected is correct with the input from the SignUP chat {string}.")
    public void check_if_state_selected_is_correct_with_the_input_from_the_sign_up_chat(String string) {
      //  SoftAssert sa7=new SoftAssert();
        try {
            sa.assertEquals(string, ap.State_DropDown());
            System.out.println(ap.State_DropDown());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.State_DropDown() + "]");
            sa.fail("State selected Validation Failed");
        }
      //  sa7.assertAll();
    }

    @Then("Check First Address with SignUp Input {string}")
    public void check_first_address_with_sign_up_input(String string) {
      //  SoftAssert sa8=new SoftAssert();
        try {
            sa.assertEquals(string, ap.FirstAddress());
            System.out.println(ap.FirstAddress());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.FirstAddress() + "]");
            sa.fail("First Address Validation Failed");
        }
      //  sa.assertAll();
    }

    @Then("Check Second Address with SignUp Input {string}")
    public void check_second_address_with_sign_up_input(String string) {
       // SoftAssert sa=new SoftAssert();
        try {
            sa.assertEquals(string, ap.Address2());
            System.out.println(ap.Address2());
        } catch (AssertionError e){
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Address2() + "]");
            sa.fail("Second Address Validation Failed");
        }
      //  sa.assertAll();
    }

    @Then("Check City Name with SignUp Input {string}")
    public void check_city_name_with_sign_up_input(String string) {
       // SoftAssert sa10=new SoftAssert();
        try {
            sa.assertEquals(string, ap.City());
            System.out.println(ap.City());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.City() + "]");
            sa.fail("City Name Validation Failed");
        }
      //  sa.assertAll();
    }

    @Then("Check District Name with SignUp Input {string}")
    public void check_district_name_with_sign_up_input(String string) {
       // SoftAssert sa01=new SoftAssert();
        try {
            sa.assertEquals(string, ap.District());
            System.out.println(ap.District());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.District() + "]");
            sa.fail("District Name Validation Failed");
        }
      //  sa.assertAll();
    }

    @Then("Check PinCode with SignUp Input {string}")
    public void check_pin_code_with_sign_up_input(String string) {
      //  SoftAssert sa02=new SoftAssert();
        try {
            sa.assertEquals(string, ap.Pincode());
            System.out.println(ap.Pincode());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ap.Pincode() + "]");
            sa.fail("PinCode Validation Failed");
        }
     //   sa.assertAll();
    }

    @Then("Click the Same As Current Address.")
    public void click_the_same_as_current_address() {
        ap.Click_SameAs_Current_Address();
    }

    @Then("Click The Next Button.")
    public void click_the_next_button() {
        ap.Click_Next_Button();
       // sa.assertAll();
    }

    @Then("Naviagte to Hobbies and Language Page.")
    public void naviagte_to_hobbies_and_language_page() {
        hpp=new Hobbies_LanguagePage(driver);
    }

    @Then("Verify that the hobbies are selected correctly with {string}.")
    public void verify_that_the_hobbies_are_selected_correctly_with(String string) throws InterruptedException {
       // SoftAssert sa03=new SoftAssert();
        Thread.sleep(1000);
        try {
            sa.assertEquals(string, hpp.Hobbies());
            System.out.println(hpp.Hobbies());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + hpp.Hobbies() + "]");
            sa.fail("Hobbies selected Validation Failed");
        }
     //   sa.assertAll();
    }

    @Then("Verify that the language are selected corectly with {string}.")
    public void verify_that_the_language_are_selected_corectly_with(String string) throws InterruptedException {
      //  SoftAssert sa04=new SoftAssert();
        Thread.sleep(1000);
        try {
            sa.assertEquals(string, hpp.Language());
            System.out.println(hpp.Language());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + hpp.Language() + "]");
            sa.fail("Language selected Validation Failed");
        }
    //    sa.assertAll();
    }

    @Then("Click Next Button")
    public void click_next_button() {
        hpp.Click_Button();
      //  sa.assertAll();
    }

    @Then("Verify whether Academic History Page is displayed or not")
    public void verify_whether_academic_history_page_is_displayed_or_not() {
        ahh=new Academic_HistoryPage(driver);
    }

    @Then("Verify the Institute type is {string} or {string} by Input of SignUp chat.")
    public void verify_the_institute_type_is_or_by_input_of_sign_up_chat(String string, String string2) {

        try {
            sa.assertEquals(string, ahh.Institute_Type());
            System.out.println(ahh.Institute_Type());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Institute_Type() + "]");
            sa.fail("Institute selected Validation Failed");
        }
    }

    @Then("Verify the Institute type is selected {string} by Input of SignUp chat.")
    public void verify_the_Institute_type_is_selected_by_input_of_signup_chat(String string)
    {
        try {
            sa.assertEquals(string, ahh.institute_type_college());
            System.out.println(ahh.institute_type_college());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.institute_type_college() + "]");
            sa.fail("Institute selected Validation Failed");
        }
    }

    @Then("Check the University is selected {string} by Input of SignUp chat.")
    public void check_the_university_is_selected_by_inout_of_signup_chat(String university) {
        System.out.println("University checking");
       List<String> elemt= ahh.universityName();
        boolean isFound = false;
        for (String unive_rsity : elemt) {
            System.out.println(unive_rsity);
            if (unive_rsity.equalsIgnoreCase(university)) {// Case-insensitive comparison
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The value exists in the ArrayList.");
        } else {
            System.out.println("The value does not exist in the ArrayList.");
        }
        try {
            sa.assertEquals(true, isFound);
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + university + "], but found [" + isFound + "]");
            sa.fail("Institute selected Validation Failed");
        }
    }

    @Then("Check the Institute Name is corrent by Input of SignUp Chat {string}.")
    public void check_the_institute_Name(String string)
    {
        System.out.println("Institute checking");
        List<String> elemt= ahh.universityName();
        boolean isFound = false;
        for (String unive_rsity : elemt) {
            if (unive_rsity.equalsIgnoreCase(string)) {// Case-insensitive comparison
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The value exists in the ArrayList.");
        } else {
            System.out.println("The value does not exist in the ArrayList.");
        }
        try {
            sa.assertEquals(true, isFound);
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + isFound + "]");
            sa.fail("Institute selected Validation Failed");
        }
    }
    @Then("Check the Course is selected {string} by input of signUp Chat.")
    public void check_the_course_is_selected(String string)
    {
        System.out.println("Course checking");
        List<String> elemt= ahh.universityName();
        boolean isFound = false;
        for (String unive_rsity : elemt) {
            if (unive_rsity.equalsIgnoreCase(string)) {// Case-insensitive comparison
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The value exists in the ArrayList.");
        } else {
            System.out.println("The value does not exist in the ArrayList.");
        }
        try {
            sa.assertEquals(true, isFound);
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + isFound + "]");
            sa.fail("Course selected Validation Failed");
        }
    }

    @Then("Verify the Year is displayed {string} as per the input of signup chat")
    public void verify_the_year_is_displayed(String string)
    {
       // ahh.year();
        try {
            sa.assertEquals(string, ahh.year());
            System.out.println(ahh.year());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.year() + "]");
            sa.fail("Board selected Validation Failed");
        }
    }

    @Then("Check the board is {string} , {string} and {string} by Input of SignUp chat.")
    public void check_the_board_is_and_by_input_of_sign_up_chat(String string, String string2, String string3) {
        try {
            sa.assertEquals(string, ahh.Board());
            System.out.println(ahh.Board());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Board() + "]");
            sa.fail("Board selected Validation Failed");

        }
    }

    @Then("Check the Class is selected by Input of SignUp Chat {string}.")
    public void check_the_class_is_selected_by_input_of_sign_up_chat(String string) {
        try {
            sa.assertEquals(string, ahh.Class());
            System.out.println(ahh.Class());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + ahh.Class() + "]");
            sa.fail("Class selected Validation Failed");

        }
    }

    @Then("Click the Next Button of Academic History")
    public void click_the_next_button_of_academic_history() {
        ahh.Click_Next_Button();
       // sa.assertAll();
    }

    @Then("Check if Contact Details Page is Displayed or not")
    public void check_if_contact_details_page_is_displayed_or_not() {
        cd=new Contact_Details(driver);
    }

    @Then("Verify the mobile Number {string} with Input of SighUp Chat.")
    public void verify_the_mobile_number_with_input_of_sigh_up_chat(String string) {
        try {
            sa.assertEquals(string, cd.Mobile_No());
            System.out.println(cd.Mobile_No());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Mobile_No() + "]");
            sa.fail("Mobile Number Entered Validation Failed");
        }
    }

    @Then("Verify the whatzapp Number {string} with Input of SignUp Chat.")
    public void verify_the_whatzapp_number_with_input_of_sign_up_chat(String string) {
        try {
            sa.assertEquals(string, cd.Whatsapp_No());
            System.out.println(cd.Whatsapp_No());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Whatsapp_No() + "]");
            sa.fail("Whatzapp Number Entered Validation Failed");
        }
    }

    @Then("Check the Email dispayed Correct with sign in data {string}.")
    public void check_the_email_dispayed_correct_with_sign_in_data(String string) {
        try {
            sa.assertEquals(string, cd.Email_id());
            System.out.println(cd.Email_id());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + cd.Email_id() + "]");
            sa.fail("User Email Validation Failed");
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

    @Then("Verify the Subject Preference is selected {string} correct with signUp Chat.")
    public void verify_the_subject_is_selected_correct_with_sign_up_chat(String string) throws InterruptedException {
        Thread.sleep(1000);
        //collage
        try {
            sa.assertEquals(string, sp.Subject());
            System.out.println(sp.Subject());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Subject() + "]");
            sa.fail("User Email Validation Failed");
        }
    }

    @Then("Verify the Subject is selected {string} correct with signUp Chat.")
    public void verify_the_subjrct(String string) throws InterruptedException {
        Thread.sleep(1000);
        //School
        try {
            sa.assertEquals(string, sp.Subject());
            System.out.println(sp.Subject());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Subject() + "]");
            sa.fail("User Email Validation Failed");
        }
    }

    @Then("Check the subject preference is entered {string} is correct with SignUp chat Input.")
    public void check_the_subject_preference_is_entered_is_correct_with_sign_up_chat_input(String string) {
        try {
            sa.assertEquals(string, sp.Preferene());
            System.out.println(sp.Preferene());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Preferene() + "]");
            sa.fail("User Email Validation Failed");
        }
    }

    @Then("Validate the Score Percentage {string} with SignUp Chat Input")
    public void validate_the_score_percentage_with_sign_up_chat_input(String string) {
        try {
            sa.assertEquals(string, sp.Score_Percentage());
            System.out.println(sp.Score_Percentage());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.Score_Percentage() + "]");
            sa.fail("User Score Percentage Validation Failed");
        }
    }

    @Then("Check the semester is selected by input of signup chat{string}")
    public void check_the_semester_is_selected_by_input_of_signup_chat(String string)
    {
        try {
            sa.assertEquals(string, sp.semester_verification());
            System.out.println(sp.semester_verification());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: Expected [" + string + "], but found [" + sp.semester_verification() + "]");
            sa.fail("User Score Percentage Validation Failed");
        }
    }
    @Then("Click Submit button of Subject Preference page.")
    public void click_submit_button_of_subject_preference_page() {
        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill submit-btn']")).click();
    }

    @Then("Validate Profile Edit page is entered Completed or not.")
    public void validate_profile_edit_page_is_entered_completed_or_not() throws InterruptedException {
        System.out.println("Validation with SignUp chat with Profile edit details is successfull");
        sd.logOut();
        sa.assertAll();
    }
}
