package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import page.Student_DashBoard;
import page.studentprofile_edit.*;

import static hooks.Hook.driver;

public class Student_Profile_Information_Validation {

    Student_DashBoard sd;
    Basic_informationPage bi;
    @Given("Check the Student Profile detail is displayed")
    public void check_the_student_profile_detail_is_displayed() throws InterruptedException {
       // driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']")).click();
        sd=new Student_DashBoard(driver);
        sd.profile_edit_page();
    }

    @When("Validate the basic information is entered correct")
    public void validate_the_basic_information_is_entered_correct() throws InterruptedException {

        Thread.sleep(2000);
        bi=new Basic_informationPage(driver);
        System.out.println(bi.First_Name());
        System.out.println(bi.Last_Name());

        Assert.assertEquals("Suraj", bi.First_Name());

        Assert.assertEquals("Venjaramood", bi.Last_Name());

        Assert.assertEquals("17/01/2015", bi.Date_of_Birth());

        Assert.assertEquals("Nasar S", bi.Father_Name());

        Assert.assertEquals("Saara P", bi.Mother_Name());

        Assert.assertEquals("Sharafudheen S", bi.Guardian_Name());

        Assert.assertTrue(bi.Gender());

        bi.Submit_Butten();

    }

    @When("Validate the Address is entered correct")
    public void validate_the_address_is_entered_correct() {

        AddressPage ap=new AddressPage(driver);

       Assert.assertEquals("India",ap.Country_DropDown());
        System.out.println(ap.Country_DropDown());

       Assert.assertEquals("Kerala", ap.State_DropDown());
        System.out.println(ap.State_DropDown());

       Assert.assertEquals("Manzil",ap.FirstAddress());
        System.out.println(ap.FirstAddress());

       Assert.assertEquals("same",ap.Address2());
        System.out.println(ap.Address2());

       Assert.assertEquals("cherthala",ap.City());
        System.out.println(ap.City());

      Assert.assertEquals("alappuzha", ap.District());
        System.out.println(ap.District());

        Assert.assertEquals("767676", ap.Pincode());
         System.out.println(ap.Pincode());

      ap.Click_SameAs_Current_Address();
      ap.Click_Next_Button();
    }

    @When("Validate Hobbies and Language is entered correct")
    public void validate_hobbies_and_language_is_entered_correct() throws InterruptedException {

        Hobbies_LanguagePage hpp=new Hobbies_LanguagePage(driver);

        Thread.sleep(1000);
        Assert.assertEquals("Running",hpp.Hobbies());
        System.out.println(hpp.Hobbies());

        Assert.assertEquals("Hindi", hpp.Language());
        System.out.println(hpp.Language());

        hpp.Click_Button();

    }

    @When("Validate Academic History is entered correct")
    public void validate_academic_history_is_entered_correct() {

        Academic_HistoryPage ahh=new Academic_HistoryPage(driver);

        Assert.assertEquals("School", ahh.Institute_Type());
        System.out.println(ahh.Institute_Type());

        Assert.assertEquals("CBSE", ahh.Board());
        System.out.println(ahh.Board());

        Assert.assertEquals("class 08", ahh.Class());
        System.out.println(ahh.Class());

        ahh.Click_Next_Button();

    }

    @When("Validate Contact Details is entered correct")
    public void validate_contact_details_is_entered_correct() {

        Contact_Details cd=new Contact_Details(driver);

        Assert.assertEquals("9898765443",cd.Mobile_No());
        System.out.println(cd.Mobile_No());

        Assert.assertEquals("9876543422", cd.Whatsapp_No());
        System.out.println(cd.Whatsapp_No());

        Assert.assertEquals("sameer17@gmail.com", cd.Email_id());
        System.out.println(cd.Email_id());

        cd.Click_Next_Button1();
    }

    @When("Validate Subject Preference is entered correct")
    public void validate_subject_preference_is_entered_correct() throws InterruptedException {


        Subject_Preference sp=new Subject_Preference(driver);

        Thread.sleep(1000);
        Assert.assertEquals("Science", sp.Subject());
        System.out.println(sp.Subject());

        Assert.assertEquals("Mathematics", sp.Preferene());
        System.out.println(sp.Preferene());

        Assert.assertEquals("67", sp.Score_Percentage());
        System.out.println(sp.Score_Percentage());

        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill submit-btn']")).click();
    }

    @Then("Check the validation")
    public void Check_the_validation() {

        System.out.println("Validation with SignUp chat with Profile edit details is successfull");

    }

}
