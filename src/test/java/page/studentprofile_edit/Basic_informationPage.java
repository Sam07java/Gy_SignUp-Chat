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

import static factory.BaseClass.getDriver;


public class Basic_informationPage extends BasePage {

    private final Logger logger = BaseClass.getLogger();
    private final WebDriverWait wait;
    WebDriver driver;

    public Basic_informationPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String First_Name() {
        By locator = By.xpath("//input[@name='first_name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched First Name: {}", value);
        return value;
    }

    public String Last_Name() {
        By locator = By.xpath("//input[@name='last_name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Last Name: {}", value);
        return value;
    }

    public boolean Gender() {
        By genderLocator = By.xpath("//input[@value='male' or @value='female']");
        wait.until(ExpectedConditions.presenceOfElementLocated(genderLocator));
        boolean isEnabled = driver.findElement(genderLocator).isEnabled();
        logger.info("Gender selection available: {}", isEnabled);
        return isEnabled;
    }

    public String Date_of_Birth() {
        By dobLocator = By.xpath("//input[contains(@class,'MuiInputBase-input') and @placeholder='DD/MM/YYYY']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dobLocator));
        String value = driver.findElement(dobLocator).getDomAttribute("value");
        logger.info("Fetched Date of Birth: {}", value);
        return value;
    }

    public String Father_Name() {
        By locator = By.xpath("//input[@name='father_name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Father Name: {}", value);
        return value;
    }

    public String Mother_Name() {
        By locator = By.xpath("//input[@name='mother_name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Mother Name: {}", value);
        return value;
    }

    public String Guardian_Name() {
        By locator = By.xpath("//input[@name='guardian_name']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String value = driver.findElement(locator).getDomAttribute("value");
        logger.info("Fetched Guardian Name: {}", value);
        return value;
    }

    public void Submit_Butten() {
        By submitBtn = By.xpath("//button[text()='Next']");
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        WebElement sumitbutn = driver.findElement(submitBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", sumitbutn);
        logger.info("Clicked on Submit/Next button.");
    }



//    public Basic_informationPage(WebDriver driver) {
//        super(driver);
//    }
//
//
//    public String First_Name()
//    {
//        WebElement nameElement=driver.findElement(By.xpath("//input[@name='first_name']"));
//        //input[@class='form-control']
//       // System.out.println("First Name= "+firstName);
//        return nameElement.getDomAttribute("value");
//    }
//
//    public String Last_Name()
//    {
//        WebElement nameLastElement=driver.findElement(By.xpath("//input[@name='last_name']"));
//        //System.out.println("Last Name= "+lastName);
//        return nameLastElement.getDomAttribute("value");
//    }
//
//    public boolean Gender()
//    {
//            WebElement gender=driver.findElement(By.xpath("//input[@value='male' or @value='female']"));
//           return gender.isEnabled();
//        //input[@value='male' or @value='female']
//    }
//
//    public String Date_of_Birth()
//    {
//        WebElement dob=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1']"));
//        return dob.getDomAttribute("value");
//    }
//
//   public String Father_Name()
//   {
//       return driver.findElement(By.xpath("//input[@name='father_name']")).getDomAttribute("value");
//   }
//
//   public String Mother_Name()
//   {
//        return driver.findElement(By.xpath("//input[@name='mother_name']")).getDomAttribute("value");
//   }
//
//   public String Guardian_Name()
//   {
//      return driver.findElement(By.xpath("//input[@name='guardian_name']")).getDomAttribute("value");
//   }
//
//   public void Submit_Butten()
//   {
//       WebElement sumitbutn=driver.findElement(By.xpath("//button[text()='Next']"));
//       JavascriptExecutor js=(JavascriptExecutor)driver;
//       js.executeScript("arguments[0].click()",sumitbutn);
//   }

}
