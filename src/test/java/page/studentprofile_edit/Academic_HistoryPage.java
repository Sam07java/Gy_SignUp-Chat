package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class Academic_HistoryPage extends BasePage {
    public Academic_HistoryPage(WebDriver driver) {
        super(driver);
    }

    public String Institute_Type()
    {
        WebElement scl=driver.findElement(By.xpath("//div[normalize-space()='School']"));
        return scl.getText();
    }

    public String Board()
    {
        return driver.findElement(By.xpath("//div[normalize-space()='CBSE']")).getText();
    }

    public String Class()
    {
       return driver.findElement(By.xpath("//div[normalize-space()='class 08']")).getText();
    }

    public void Click_Next_Button()
    {
        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']")).click();
    }
}
