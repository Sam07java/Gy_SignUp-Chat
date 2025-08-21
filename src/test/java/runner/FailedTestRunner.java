package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "@target/rerun.txt",  // ⚠️ rerun failed scenarios only
        glue = {"stepDefinition", "hooks", "utility"},
        plugin = {
                "pretty",
                "html:test_report/rerun_report.html",
                "json:test_report/rerun_report.json",
                "junit:test_report/rerun_report.xml"
        },
        publish = true,
        monochrome = true
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
