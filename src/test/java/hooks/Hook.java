package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Hook {

    public static WebDriver driver;
    //WebDriver driver;
    private Logger logger;

    @Before
    public void setup()
    {
        logger=LogManager.getLogger("hooks.Hook");
        driver=new ChromeDriver();
        logger.info("Starting WebDriver initialization");
        logger.info("Chrome browser launched");
        driver.get("https://qaweb.gyansetu.ai/");
     //   driver.get("https://www.gyansetu.ai/");
        logger.info("Navigated to qaweb-gyansetu");
      //  driver.get("http://13.233.97.160:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  https://uatweb.gyansetu.ai/
        //  https://www.gyansetu.ai/
        //  https://qaweb.gyansetu.ai/
        // http://13.233.97.160:3000/
       // Properties p=new Properties();
    }

    @After
    public void tearDown() {
//        if (driver != null) {
//            driver.close();
//            logger.info("Browser window closed after scenario.");
//        } else {
//            logger.warn("Driver was null, nothing to close.");
//        }
    }
}
