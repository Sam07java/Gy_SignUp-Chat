package page.studentprofile_edit;

import factory.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;
import org.apache.logging.log4j.Logger;

import java.time.Duration;
import java.util.List;

public class ParentPage extends BasePage {

    private final Logger logger= BaseClass.getLogger();
    private final WebDriverWait wait;
    WebDriver driver;

    public ParentPage(WebDriver driver) {
        super(driver);
        this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public String parent_EmailID() throws InterruptedException {
//        Thread.sleep(2000);
//        By locator = By.xpath("//input[@type='email']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       // String parentemailid = driver.findElement(locator).getText();
    List<WebElement> parentinput = driver.findElements(By.xpath("//input[@name='email']\n"));
        String parentemailid = parentinput.get(1).getDomAttribute("value");
//        WebElement parentemail=driver.findElement(By.xpath("//input[@id=':ra:']"));
//      String parentemailid = parentemail.getText();
        logger.info("Fetched parentID : {}", parentemailid);
        return parentemailid;
    }

    public String parent_phoneNo(){
        //input[@name='phone']
        By locator = By.xpath("//input[@name='phone']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String parentphoneno = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched parent phone no. : {}", parentphoneno);
        return parentphoneno;
    }

    public void click_Next_Button(){
       List<WebElement> nextButton= driver.findElements(By.xpath("//button[@type='button' and @data-testid='submitForm']"));
       nextButton.get(1).click();
    }
}
