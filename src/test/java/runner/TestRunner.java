package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/login_validation_001.feature"},
        glue = {"stepDefinition","hooks","utility"},
        plugin = {"pretty","html:target/cucmber.html"}
)
public class TestRunner {
    ///login_validation_001.feature
    //validate_dashBoard_profileChatInner_003.feature
    //student_signup_validation_002.feature
}
