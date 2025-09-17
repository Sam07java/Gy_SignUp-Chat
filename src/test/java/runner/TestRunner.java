package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import java.util.Map;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
 //               "src/test/java/features/test002_student_signup_validationfor_Revamp.feature",
//             "src/test/java/features/test004_signUpChat_with_profileEdit_SchoolStudentUser.feature",
//                 "src/test/java/features/test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature",
                 "src/test/java/features/test006_SchoolStudent_signup_signupchat_ExcelSheet.feature",
//                "src/test/java/features/test008_register_as_teacher.feature",
//               "src/test/java/features/test007_CollageStudent_signUp_SignUpchat_ExcelSheet.feature",
//                "src/test/java/features/test009_register_as_Institute.feature",
        },
      //  extraGlue = {"src/test/java/features/test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature"},
      // features= {"src/test/java/features/test004_signUpChat_with_profileEdit_SchoolStudentUser.feature"},
        glue = {"stepDefinition","hooks","utility"},
        plugin = {"pretty","html:test_report/cucumber_report.html",
                "json:test_report/test_report.json",
                "junit:test_report/test_report.xml",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                },

        publish = true,
        monochrome = false,
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests{
    ///test001_login_validation.featuree
    //validate_dashBoard_profileChatInner_003.featuree
    //test002_student_signup_validation.featuree
   //test003_signUp_chat_Validate_ProfileEditPAge_student.featuree
    //test004_signUpChat_with_profileEdit_SchoolStudentUser.feature
    //Properties p=new Properties();
   // test005_SignUpChat_with_ProfileEditPage_CollegeUser.feature
}
