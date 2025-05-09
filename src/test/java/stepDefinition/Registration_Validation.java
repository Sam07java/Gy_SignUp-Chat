package stepDefinition;

import hooks.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.RegistrationPage;
import utility.ExelUtility;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Registration_Validation {

    WebDriver driver;
   public RegistrationPage rp;
   public ExelUtility exelUtility;
   public String path="F:\\Gyansetu\\G_TestCase001\\src\\test-data\\data for sign-up chat.xlsx";
 //  String path = System.getProperty("user.dir") + "\\src\\test-data\\data for sign-up chat.xlsx";
    @Given("Navigate Registration Page")
    public void navigate_registration_page() {
        rp = new RegistrationPage(Hook.driver);
        rp.click_Registration_Button();
    }

    @When("User Enter Email {string} and Password {string}")
    public void user_enter_email_and_password(String string, String string2) {
        rp.Enter_Email(string);
        rp.Enter_Password(string2);
        rp.click_checkBox_TermsAndCondition();
    }

    @Then("Click SignUp Button")
    public void click_sign_up_button() throws InterruptedException {
        rp.click_SignUp_Now();
        Thread.sleep(20000);
       // rp.registration_Validation();
    }


    @When("User Enter Email {string}, Password {string}, phoneNo {string}")
    public void userEnterEmailPasswordPhoneNo(String arg0, String arg1, String arg2) {
        rp.Enter_Email(arg0);
        rp.Enter_Password(arg1);
        rp.Enter_phoneNo(arg2);
        rp.click_checkBox_TermsAndCondition();
    }

    @And("Fetch signup data from Excel sheet {string}, {int}")
    public void fetchSignupDataFromExcelSheet(String sheetNam, Integer rowno) throws IOException {

        exelUtility=new ExelUtility(path);
      List<Map<String,String>> signupdata =exelUtility.storeData(path, sheetNam);
      //  exelUtility.storeData(path, sheetName);
      String userid= signupdata.get(rowno).get("Email ID");
        System.out.println(userid);
        rp.Enter_Email(userid);

        String phoneno= signupdata.get(rowno).get("Phone No");
        System.out.println(phoneno);
        rp.Enter_phoneNo(phoneno);

       String password= signupdata.get(rowno).get("Password");
        System.out.println(password);
        rp.Enter_Password(password);

        rp.click_checkBox_TermsAndCondition();
    }

}