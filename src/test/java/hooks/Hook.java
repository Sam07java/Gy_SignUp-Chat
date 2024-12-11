package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hook {

    public static WebDriver driver;
    //WebDriver driver;

    @Before
    public void setup()
    {
        driver=new ChromeDriver();
        driver.get("https://qaweb.gyansetu.ai//");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown()
    {
        //driver.close();
    }
}
