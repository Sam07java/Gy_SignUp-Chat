package page;

import org.junit.Assert;
import org.openqa.selenium.*;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void click_Registration_Button() {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    }

    public void Enter_Email(String email) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
    }

    public void Enter_Password(String password) {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    public void click_checkBox_TermsAndCondition() {
        driver.findElement(By.xpath("//input[@id='flexCheckDefault']")).click();
    }

    public void click_SignUp_Now() {
        WebElement we=driver.findElement(By.xpath("//button[text()='Sign Up Now']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",we);
    }

    public void Enter_phoneNo(String phnNo){
        driver.findElement(By.id("phone")).sendKeys(phnNo);
    }


    public void registration_Validation() throws InterruptedException {
            Thread.sleep(6000);
        //h1[normalize-space()='Sign In']
        //div[text()='Userid already exists']
        //Thread.sleep(2000);
        /*WebElement titl=driver.findElement(By.xpath("//h1[normalize-space()='Sign In']"));
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
        }*/
        try {
            WebElement successAlert = driver.findElement(By.xpath("//div[text()='User created successfully']"));
            boolean alrt=successAlert.isDisplayed();
            System.out.println(alrt);
            if(alrt) {
                System.out.println("Registration Successful");
                Assert.assertTrue(true);
            }
            else
            {
                System.out.println("Registration Failed");
            }
        }
        catch (NoSuchElementException e)
        {
            System.out.println("An error occurred during invalid signup validation.");
            Assert.fail("Registration Failed");
            e.printStackTrace();
           // Thread.sleep(2000);
         //   WebElement failedAlert = driver.findElement(By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--top-right']"));
            //div[text()='Userid already exists']
            //div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']
            //div[@class='Toastify__toast-container Toastify__toast-container--top-right']
          //  boolean alrtF=failedAlert.isDisplayed();
          //  System.out.println("Registration Failed");

        }
    }

}
