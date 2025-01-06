package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

import static hooks.Hook.driver;


public class Basic_informationPage extends BasePage {
    public Basic_informationPage(WebDriver driver) {
        super(driver);
    }


    public String First_Name()
    {
        WebElement nameElement=driver.findElement(By.xpath("//input[@name='first_name']"));
        //input[@class='form-control']
       // System.out.println("First Name= "+firstName);
        return nameElement.getDomAttribute("value");
    }

    public String Last_Name()
    {
        WebElement nameLastElement=driver.findElement(By.xpath("//input[@name='last_name']"));
        //System.out.println("Last Name= "+lastName);
        return nameLastElement.getDomAttribute("value");
    }

    public boolean Gender()
    {
            WebElement gender=driver.findElement(By.xpath("//input[@value='male']"));
           return gender.isEnabled();
    }

    public String Date_of_Birth()
    {
        WebElement dob=driver.findElement(By.xpath("//input[@id=':r6:']"));
        return dob.getDomAttribute("value");
    }

   public String Father_Name()
   {
       return driver.findElement(By.xpath("//input[@name='father_name']")).getDomAttribute("value");
   }

   public String Mother_Name()
   {
        return driver.findElement(By.xpath("//input[@name='mother_name']")).getDomAttribute("value");
   }

   public String Guardian_Name()
   {
      return driver.findElement(By.xpath("//input[@name='guardian_name']")).getDomAttribute("value");
   }

   public void Submit_Butten()
   {
       WebElement sumitbutn=driver.findElement(By.xpath("//button[text()='Next']"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click()",sumitbutn);
   }

}
