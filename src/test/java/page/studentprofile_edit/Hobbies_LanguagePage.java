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

import static hooks.Hook.driver;

public class Hobbies_LanguagePage extends BasePage {

    private final Logger logger = BaseClass.getLogger();
    private final WebDriverWait wait;

    public Hobbies_LanguagePage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String Hobbies() {
        By locator = By.xpath("//div[@id='demo-multiple-checkbox']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String hobbiesText = driver.findElement(locator).getText();
        logger.info("Fetched hobbies: {}", hobbiesText);
        return hobbiesText;
    }

    public String Language() {
        By locator = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1haoj0b']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String languageText = driver.findElement(locator).getText();
        logger.info("Fetched language: {}", languageText);
        return languageText;
    }



    public void Click_Button() {
        By locator = By.xpath("//button[@class='btn btn-dark px-lg-5 px-4  ms-auto d-block rounded-pill next-btn']");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement nextBtn = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
        logger.info("Clicked on Next button in Hobbies and Language page");
    }

//    public Hobbies_LanguagePage(WebDriver driver) {
//        super(driver);
//    }
//
//    public String Hobbies()
//    {
//        WebElement hobbies=driver.findElement(By.xpath("//div[@id='demo-multiple-checkbox']"));
//       return hobbies.getText();
//    }
//
//    public String Language()
//    {
//       WebElement language= driver.findElement(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1haoj0b']"));
//        //div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-oo3z1f']/div
//        //div[@id='language-select-41681344-0bb1-4063-9a48-e300bdcfc7e6']
//        //div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']
//      return language.getText();
//    }
//
//    public void Click_Button()
//    {
//       WebElement clk_btn= driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 px-4  ms-auto d-block rounded-pill next-btn']"));
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()",clk_btn);
//    }

}
