package page.studentprofile_edit;

import factory.BaseClass;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

import java.time.Duration;



public class Subject_Preference extends BasePage {

    private final Logger logger = BaseClass.getLogger();
    private final WebDriverWait wait;
    WebDriver driver;
    public Subject_Preference(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String Subject() {
        By subjectLocator = By.id("mui-component-select-subject_id");
        wait.until(ExpectedConditions.visibilityOfElementLocated(subjectLocator));
        String subject = driver.findElement(subjectLocator).getText();
        logger.info("Selected Subject: {}", subject);
        return subject;
    }

    public String Preferene() {
        By prefLocator = By.xpath("//input[@name='preference']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(prefLocator));
        String preference = driver.findElement(prefLocator).getDomAttribute("value");
        logger.info("Subject Preference: {}", preference);
        return preference;
    }

    public String Score_Percentage() {
        By scoreLocator = By.xpath("//input[@name='score_in_percentage']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(scoreLocator));
        String score = driver.findElement(scoreLocator).getDomAttribute("value");
        logger.info("Score Percentage: {}", score);
        return score;
    }

    public String semester_verification() {
        By semesterLocator = By.id("mui-component-select-sem_id");
        wait.until(ExpectedConditions.visibilityOfElementLocated(semesterLocator));
        String semester = driver.findElement(semesterLocator).getText();
        logger.info("Semester Selected: {}", semester);
        return semester;
    }

    public String studentclass(){
        //div[@role='role']
        By semesterLocator = By.xpath("//div[@aria-labelledby='class-label']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(semesterLocator));
        String stuclass = driver.findElement(semesterLocator).getText();
        logger.info("Semester Selected: {}", stuclass);
        return stuclass;
    }

    public String teacher(){
        By semesterLocator = By.id("mui-component-select-teacher_id");
        wait.until(ExpectedConditions.visibilityOfElementLocated(semesterLocator));
        String teacherText = driver.findElement(semesterLocator).getText();
        logger.info("Semester Selected: {}", teacherText);
        return teacherText;
    }

//    public Subject_Preference(WebDriver driver) {
//        super(driver);
//    }
//
//    public String Subject()
//    {
//               //System.out.println(preference);
//        return   driver.findElement(By.xpath("//div[@id='mui-component-select-subject_id']")).getText();
//    }
//
//    public String Preferene()
//    {
//        return driver.findElement(By.xpath("//input[@name='preference']")).getDomAttribute("value");
//    }
//
//    public String Score_Percentage()
//    {
//       return driver.findElement(By.xpath("//input[@name='score_in_percentage']")).getDomAttribute("value");
//    }
//
//    public String semester_verification()
//    {
//      return   driver.findElement(By.id("mui-component-select-sem_id")).getText();
//    }

}
