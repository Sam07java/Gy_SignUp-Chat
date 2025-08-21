package page.studentprofile_edit;

import factory.BaseClass;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

import java.time.Duration;

public class Contact_Details extends BasePage {


    private final Logger logger = BaseClass.getLogger();
    private final WebDriverWait wait;
    WebDriver driver;
    public Contact_Details(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String Mobile_No() {
        By locator = By.xpath("//input[@name='phoneNum']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Mobile Number: {}", value);
        return value;
    }

    public String Whatsapp_No() {
        By locator = By.xpath("//input[@name='whatsappNum']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched WhatsApp Number: {}", value);
        return value;
    }

    public String Email_id() {
        By locator = By.xpath("//input[@name='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Email ID: {}", value);
        return value;
    }

    public void Click_Next_Button1() {
        By locator = By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill next-btn']");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement button = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        logger.info("Clicked on Next button in Contact Details page");
    }
//    public Contact_Details(WebDriver driver) {
//        super(driver);
//    }
//
//    public String Mobile_No()
//    {
//       return driver.findElement(By.xpath("//input[@name='phoneNum']")).getDomAttribute("value");
//    }
//
//    public String Whatsapp_No()
//    {
//       return driver.findElement(By.xpath("//input[@name='whatsappNum']")).getDomAttribute("value");
//    }
//
//    public String Email_id()
//    {
//        return driver.findElement(By.xpath("//input[@name='email']")).getDomAttribute("value");
//    }
//
//    public void Click_Next_Button1()
//    {
//        WebElement clk=driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()",clk);
//    }
}
