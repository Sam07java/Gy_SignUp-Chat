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
//Round --1
    //  1-->> git init -->>create a new local repository<<--

    //  2-->> git config --global user.name "your name"
    //        git config --global user.email "your email"

    //  3-->> git status -->>shows untracked file, red colur fond shown code is in our local system<<--

    //  {4-->> git add -A -->>add all  the files to staging<<--
    //         git add filename
    //         git add *.java
    //         git add filename<<--}

    //  5-->> git commit -m "First commit"  -->>commit the code into Local(git) repository<<--
    //  git status
    //






}
