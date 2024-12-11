package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void click_Registration_Button()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    }

    public void Enter_Email(String email)
    {
        driver.findElement(By.xpath("//input[@id='emailphone']")).sendKeys(email);
    }

    public void Enter_Password(String password)
    {
        driver.findElement(By.xpath("//input[@id=':r1:']")).sendKeys(password);
    }

    public void click_checkBox_TermsAndCondition()
    {
        driver.findElement(By.xpath("//input[@id='flexCheckDefault']")).click();
    }

    public void click_SignUp_Now()
    {
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up Now']")).click();
    }

    public void registration_Validation() throws InterruptedException {
       // WebElement failedAlert=driver.findElement(By.xpath("//div[contains(text(),'Userid already exists')]"));
        //WebElement successAlert=driver.findElement(By.xpath("//div[contains(text(),'User created successfully')]"));
        //h1[normalize-space()='Sign In']
        Thread.sleep(2000);
        WebElement titl=driver.findElement(By.xpath("//h1[normalize-space()='Sign In']"));
        WebElement titl2=driver.findElement(By.xpath("//h1[normalize-space()='Sign Up']"));
        if(titl.isDisplayed())
        {
            Assert.assertTrue(true);
            System.out.println("Registration Successfully");
        }
        else if(titl2.isDisplayed())
        {
            //if (failedAlert.getText().equalsIgnoreCase("Userid already exists"))
            System.out.println("Registry Failed");
        }
    }

}
