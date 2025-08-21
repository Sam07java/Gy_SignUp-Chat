package page.studentprofile_edit;

import factory.BaseClass;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Academic_HistoryPage extends BasePage {

    private final Logger logger= BaseClass.getLogger();
    private final WebDriverWait wait;
    WebDriver driver;
    public Academic_HistoryPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String Institute_Type() {
        By schoolLocator = By.xpath("//div[normalize-space()='School']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(schoolLocator));
        String text = driver.findElement(schoolLocator).getText();
        logger.info("Institute Type (School) fetched: {}", text);
        return text;
    }

    public String institute_type_college() {
        By collegeLocator = By.xpath("//div[text()='College']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(collegeLocator));
        String text = driver.findElement(collegeLocator).getText();
        logger.info("Institute Type (College) fetched: {}", text);
        return text;
    }

    public List<String> universityName() {
        By universityDropLocator = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1haoj0b']");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(universityDropLocator));
        List<WebElement> listElement = driver.findElements(universityDropLocator);
        List<String> lil = new ArrayList<>();
        for (WebElement element : listElement) {
            String uni = element.getText();
            lil.add(uni);
            logger.info("University option found: {}", uni);
        }
        return lil;
    }

    public String Board() {
        By boardLocator = By.xpath("//div[normalize-space()='CBSE']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(boardLocator));
        String text = driver.findElement(boardLocator).getText();
        logger.info("Board fetched: {}", text);
        return text;
    }

    public String Class() {
        By classLocator = By.xpath("//div[@class='row align-items-center g-4']/div[4]/div/div/div");
        wait.until(ExpectedConditions.visibilityOfElementLocated(classLocator));
        String text = driver.findElement(classLocator).getText();
        logger.info("Class fetched: {}", text);
        return text;
    }

    public String year() {
        By yearInputLocator = By.xpath("//input[@placeholder='YYYY']");
        wait.until(ExpectedConditions.presenceOfElementLocated(yearInputLocator));
        WebElement yearInput = driver.findElement(yearInputLocator);
        String yearVal = yearInput.getDomAttribute("value");
        logger.info("Year selected: {}", yearVal);
        return yearVal;
    }

    public void Click_Next_Button() {
        By nextBtnLocator = By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']");
        wait.until(ExpectedConditions.elementToBeClickable(nextBtnLocator));
        driver.findElement(nextBtnLocator).click();
        logger.info("Clicked Next button on Academic History page");
    }
//    public String Institute_Type()
//    {
//        WebElement scl=driver.findElement(By.xpath("//div[normalize-space()='School']"));
//        return scl.getText();
//        //div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-oo3z1f']//div
//    }
//
//    public String institute_type_college()
//    {
//       return driver.findElement(By.xpath("//div[text()='College']")).getText();
//    }
//
//    public List<String> universityName() {
//        List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1haoj0b']"));
//        List<String> lil = new ArrayList<>();
//        for (WebElement element:listElement) {
//            lil.add(element.getText());
//        }
//        return lil;
//    }
//
//    public String Board()
//    {
//        return driver.findElement(By.xpath("//div[normalize-space()='CBSE']")).getText();
//    }
//
//    public String Class()
//    {
//       return driver.findElement(By.xpath("//div[@class='row align-items-center g-4']/div[4]/div/div/div")).getText();
//        //div[@class='MuiFormControl-root css-mla5jh']//div//div
//    }
//
//    public String year()
//    {
//      // List<WebElement> val= driver.findElements(By.xpath("//input[@placeholder='YYYY']"));
//        //button[@class='MuiPickersYear-yearButton Mui-selected css-osz2eb']
//        //driver.findElement(By.xpath(""))
//       // WebElement y =val.get(1);
//       WebElement year= driver.findElement(By.xpath("//input[@placeholder='YYYY']"));
//        return year.getDomAttribute("value");
//    }
//
//    public void Click_Next_Button()
//    {
//        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']")).click();
//    }

}
