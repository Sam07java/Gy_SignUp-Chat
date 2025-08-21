package page.studentprofile_edit;

import factory.BaseClass;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

import java.time.Duration;

import static hooks.Hook.driver;

public class AddressPage extends BasePage {

    private final Logger logger = BaseClass.getLogger();
    private final WebDriverWait wait;

    public AddressPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String Country_DropDown() {
        By countryLocator = By.xpath("//select[@name='rcrs-country']");
        wait.until(ExpectedConditions.presenceOfElementLocated(countryLocator));
        WebElement dropcountry = driver.findElement(countryLocator);
        Select sl = new Select(dropcountry);
        String selectedValue = sl.getFirstSelectedOption().getText();
        logger.info("Selected Country: {}", selectedValue);
        return selectedValue;
    }

    public String State_DropDown() {
        By stateLocator = By.xpath("//select[@name='rcrs-region']");
        wait.until(ExpectedConditions.presenceOfElementLocated(stateLocator));
        WebElement dropState = driver.findElement(stateLocator);
        Select sel = new Select(dropState);
        String selectedValue = sel.getFirstSelectedOption().getText();
        logger.info("Selected State: {}", selectedValue);
        return selectedValue;
    }

    public String FirstAddress() {
        By addr1 = By.xpath("//input[@name='address1']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addr1));
        String val = driver.findElement(addr1).getDomAttribute("value");
        logger.info("First Address: {}", val);
        return val;
    }

    public String Address2() {
        By addr2 = By.xpath("//input[@name='address2']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(addr2));
        String val = driver.findElement(addr2).getDomAttribute("value");
        logger.info("Second Address: {}", val);
        return val;
    }

    public String City() {
        By cityLocator = By.xpath("//input[@name='city']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityLocator));
        String val = driver.findElement(cityLocator).getDomAttribute("value");
        logger.info("City: {}", val);
        return val;
    }

    public String District() {
        By distLocator = By.xpath("//input[@name='district']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(distLocator));
        String val = driver.findElement(distLocator).getDomAttribute("value");
        logger.info("District: {}", val);
        return val;
    }

    public String Pincode() {
        By pinLocator = By.xpath("//input[@name='pincode']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinLocator));
        String val = driver.findElement(pinLocator).getDomAttribute("value");
        logger.info("Pincode: {}", val);
        return val;
    }

    public void Click_SameAs_Current_Address() {
//        By sameAsCurrent = By.xpath("//input[@name='sameAsCurrent']");
//        wait.until(ExpectedConditions.elementToBeClickable(sameAsCurrent));
//        WebElement el_button = driver.findElement(sameAsCurrent);
        WebElement el_button= driver.findElement(By.xpath("//input[@name='sameAsCurrent']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", el_button);
        logger.info("Clicked 'Same As Current Address' checkbox.");
    }

    public void Click_Next_Button() {
        By nextBtn = By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill next-btn px-4']");
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        WebElement next_button = driver.findElement(nextBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", next_button);
        logger.info("Clicked 'Next' button on Address page.");
    }

//    public String Country_DropDown()
//    {
//        WebElement dropcountry= driver.findElement(By.xpath("//select[@name='rcrs-country']"));
//        Select sl=new Select(dropcountry);
//        WebElement selectedoption = sl.getFirstSelectedOption();
//        String selectedValue=selectedoption.getText();
//        System.out.println(selectedValue);
//        return selectedValue;
//    }
//
//    public String State_DropDown()
//    {
//        WebElement dropState=driver.findElement(By.xpath("//select[@name='rcrs-region']"));
//        Select sel=new Select(dropState);
//        WebElement selected_state= sel.getFirstSelectedOption();
//        String sele_state_value= selected_state.getText();
//        System.out.println(sele_state_value);
//        return sele_state_value;
//    }
//
//    public String FirstAddress()
//    {
//        return driver.findElement(By.xpath("//input[@name='address1']")).getDomAttribute("value");
//    }
//
//    public String Address2()
//    {
//        return driver.findElement(By.xpath("//input[@name='address2']")).getDomAttribute("value");
//    }
//
//    public String City()
//    {
//        return driver.findElement(By.xpath("//input[@name='city']")).getDomAttribute("value");
//    }
//
//    public String District()
//    {
//       return driver.findElement(By.xpath("//input[@name='district']")).getDomAttribute("value");
//    }
//
//    public String Pincode()
//    {
//       return driver.findElement(By.xpath("//input[@name='pincode']")).getDomAttribute("value");
//    }
//
//    public void Click_SameAs_Current_Address()
//    {
//       WebElement el_button= driver.findElement(By.xpath("//input[@name='sameAsCurrent']"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()",el_button);
//    }
//
//    public void Click_Next_Button()
//    {
//        WebElement next_button=driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill next-btn px-4']"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()",next_button);
//    }
}
