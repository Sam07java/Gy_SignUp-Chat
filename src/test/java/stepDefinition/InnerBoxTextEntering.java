package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.soap.SOAPArrayType;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;
import page.Student_DashBoard;
import page.Student_DashBoard_InnerChatBox;
import utility.DatePicker;
import utility.ExelUtility;

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
    String path="F:\\Gyansetu\\G_TestCase001\\src\\test-data\\data for sign-up chat.xlsx";

    @Given("Navigate to SignIn Page.")
    public void Navigate_to_SignIn_Page(){
        lop= new LoginPage(Hook.driver);
        hp=new HomePage(Hook.driver);
        hp.SignIn_with_Email();
    }
    @When("Fetch data from Excel sheet for Sign In {string}, {} and Enter credentials in SignIn.")
    public void fetchDataFromExcelSheetForSignInAndEnterCredentialsInSignIn(String sheet, Integer row) throws IOException {
        exelUtility=new ExelUtility(path);
        List<Map<String,String>> signupdata =exelUtility.storeData(path, sheet);
        //  exelUtility.storeData(path, sheetName);
        String userid= signupdata.get(row).get("Email ID");
        System.out.println(userid);

        lop=new LoginPage(Hook.driver);
        lop.EnterUserName(userid);

        String password= signupdata.get(row).get("Password");
        System.out.println(password);
        lop.EnterPassword(password);
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
        lop.ClickSign_Now();
      //  Thread.sleep(4000);
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

        sd.validateInnerChatBox();
        System.out.println("Profile Inner Chat Automated Successfully");
        Thread.sleep(4000);
        sdi=new Student_DashBoard(Hook.driver);
        sdi.logOut();

    }


    @And("Fetch data from Excel sheet for SignUp-Chat {string}, {} and enter details on signup-chat.")
    public void fetchDataFromExcelSheetForSignUpChatAndEnterDetailsOnSignupChat(String sheetSignupchat, Integer roww) throws IOException, InterruptedException {
        exelUtility=new ExelUtility(path);
        List<Map<String,String>> signupdata =exelUtility.storeData(path, sheetSignupchat);

//Enter First Name
       String name= signupdata.get(roww).get("Full Name");
        System.out.println(name);
        sd=new Student_DashBoard_InnerChatBox(Hook.driver);
        sd.enter_Your_FullName(name);

//DOB Select
        dp=new DatePicker(Hook.driver);
       String dobdate= signupdata.get(roww).get("DOBdate");
      String dobMonth= signupdata.get(roww).get("DOBmonth");
     String dobyear= signupdata.get(roww).get("DOByear");
        System.out.println(dobdate+" "+dobMonth+" "+dobyear);
        dp.datepickerG(dobdate,dobMonth,dobyear);

//Main learing Goal
        String learningGoal= signupdata.get(roww).get("Main learning goal");
        sd.enter_main_learning_goal(learningGoal);

//Select Gender (Gender)
        String gender= signupdata.get(roww).get("Gender");
        sd.select_Gender();

//Enter Mother Name(Mother Name)
        String mothername= signupdata.get(roww).get("Mother Name");
        sd.enter_Mother_Name(mothername);

//ENter Father Name
        String fathername= signupdata.get(roww).get("Father Name");
        sd.enter_Father_Name(fathername);

//Enter Guardian Name
        String guardianName= signupdata.get(roww).get("Guardian Name");
        sd.enter_Quardian_Name(guardianName);

//Upload PP
        String uploadPp= signupdata.get(roww).get("Upload PP");
        sd.Upload_Profile_Picture(uploadPp);

//Institute type
        sd.select_School_type();

//School Name
        String schoolName= signupdata.get(roww).get("School Name");
        sd.user_select_schoolName(schoolName);

//Board
        sd.select_your_board();

//Class
        String classes= signupdata.get(roww).get("Classes");
        sd.select_your_classes(classes);

//Hobbies
        String hobbies= signupdata.get(roww).get("Hobbies");
        sd.choose_your_hobbies(hobbies);

//Language
        String language= signupdata.get(roww).get("Language");
        Thread.sleep(500);
        sd.select_known_language(language);

//Language proficiency
        sd.select_proficiency();

//Country Code
        sd.select_your_mobile_number_country_code();

//WhatsApp No.
        String whatsappno= signupdata.get(roww).get("WhatsApp No.");
        sd.What_is_your_mobile_number(whatsappno);

//Subject Name
        String sujectname= signupdata.get(roww).get("Subject Name");
        sd.Select_your_subject_name(sujectname);

//Preference
        String preference= signupdata.get(roww).get("Preference");
        sd.What_is_your_preference(preference);

//Score Percentage
        String scorePercentage= signupdata.get(roww).get("Score Percentage");
        sd.Add_your_score_in_percentage(scorePercentage);

//Select Teacher
        String teacher= signupdata.get(roww).get("Select Teacher");
        sd.user_select_teacherName(teacher);

//Country
        String country= signupdata.get(roww).get("Country");
        sd.select_your_current_country_of_residence(country);

//State
        String state= signupdata.get(roww).get("State");
        sd.select_your_current_country_of_residence(state);

//District
        String district= signupdata.get(roww).get("District");
        sd.which_district(district);
//City
        String city= signupdata.get(roww).get("City");
        sd.which_city(city);

//Pin code
        String pincode= signupdata.get(roww).get("Pin code");
        sd.enter_pin_Code(pincode);


//First Address
        String firstAddress= signupdata.get(roww).get("First Address");
        sd.enter_first_address(firstAddress);

//Second Addresss
        String secondAddresss= signupdata.get(roww).get("Second Addresss");
        sd.what_is_your_second_address(secondAddresss);

    }

    @Then("Verified sign-up chat is complited.")
    public void verifiedSignUpChatIsComplited() throws InterruptedException {
        sd.validateInnerChatBox();
        System.out.println("Profile Inner Chat Automated Successfully");
        Thread.sleep(1000);
        sdi=new Student_DashBoard(Hook.driver);
        sdi.logOut();
    }
}
