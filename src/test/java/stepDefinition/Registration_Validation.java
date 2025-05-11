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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Registration_Validation {

    WebDriver driver;
   public RegistrationPage rp;
   public ExelUtility exelUtility;
   private final Logger logger=LogManager.getLogger(this.getClass().getName());
    String path = System.getProperty("user.dir") + "/src/test-data/data for sign-up chat.xlsx";

    // public String path="F:\\Gyansetu\\G_TestCase001\\src\\test-data\\data for sign-up chat.xlsx";
 //  String path = System.getProperty("user.dir") + "\\src\\test-data\\data for sign-up chat.xlsx";
 @Given("Navigate Registration Page")
 public void navigate_registration_page() {
     logger.info("Navigating to the registration page");
     rp = new RegistrationPage(Hook.driver);
     rp.click_Registration_Button();
     logger.info("Clicked on Registration button");
 }

    @When("User Enter Email {string} and Password {string}")
    public void user_enter_email_and_password(String email, String password) {
        logger.info("Entering email: {}", email);
        rp.Enter_Email(email);

        logger.info("Entering password: ********");
        rp.Enter_Password(password);

        rp.click_checkBox_TermsAndCondition();
        logger.info("Checked Terms and Conditions checkbox");
    }

    @Then("Click SignUp Button")
    public void click_sign_up_button() throws InterruptedException {
        logger.info("Clicking SignUp Now button");
        rp.click_SignUp_Now();
        Thread.sleep(20000);
        logger.info("SignUp process initiated, waiting for 20 seconds for enter the OTP");
        // rp.registration_Validation();
    }

    @When("User Enter Email {string}, Password {string}, phoneNo {string}")
    public void userEnterEmailPasswordPhoneNo(String email, String password, String phone) {
        logger.info("Entering email: {}", email);
        rp.Enter_Email(email);

        logger.info("Entering password: ********");
        rp.Enter_Password(password);

        logger.info("Entering phone number: {}", phone);
        rp.Enter_phoneNo(phone);

        rp.click_checkBox_TermsAndCondition();
        logger.info("Checked Terms and Conditions checkbox");
    }

    @And("Fetch signup data from Excel sheet {string}, {int}")
    public void fetchSignupDataFromExcelSheet(String sheetName, Integer rowno) throws IOException {
        logger.info("Fetching data from Excel - Sheet: {}, Row: {}", sheetName, rowno);
        exelUtility = new ExelUtility(path);
        List<Map<String, String>> signupdata = exelUtility.storeData(path, sheetName);

        String userid = signupdata.get(rowno).get("Email ID");
        logger.info("Fetched Email ID: {}", userid);
        rp.Enter_Email(userid);

        String phoneno = signupdata.get(rowno).get("Phone No");
        logger.info("Fetched Phone No: {}", phoneno);
        rp.Enter_phoneNo(phoneno);

        String password = signupdata.get(rowno).get("Password");
        logger.info("Fetched Password: ********");
        rp.Enter_Password(password);

        rp.click_checkBox_TermsAndCondition();
        logger.info("Checked Terms and Conditions checkbox");
    }

}