package stepDefinition;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.RegistrationPage;
import page.RgistrationPage_Teacher;
import utility.DatePicker;
import utility.ExelUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import static factory.BaseClass.driver;

public class registerf_as_teacher {
    RegistrationPage registrationPage;
    ExelUtility exelUtility;
    RgistrationPage_Teacher rgistrationPageTeacher;
    String path = System.getProperty("user.dir") + "/src/test-data/data for sign-up chat.xlsx";
    DatePicker datePicker;

    @When("Click on Register as Teacher Button")
    public void Click_on_Register_as_Teacher_Button(){
        registrationPage = new RegistrationPage(BaseClass.getDriver());
        registrationPage.click_on_Register_as_Teacher();
    }

    @When("Fetch the data from excel sheet {string}  {} enter the deatils First Page")
    public void fetchTheDataFromExcelSheetEnterTheDeatilsFirstPage(String arg0, Integer arg1) throws IOException, InterruptedException {
    exelUtility=new ExelUtility(path);
    List<Map<String,String>> exeldataTeacher  = exelUtility.storeData001(path, arg0);

    String firstName = exeldataTeacher.get(arg1).get("First Name");
        BaseClass.logger.info("fetched data of first name: "+firstName);
    String lastName = exeldataTeacher.get(arg1).get("Last Name");
        BaseClass.logger.info("fetched data of  last name: "+lastName);
    String mobileNumber = exeldataTeacher.get(arg1).get("Mobile Number");
        BaseClass.logger.info("fetched data of mobile Number: "+mobileNumber);
    String emailid = exeldataTeacher.get(arg1).get("Email ID");
        BaseClass.logger.info("fetched data of: "+emailid);

        String date = exeldataTeacher.get(arg1).get("DOBdate");
        BaseClass.logger.info("fetched data of date date: "+date);
        String month = exeldataTeacher.get(arg1).get("DOBmonth");
        BaseClass.logger.info("fetched data of month: "+month);
        String year = exeldataTeacher.get(arg1).get("DOByear");
        BaseClass.logger.info("fetched data of year: "+year);

    rgistrationPageTeacher=new RgistrationPage_Teacher(BaseClass.getDriver());
        BaseClass.logger.info("Initialize the teacher POM page");

    rgistrationPageTeacher.enter_first_name(firstName);
        BaseClass.logger.info("Entered data of first name: "+firstName);
    rgistrationPageTeacher.enter_last_name(lastName);
        BaseClass.logger.info("Entered data of last name: "+lastName);
    rgistrationPageTeacher.enter_mobile_Number(mobileNumber);
        BaseClass.logger.info("Entered data of mobile number: "+mobileNumber);
    rgistrationPageTeacher.enter_EmailId(emailid);
        BaseClass.logger.info("Entered data of email id: "+emailid);

    datePicker = new DatePicker(BaseClass.getDriver());
        datePicker.datepickerGy(date, month, year);

    rgistrationPageTeacher.click_Next_Button();

        //Address Page
        rgistrationPageTeacher.select_country();
        rgistrationPageTeacher.select_state();
        rgistrationPageTeacher.enter_District();
        rgistrationPageTeacher.enter_City();
        rgistrationPageTeacher.enter_Address();
        rgistrationPageTeacher.enter_pincode();

        rgistrationPageTeacher.click_Next_Button();

    // Document Page
//       String schoolentity = exeldataTeacher.get(arg1).get("School");
        rgistrationPageTeacher.select_Entity("school");

       String schoolInstitute = exeldataTeacher.get(arg1).get("Institute");
       BaseClass.getLogger().info("School institute fetch from excel: "+schoolInstitute);
        rgistrationPageTeacher.select_Institute(schoolInstitute);

        rgistrationPageTeacher.teaching_Experince("4");
        rgistrationPageTeacher.select_Qualification();

        String sclass = exeldataTeacher.get(arg1).get("SClass");
        BaseClass.getLogger().info("class institute fetch from excel: "+sclass);
        rgistrationPageTeacher.select_class(sclass);

       String subA = exeldataTeacher.get(arg1).get("Subject A");
       String subB = exeldataTeacher.get(arg1).get("Subject B");
        BaseClass.getLogger().info("Subjects are fetched from execl sheet:"+subA+", "+subB);

        rgistrationPageTeacher.select_subject(subA, subB);
        BaseClass.getLogger().info("Subjectes are clicked");
        rgistrationPageTeacher.upload_Document("C:/Users/WIIS/Downloads/pexels-earano-3608311.jpg");
        BaseClass.getLogger().info("Document uploaded");
        rgistrationPageTeacher.check_Terma$Condition();
        BaseClass.getLogger().info("Terms and condition check box clicked");
        rgistrationPageTeacher.click_Submit_button();
        BaseClass.getLogger().info("Submit button clicked");

    }

    @Then("Validate whether registration is successfully or not.")
    public void validateWhetherRegisterationIsSuccessfullyOrNot() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement headingElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.tagName("h2")));

        String heandingText = headingElement.getText();
        BaseClass.getLogger().info("OTP Box: "+heandingText);
        Assert.assertEquals("Please verify your OTP.", heandingText);

    }

//    @When("Fetch the data from excel sheet {string}  {} enter the deatils First Page")
//    public void fetchTheDataFromExcelSheetEnterTheDeatilsFirstPage(String arg0, String arg1, String arg2) {
//    }
}
