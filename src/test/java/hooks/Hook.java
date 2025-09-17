package hooks;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Hook {

    public static WebDriver driver;
    private Logger logger;
    public Properties p;

    public void setup()
    {
        logger=LogManager.getLogger("hooks.Hook");
        driver=new ChromeDriver();
        logger.info("Starting WebDriver initialization");
        logger.info("Chrome browser launched");
        driver.get("https://qaweb.gyansetu.ai/");
        logger.info("Navigated to qaweb-gyansetu");
      //  driver.get("http://13.233.97.160:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
@Before
public void initialSetup() throws IOException {
        driver = BaseClass.initlizeBrowser();
        BaseClass.getLogger().info("browser initialized");

        p = BaseClass.getProperties();
        BaseClass.getLogger().info("get properties file from file directory");
        driver.get(p.getProperty("appURL"));
        driver.manage().window().maximize();
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
