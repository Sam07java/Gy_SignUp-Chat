package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void SignIn_with_Email()
    {
        driver.findElement(By.xpath("//div[text()='Sign in with Email / Phone']")).click();
    }
}
