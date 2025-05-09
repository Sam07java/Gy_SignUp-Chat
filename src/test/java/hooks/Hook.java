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
        driver.get("https://qaweb.gyansetu.ai/");
      //  driver.get("http://13.233.97.160:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //  https://uatweb.gyansetu.ai/
        //  https://www.gyansetu.ai/
        //  https://qaweb.gyansetu.ai/
        // http://13.233.97.160:3000/
       // Properties p=new Properties();
    }

    @After
    public void tearDown()
    {
      // driver.close();
    }
}
