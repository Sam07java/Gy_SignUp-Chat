package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        Thread.sleep(500);
        driver.navigate().refresh();
      WebElement dropdownToggle=  driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",dropdownToggle);

       WebElement logoutButton= driver.findElement(By.xpath("//button[text()=' Logout']"));
        //driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center gap-2 py-2']")).click();
        //button[text()='Logout']

         JavascriptExecutor jss=(JavascriptExecutor)driver;
        jss.executeScript("arguments[0].click()",logoutButton);
    }

    public void profile_edit_page() throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropdownToggle=  driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",dropdownToggle);

        WebElement profileElement=  driver.findElement(By.xpath("//button[text()=' Profile']"));
        JavascriptExecutor jss=(JavascriptExecutor)driver;
        jss.executeScript("arguments[0].click()",profileElement);
    }
}
