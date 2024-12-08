package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/validate_dashBoard_profileChatInner.feature"},
        glue = {"stepDefinition","hooks","utility"},
        plugin = {"pretty","html:target/cucmber.html"}
)
public class TestRunner {
    ///login_validation_001.feature
}
