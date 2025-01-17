package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;

import static hooks.Hook.driver;

public class Subject_Preference extends BasePage {
    public Subject_Preference(WebDriver driver) {
        super(driver);
    }

    public String Subject()
    {
               //System.out.println(preference);
        return   driver.findElement(By.xpath("//div[@id='mui-component-select-subject_id']")).getText();
    }

    public String Preferene()
    {
        return driver.findElement(By.xpath("//input[@name='preference']")).getDomAttribute("value");
    }

    public String Score_Percentage()
    {
       return driver.findElement(By.xpath("//input[@name='score_in_percentage']")).getDomAttribute("value");
    }

    public String semester_verification()
    {
      return   driver.findElement(By.id("mui-component-select-sem_id")).getText();
    }

}
