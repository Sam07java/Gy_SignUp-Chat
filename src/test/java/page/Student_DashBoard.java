package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static hooks.Hook.driver;

public class Student_DashBoard extends BasePage {

    public Student_DashBoard(WebDriver driver) {
        super(driver);
    }

    public void logOut() throws InterruptedException {
        Thread.sleep(2000);
       //WebElement dropdownToggle= driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement dropdownToggle= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']")));
       // WebElement dropdownToggle= driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']"));
        dropdownToggle.click();

        driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center gap-2 py-2']")).click();
    }

    public void profile_edit_page() {
        driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']")).click();
        driver.findElement(By.xpath("//a[text()='Profile']")).click();
    }
}
