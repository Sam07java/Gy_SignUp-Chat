package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void EnterUserName(String username)
    {
        driver.findElement(By.xpath("//input[@id='email/phone']")).sendKeys(username);
    }

    public void EnterPassword(String password)
    {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    public void ClickSign_Now()
    {
       WebElement clkk= driver.findElement(By.xpath("//button[normalize-space()='Sign in Now']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clkk);
    }

    public void validatestudentpriflelogin()
    {
        try {
            WebElement titile = driver.findElement(By.xpath("//h3[text()='Hi, How can I help you today?']"));
            if (titile.isDisplayed()) {
                System.out.println("Login Successful");
                Assert.assertTrue(true);
            } else {
                System.out.println("Login Failed");
                Assert.fail("login Failed");
            }
        }
        catch (Exception e) {
            System.out.println("An error occurred during invalid signup Credential.");
            e.printStackTrace();
            Assert.fail("login Failed");
        }
    }

}
