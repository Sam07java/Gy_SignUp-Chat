package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Map;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/test004_signUpChat_with_profileEdit_StudentUser.feature"},
        glue = {"stepDefinition","hooks","utility"},
        plugin = {"pretty","html:target/cucmber.html"}
)
public class TestRunner {
    ///test001_login_validation.feature
    //validate_dashBoard_profileChatInner_003.feature
    //test002_student_signup_validation.feature
   //test003_signUp_chat_Validate_ProfileEditPAge_student.feature
    //test004_signUpChat_with_profileEdit_StudentUser.feature
    //Properties p=new Properties();
   // test005_SignUp_Chat_College.feature

}
