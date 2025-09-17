package page;

import factory.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class RgistrationPage_Teacher extends BasePage{
    public RgistrationPage_Teacher(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement first_Name;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement last_Name;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement mobile_Number;

    @FindBy(xpath = "//input[@name='email_id']")
    WebElement email_ID;

    @FindBy(id = "subject_select_0")
    WebElement subject_element;

    public void enter_first_name(String firstName){
        first_Name.sendKeys(firstName);
    }

    public void enter_last_name(String lastName){
        last_Name.sendKeys(lastName);
    }

    public void enter_mobile_Number(String mobileNumber){
        mobile_Number.sendKeys(mobileNumber);
    }

    public void enter_EmailId(String email){
        email_ID.sendKeys(email);
    }

    public void click_Next_Button(){
        driver.findElement(By.xpath("//button[text()='Next']")).click();
    }

    public void select_country(){
        WebElement elementcountry= driver.findElement(By.name("rcrs-country"));
        Select select=new Select(elementcountry);
        select.selectByVisibleText("India");
    }

    public void select_state(){
        WebElement elementstate= driver.findElement(By.name("rcrs-region"));
        Select select=new Select(elementstate);
        select.selectByVisibleText("Kerala");
    }

    public void enter_District(){
        WebElement district= driver.findElement(By.name("district"));
        district.sendKeys("Alappuzha");
    }

    public void enter_City(){
        WebElement city= driver.findElement(By.name("city"));
        city.sendKeys("Alpy");
    }

    public void enter_Address(){
        WebElement address= driver.findElement(By.name("address"));
        address.sendKeys("Kal");
    }

    public void enter_pincode(){
        WebElement pincode= driver.findElement(By.name("pincode"));
        pincode.sendKeys("990123");
    }

    public void select_Entity(String en){
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

    public void select_Institute(String inst){
        driver.findElement(By.id("demo2-multiple-name")).click();
        List<WebElement> instituteele = driver.findElements(By.xpath("//li[@role='option']"));
        for(WebElement ele : instituteele){
            String instt=ele.getText();
            if(instt.equalsIgnoreCase(inst)){
                ele.click();
                break;
            }
        }
    }

    public void select_institute_college(String inst){
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div")).click();
        List<WebElement> instituteele = driver.findElements(By.xpath("//li[@role='option']"));
        for(WebElement ele : instituteele){
            String instt=ele.getText();
            if(instt.equalsIgnoreCase(inst)){
                ele.click();
                break;
            }
        }
    }

    public void select_course(String course){
        driver.findElement(By.id("demo3-multiple-name-0")).click();
        List<WebElement> instituteele = driver.findElements(By.xpath("//li[@role='option']"));
        for(WebElement ele : instituteele){
            String instt=ele.getText();
            if(instt.equalsIgnoreCase(course)){
                ele.click();
                break;
            }
        }
    }

    public void select_semester(String sem){
        driver.findElement(By.id("semester_select_0")).click();
        List<WebElement> instituteele = driver.findElements(By.xpath("//li[@role='option']"));
        for(WebElement ele : instituteele){
            String instt=ele.getText();
            if(instt.equalsIgnoreCase(sem)){
                ele.click();
                break;
            }
        }
    }

    public void teaching_Experince(String exp){
        driver.findElement(By.name("experience")).sendKeys(exp);
    }

    public void select_Qualification() throws InterruptedException {
        driver.findElement(By.id("demo1-multiple-name")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//li[normalize-space()='B.Tech']")).click();
    }

    public void select_class(String cl){
        driver.findElement(By.id("class_select_0")).click();
       List  <WebElement> classELement = driver.findElements(By.xpath("//li[@role='option']"));
       for (WebElement clss : classELement){
           if(clss.getText().equalsIgnoreCase(cl)){
               clss.click();
               break;
           }
       }
    }

    public void select_subject(String subjA, String subjB) throws InterruptedException {
        Thread.sleep(1000);
        BaseClass.getLogger().info("Clicking on Subject dropdown");
        subject_element.click();
        //  driver.findElement(By.id("mui-component-select-courses.0.subjects")).click();
        BaseClass.getLogger().info("Subject dropdown clicked.");

        List<String> subjectsToSelect = Arrays.asList(subjA.trim(), subjB.trim());
        List<WebElement> subjectOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/span"));

        for (String subject : subjectsToSelect) {
            boolean isFound = false;
            for (WebElement option : subjectOptions) {
                String value = option.getText();
                if (value.equalsIgnoreCase(subject)) {
                    WebElement checkbox = option.findElement(By.xpath("//input[@type='checkbox']"));
                    if (!checkbox.isSelected()) {
                        option.click();
                        BaseClass.getLogger().info("Selected subject: " + subject);
                    } else {
                        BaseClass.getLogger().info("Subject already selected: " + subject);
                    }
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                BaseClass.getLogger().warn("Subject not found in dropdown: " + subject);
            }
        }
        WebElement ss = driver.findElement(By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",ss);
    }

    public void upload_Document(String path){
        driver.findElement(By.xpath("//input[@name='document']")).sendKeys(path);
    }

    public void check_Terma$Condition(){
        driver.findElement(By.xpath("//input[@id='flexCheckDefault']")).click();
    }

    public void click_Submit_button() throws InterruptedException {
        Thread.sleep(500);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[text()='Submit']")));
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

}
