package stepDefinition;

import factory.BaseClass;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import page.RegistrationPage;
import page.RegistrationPage_Institute;
import page.RgistrationPage_Teacher;
import utility.DatePicker;
import utility.ExelUtility;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class register_as_institute {
    RegistrationPage_Institute registrationPage_institute;
    RegistrationPage registrationPage;
    ExelUtility exelUtility;
    RgistrationPage_Teacher rgistrationPageInstitute;
    String path = System.getProperty("user.dir") + "/src/test-data/data for sign-up chat.xlsx";
    DatePicker datePicker;
    @When("Click on Register as Institute Button")
    public void Click_on_Register_as_Institute_Button(){
        registrationPage = new RegistrationPage(BaseClass.getDriver());
        registrationPage.click_on_Register_as_Institute();
    }

    @When("Fetch input from excel sheet {string}  {} enter the details on each page.")
    public void fetchInputFromExcelSheetEnterTheDetailsOnEachPage(String arg0, Integer row) throws IOException, InterruptedException {

        exelUtility=new ExelUtility(path);
        List<Map<String,String>> exeldataInstitute  = exelUtility.storeData001(path, arg0);
       String entity= exeldataInstitute.get(row).get("Entity");
       BaseClass.getLogger().info("Entity:"+ entity);

        String website = exeldataInstitute.get(row).get("WebSite");
        BaseClass.getLogger().info("Website from excel sheet:"+ website);

        String schoolName = exeldataInstitute.get(row).get("Institute");
        BaseClass.getLogger().info("School Name from excel sheet:"+ schoolName);

        String phoneNo = exeldataInstitute.get(row).get("MobileNo");
        BaseClass.getLogger().info("Phone Number from excel sheet:"+ phoneNo);

        String emailid = exeldataInstitute.get(row).get("Email I'D");
        BaseClass.getLogger().info("Email I'D from excel sheet:"+ emailid);

        // FIrst Page
        registrationPage_institute =new RegistrationPage_Institute(BaseClass.getDriver());
        if(entity.equalsIgnoreCase("School")) {
            registrationPage_institute.select_entity("School");
            registrationPage_institute.enter_the_webside(website);
            registrationPage_institute.school_name(schoolName);
            registrationPage_institute.enter_mobile_Number(phoneNo);
            registrationPage_institute.enter_email_id(emailid);

            registrationPage_institute.click_Next_Buttom();
            BaseClass.getLogger().info("Clicked on Next Button");
        }else {
            registrationPage_institute.select_entity("College");
            registrationPage_institute.enter_the_webside(website);

            String university = exeldataInstitute.get(row).get("University");
            registrationPage_institute.select_University(university);

            String instituteName = exeldataInstitute.get(row).get("Institute");
            registrationPage_institute.enter_the_institutename(instituteName);

            registrationPage_institute.enter_mobile_Number(phoneNo);
            registrationPage_institute.enter_email_id(emailid);

            registrationPage_institute.click_Next_Buttom();
            BaseClass.getLogger().info("Clicked on Next Button...");

        }
        //Address Page
        rgistrationPageInstitute=new RgistrationPage_Teacher(BaseClass.getDriver());
        rgistrationPageInstitute.select_country();
        rgistrationPageInstitute.select_state();
        rgistrationPageInstitute.enter_District();
        rgistrationPageInstitute.enter_City();
        rgistrationPageInstitute.enter_Address();
        rgistrationPageInstitute.enter_pincode();

        registrationPage_institute.click_Next_Buttom();
        BaseClass.getLogger().info("Clicked on Next Button");

    }

    @When("Validate whether Document and Logo is uploaded or not")
    public void validateWhetherDocumentAndLogoIsUploadedOrNot() {
        //Document and Logo Upload
        registrationPage_institute.upload_Document();
        registrationPage_institute.upload_logo();

        rgistrationPageInstitute.check_Terma$Condition();
        BaseClass.getLogger().info("Terms and condition check box clicked");

        Assert.assertTrue(registrationPage_institute.uploadfile_elements().isDisplayed());
        Assert.assertTrue(registrationPage_institute.uploadLogo_elemets().isDisplayed());
    }

    @When("Click on submit button")
    public void clickOnSubmitButton() throws InterruptedException {
        rgistrationPageInstitute.click_Submit_button();
        BaseClass.getLogger().info("Submit button clicked");
    }
}
