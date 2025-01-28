package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import page.Student_DashBoard;
import page.Student_DashBoard_InnerChatBox;
import utility.DatePicker;

public class InnerSignUp_Chat_Detail {

    Student_DashBoard_InnerChatBox sd;
    DatePicker dp;
    Student_DashBoard sdi;

    @When("User enter the Full Name {string}")
    public void user_enter_the_full_name(String fullName) {
        sd=new Student_DashBoard_InnerChatBox(Hook.driver);
        sd.enter_Your_FullName(fullName);
    }

    @When("User Select the Date of Birth Date= {string} Month= {string} Year= {string}")
    public void user_select_the_date_of_birth_date_month_year(String string, String string2, String string3) {
        dp=new DatePicker(Hook.driver);
        dp.datepickerG(string,string2,string3);
    }

    @When("User Enter Main learning Goal {string}")
    public void user_enter_main_learning_goal(String string) {
        sd.enter_main_learning_goal(string);
    }

    @When("User Select Gender")
    public void user_select_gender() {
        sd.select_Gender();
    }

    @When("User Enter Your Mother Name {string}")
    public void user_enter_your_mother_name(String string) {
        sd.enter_Mother_Name(string);
    }

    @When("User Enter Your Father Name {string}")
    public void user_enter_your_father_name(String string) {
        sd.enter_Father_Name(string);
    }

    @When("User Enter Your Quardian Name {string}")
    public void user_enter_your_quardian_name(String string) {
        sd.enter_Quardian_Name(string);
    }

    @When("User upload profile picture {string}")
    public void user_upload_profile_picture(String string) {
        sd.Upload_Profile_Picture(string);
    }

    @When("User Select Institute Type {string}")
    public void user_select_institute_type(String string) {

       if(string.equalsIgnoreCase("School")) {
           sd.select_School_type();
           System.out.println("School Selected");
       } else{
           sd.select_Collage_type();
           System.out.println("collage Selected");
//           sd.please_Select_your_University("KTU(Kerala Technical University)");
//           sd.please_Select_your_Institution("MESITAM Chathnoor");
//           sd.please_select_your_Course("Electronics and Communication");
//           sd.please_select_your_Semester();
//           sd.please_select_your_learningStyle();
//           dp.selectYear("2022");

       }
    }

    @When("User Select University {string}")
    public void User_Select_University(String university)
    {
        sd.please_Select_your_University(university);
    }

    @When("User Select Institution {string}")
    public void user_Select_Institution(String institution)
    {
        sd.please_Select_your_Institution(institution);
    }

    @When("User Select Course {string}")
    public void user_Select_Course(String course)
    {
        sd.please_select_your_Course(course);
    }

    @When("User Select Semester {string}")
    public void  user_Select_Semester(String semester)
    {
        sd.please_select_your_Semester(semester);
    }

    @When("User Select Learning Style {string}")
    public void user_select_learning_style(String string)
    {
        sd.please_select_your_learningStyle();
    }

    @When("User Select Year {string}")
    public void user_select_year(String string)
    {
        dp.selectYear(string);
    }

    @When("User select which your subject belongs {string}")
    public void user_select_which_your_subject_belongs(String string)
    {
        sd.user_select_which_your_subject_belongs();
    }

    @When("User select semester")
    public void user_select_semester()
    {
        sd.user_select_semester();
    }

    @When("User Select Board")
    public void user_select_board() {
        sd.select_your_board();
    }

    @When("User Select Class")
    public void user_select_class() {
        sd.select_your_class();
    }

    @When("User Select Class {string}")
    public void user_select_class(String string) {
        sd.select_your_classes(string);
    }

    @When("User Choose Hobbies {string}")
    public void user_choose_hobbies(String string) {
        sd.choose_your_hobbies(string);
    }
    @When("User Select Known Language {string}")
    public void user_select_known_language(String string) throws InterruptedException {
        Thread.sleep(500);
        sd.select_known_language(string);
    }

    @When("User Select Language Proficiency")
    public void user_select_language_proficiency() {
        sd.select_proficiency();
    }

    @When("User Select mobile number Country code")
    public void user_select_mobile_number_country_code() {
        sd.select_your_mobile_number_country_code();
    }

    @When("User Enter Mobile Number {string}")
    public void user_enter_mobile_number(String string) {
        sd.What_is_your_mobile_number(string);
    }

    @When("User Enter WhatsAll Number {string}")
    public void user_enter_whats_all_number(String string) {
        sd.What_is_your_WhatsApp_number(string);
    }

    @When("User Select Your Subject Name {string}")
    public void user_select_your_subject_name(String string) {
        sd.Select_your_subject_name(string);
    }

    @When("User Enter subject preference {string}")
    public void user_enter_subject_preference(String string) {
        sd.What_is_your_preference(string);
    }

    @When("User add Score Percentage {string}")
    public void user_add_score_percentage(String string) {
        sd.Add_your_score_in_percentage(string);
    }

    @When("User Select Current Country of Residence {string}")
    public void user_select_current_country_of_residence(String string) {
        sd.select_your_current_country_of_residence(string);
    }

    @When("User Select Current residence State {string}")
    public void user_select_current_residence_state(String string) {
        sd.which_state_do_you_currently_reside_in(string);
    }

    @When("User Enter Current residence District Name {string}")
    public void user_enter_current_residence_district_name(String string) {
        sd.which_district(string);
    }

    @When("User Enter Current residence City Name {string}")
    public void user_enter_current_residence_city_name(String string) {
        sd.which_city(string);
    }

    @When("User Enter PinCode Number {string}")
    public void user_enter_pin_code_number(String string) {
        sd.enter_pin_Code(string);
    }

    @When("User Enter First Address {string}")
    public void user_enter_first_address(String string) {
        sd.enter_first_address(string);
    }

    @When("User Enter Second Address {string}")
    public void user_enter_second_address(String string) {
        sd.what_is_your_second_address(string);
    }

    @Then("Validate whether SignUp chat is Completed")
    public void validate_whether_sign_up_chat_is_completed() throws InterruptedException {
        sd.validateInnerChatBox();
        System.out.println("Profile Inner Chat Automated Successfully");
        Thread.sleep(4000);
        sdi=new Student_DashBoard(Hook.driver);
        sdi.logOut();
    }
}
