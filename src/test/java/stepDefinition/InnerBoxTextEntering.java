package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.xmlbeans.soap.SOAPArrayType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;
import page.Student_DashBoard;
import page.Student_DashBoard_InnerChatBox;
import utility.DatePicker;
import utility.ExelUtility;
import utility.Screenshot;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InnerBoxTextEntering {

    LoginPage lop;
    Student_DashBoard_InnerChatBox sd;
    HomePage hp;
    DatePicker dp;
    Student_DashBoard sdi;
    ExelUtility exelUtility;
    Screenshot screenshot;
    String path="F:\\Gyansetu\\G_TestCase001\\src\\test-data\\data for sign-up chat.xlsx";
    private final Logger logger= LogManager.getLogger(this.getClass().getName());


    @Given("Navigate to SignIn Page.")
    public void Navigate_to_SignIn_Page(){
        logger.info("Initializing LoginPage and HomePage");
        lop = new LoginPage(Hook.driver);
        hp = new HomePage(Hook.driver);

        logger.info("Navigating to SignIn via HomePage");
        hp.SignIn_with_Email();
        logger.info("SignIn page loaded");
    }

    @When("Fetch data from Excel sheet for Sign In {string}, {int} and Enter credentials in SignIn.")
    public void fetchDataFromExcelSheetForSignInAndEnterCredentialsInSignIn(String sheet, Integer row) throws IOException {
        logger.info("Fetching SignIn credentials from Excel: Sheet = {}, Row = {}", sheet, row);
        exelUtility = new ExelUtility(path);
        List<Map<String, String>> signupdata = exelUtility.storeData(path, sheet);

        String userid = signupdata.get(row).get("Email ID");
        logger.info("Fetched Email ID: {}", userid);

        lop = new LoginPage(Hook.driver);
        lop.EnterUserName(userid);
        logger.info("Entered Email ID in SignIn field");

        String password = signupdata.get(row).get("Password");
        logger.info("Fetched Password: ********");
        lop.EnterPassword(password);
        logger.info("Entered Password in SignIn field");
    }

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
        logger.info("Clicking the Sign In button");
        lop.ClickSign_Now();
        logger.info("Sign In button clicked successfully");
        // Optional wait (uncomment if needed for sync)
        // Thread.sleep(4000);
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
        sd.select_School_type();
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
        logger.info("Starting Inner ChatBox validation");

        boolean result = sd.validateInnerChatBox();
        if (result) {
            logger.info("Profile Inner Chat Automated Successfully");
        } else {
            logger.warn("Profile Inner Chat automation failed or element not visible");
        }

        Thread.sleep(4000);

        sdi = new Student_DashBoard(Hook.driver);
        logger.info("Logging out from student dashboard");
        sdi.logOut();
    }


    @And("Fetch data from Excel sheet for SignUp-Chat {string}, {} and enter details on signup-chat.")
    public void fetchDataFromExcelSheetForSignUpChatAndEnterDetailsOnSignupChat(String sheetSignupchat, Integer roww) throws IOException, InterruptedException {
        logger.info("Fetching data from Excel sheet: {}", sheetSignupchat);

        exelUtility = new ExelUtility(path);
        List<Map<String, String>> signupdata = exelUtility.storeData(path, sheetSignupchat);

        try {
            // Enter First Name
            String name = signupdata.get(roww).get("Full Name");
            logger.info("Entering Full Name: {}", name);
            sd = new Student_DashBoard_InnerChatBox(Hook.driver);
            sd.enter_Your_FullName(name);

            // DOB Select
            String dobdate = signupdata.get(roww).get("DOBdate");
            String dobMonth = signupdata.get(roww).get("DOBmonth");
            String dobyear = signupdata.get(roww).get("DOByear");
            logger.info("Entering Date of Birth: {}-{}-{}", dobdate, dobMonth, dobyear);
            dp = new DatePicker(Hook.driver);
            dp.datepickerG(dobdate, dobMonth, dobyear);

            // Main learning Goal
            String learningGoal = signupdata.get(roww).get("Main learning goal");
            logger.info("Entering Main Learning Goal: {}", learningGoal);
            sd.enter_main_learning_goal(learningGoal);

            // Gender
            String gender = signupdata.get(roww).get("Gender");
            logger.info("Selecting Gender: {}", gender);
            sd.select_Gender();

            // Mother Name
            String mothername = signupdata.get(roww).get("Mother Name");
            logger.info("Entering Mother's Name: {}", mothername);
            sd.enter_Mother_Name(mothername);

            // Father Name
            String fathername = signupdata.get(roww).get("Father Name");
            logger.info("Entering Father's Name: {}", fathername);
            sd.enter_Father_Name(fathername);

            // Guardian Name
            String guardianName = signupdata.get(roww).get("Guardian Name");
            logger.info("Entering Guardian Name: {}", guardianName);
            sd.enter_Quardian_Name(guardianName);

            // Upload PP
            String uploadPp = signupdata.get(roww).get("Upload PP");
            logger.info("Uploading Profile Picture");
            sd.Upload_Profile_Picture(uploadPp);

            // Institute type
            logger.info("Selecting Institute type");
            sd.select_School_type();

            // School Name
            String schoolName = signupdata.get(roww).get("School Name");
            logger.info("Selecting School Name: {}", schoolName);
            sd.user_select_schoolName(schoolName);

            // Board
            logger.info("Selecting Board");
            sd.select_your_board();

            // Class
            String classes = signupdata.get(roww).get("Classes");
            logger.info("Selecting Class: {}", classes);
            sd.select_your_classes(classes);

            // Hobbies
            String hobbies = signupdata.get(roww).get("Hobbies");
            logger.info("Selecting Hobbies: {}", hobbies);
            sd.choose_your_hobbies(hobbies);

            // Language
            String language = signupdata.get(roww).get("Language");
            logger.info("Selecting Known Language: {}", language);
            Thread.sleep(500);
            sd.select_known_language(language);

            // Language proficiency
            logger.info("Selecting Language Proficiency");
            sd.select_proficiency();

            // Country Code
            logger.info("Selecting Country Code");
            sd.select_your_mobile_number_country_code();

            // WhatsApp No.
            String whatsappno = signupdata.get(roww).get("WhatsApp No.");
            logger.info("Entering WhatsApp Number: {}", whatsappno);
            sd.What_is_your_mobile_number(whatsappno);

            // Subject Name
            String sujectname = signupdata.get(roww).get("Subject Name");
            logger.info("Selecting Subject Name: {}", sujectname);
            sd.Select_your_subject_name(sujectname);

            // Preference
            String preference = signupdata.get(roww).get("Preference");
            logger.info("Selecting Preference: {}", preference);
            sd.What_is_your_preference(preference);

            // Score Percentage
            String scorePercentage = signupdata.get(roww).get("Score Percentage");
            logger.info("Entering Score Percentage: {}", scorePercentage);
            sd.Add_your_score_in_percentage(scorePercentage);

            // Select Teacher
            String teacher = signupdata.get(roww).get("Select Teacher");
            logger.info("Selecting Teacher: {}", teacher);
            sd.user_select_teacherName(teacher);

            // Country
            String country = signupdata.get(roww).get("Country");
            logger.info("Selecting Country: {}", country);
            sd.select_your_current_country_of_residence(country);

            // State
            String state = signupdata.get(roww).get("State");
            logger.info("Selecting State: {}", state);
            sd.select_your_current_country_of_residence(state);

            // District
            String district = signupdata.get(roww).get("District");
            logger.info("Selecting District: {}", district);
            sd.which_district(district);

            // City
            String city = signupdata.get(roww).get("City");
            logger.info("Selecting City: {}", city);
            sd.which_city(city);

            // Pin code
            String pincode = signupdata.get(roww).get("Pin code");
            logger.info("Entering Pin code: {}", pincode);
            sd.enter_pin_Code(pincode);

            // First Address
            String firstAddress = signupdata.get(roww).get("First Address");
            logger.info("Entering First Address: {}", firstAddress);
            sd.enter_first_address(firstAddress);

            // Second Address
            String secondAddresss = signupdata.get(roww).get("Second Addresss");
            logger.info("Entering Second Address: {}", secondAddresss);
            sd.what_is_your_second_address(secondAddresss);

        } catch (Exception e) {
            logger.error("Error occurred while filling signup chat details: {}", e.getMessage());
            Screenshot.captureScreenshot(Hook.driver, "SignUpChat_Failure_" + roww);
            throw e;  // Re-throw the exception after logging
        }
    }

    @Then("Verified sign-up chat is completed.")
    public void verifiedSignUpChatIsComplited() throws InterruptedException {
        logger.info("Starting sign-up chat verification");

        boolean result = sd.validateInnerChatBox();
        if (result) {
            logger.info("Profile Inner Chat automated successfully.");
        } else {
            logger.error("Profile Inner Chat automation failed. Capturing screenshot...");
            Screenshot.captureScreenshot(Hook.driver, "SignUpChat_Failure");
            Assert.fail("Profile Inner Chat was not completed successfully.");
        }

        Thread.sleep(1000); // Optional wait for synchronization

        sdi = new Student_DashBoard(Hook.driver);
        logger.info("Logging out from student dashboard.");
        sdi.logOut();
    }

}
