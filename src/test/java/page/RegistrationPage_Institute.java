package page;

import factory.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegistrationPage_Institute extends BasePage {

    public RegistrationPage_Institute(WebDriver driver) {
        super(driver);
    }

//    @FindBy(id = "mui-component-select-entity_id")
//    WebElement Entity;

    public void select_entity(String en) throws InterruptedException {
        Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Locate the dropdown
////        WebElement entity = driver.findElement(By.xpath("//div[@id='mui-component-select-entity_id']"));
////        WebElement entity =
//        driver.findElement(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1mx121p']")).click();
//
//        // Click using JavaScript Executor
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("arguments[0].click();", entity);
//        BaseClass.getLogger().info("Clicking on entity button");
//
//        // Wait for the dropdown options to appear and then click the 'School' option
//        WebElement schoolOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//li[normalize-space(text())='school']") // Capitalize if needed
//        ));
//        schoolOption.click();

        driver.findElement(By.id("mui-component-select-entity_id")).click();

        List<WebElement> entity = driver.findElements(By.xpath("//li[@role='option']"));
        for (WebElement entit : entity) {
            String text = entit.getText().trim();
            if (text.equalsIgnoreCase(en)) {
                entit.click();
                System.out.println("Found School");
            } else if (text.equalsIgnoreCase(en)) {
                // Your code when it's "college"
                entit.click();
                System.out.println("Found College");
            }
        }
    }

    public void select_University(String uni){
        driver.findElement(By.id("mui-component-select-university_id")).click();
        List<WebElement> instituteele = driver.findElements(By.xpath("//li[@role='option']"));
        for(WebElement ele : instituteele){
            String instt=ele.getText();
            if(instt.equalsIgnoreCase(uni)){
                ele.click();
                break;
            }
        }
    }



    public void enter_the_institutename(String instituteName){
        driver.findElement(By.name("institute_name")).sendKeys(instituteName);
    }

    public void enter_the_webside(String website){
        driver.findElement(By.name("website_url")).sendKeys(website);
    }

    public void school_name(String schoolname){
        driver.findElement(By.name("school_name")).sendKeys(schoolname);
    }

    public void enter_mobile_Number(String phoneNo){
        driver.findElement(By.name("mobile_no")).sendKeys(phoneNo);
    }

    public void enter_email_id(String emailID){
        driver.findElement(By.name("email_id")).sendKeys(emailID);
    }

    public void click_Next_Buttom(){
        driver.findElement(By.xpath("//button[text()='Next']")).click();
    }

    public void upload_Document(){
        driver.findElement(By.xpath("//input[@name='document']")).sendKeys("C:/Users/WIIS/Downloads/XPath (1).pdf");
    }

    public void upload_logo(){
        driver.findElement(By.xpath("//input[@name='icon']")).sendKeys("C:/Users/WIIS/Downloads/apps-netflix.256x256.png");
    }

    public WebElement uploadfile_elements(){
        return driver.findElement(By.xpath("//li[@class='flex items-center justify-between mt-2']"));
    }

    public WebElement uploadLogo_elemets(){
        return driver.findElement(By.xpath("//li[@class='flex items-center justify-between']"));
    }
}
