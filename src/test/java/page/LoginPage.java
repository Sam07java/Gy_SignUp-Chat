package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void SignIn_with_Email()
    {
        driver.findElement(By.xpath("//div[text()='Sign in with Email / Phone']")).click();
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

}
