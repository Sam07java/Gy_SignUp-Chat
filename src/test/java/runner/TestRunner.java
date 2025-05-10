package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testngxmlformatter.MessagesToTestngXmlWriter;
import org.junit.runner.RunWith;

import java.util.Map;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
              //  "src/test/java/features/test002_student_signup_validationfor_Revamp.feature",
               // "src/test/java/features/test004_signUpChat_with_profileEdit_StudentUser.feature",
                // "src/test/java/features/test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature"
                 "src/test/java/features/test006_student_signup_ExcelSheet.feature"
        },
      //  extraGlue = {"src/test/java/features/test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature"},
      // features= {"src/test/java/features/test004_signUpChat_with_profileEdit_StudentUser.feature"},
        glue = {"stepDefinition","hooks","utility"},
        plugin = {"pretty","html:target/cucumber_report.html",
                        "json:target/test_report.json",
                        "junit:target/test_report.xml"},

        publish = true,
        monochrome = false,
        dryRun = false
)
public class TestRunner {
    ///test001_login_validation.featuree
    //validate_dashBoard_profileChatInner_003.featuree
    //test002_student_signup_validation.featuree
   //test003_signUp_chat_Validate_ProfileEditPAge_student.featuree
    //test004_signUpChat_with_profileEdit_StudentUser.feature
    //Properties p=new Properties();
   // test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature

}
