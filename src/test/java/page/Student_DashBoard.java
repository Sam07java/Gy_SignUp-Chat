package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static hooks.Hook.driver;

public class Student_DashBoard extends BasePage {

    public Student_DashBoard(WebDriver driver) {
        super(driver);
    }

    public void logOut() throws InterruptedException {

        driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']")).click();
        driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center gap-2 py-2']")).click();
    }

    public void profile_edit_page()
    {
        driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-toggle-nocaret']")).click();
        driver.findElement(By.xpath("//a[text()='Profile']")).click();
    }

}
