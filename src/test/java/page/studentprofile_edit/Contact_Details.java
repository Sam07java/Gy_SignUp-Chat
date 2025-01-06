package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class Contact_Details extends BasePage {
    public Contact_Details(WebDriver driver) {
        super(driver);
    }

    public String Mobile_No()
    {
       return driver.findElement(By.xpath("//input[@name='phoneNum']")).getDomAttribute("value");
    }

    public String Whatsapp_No()
    {
       return driver.findElement(By.xpath("//input[@name='whatsappNum']")).getDomAttribute("value");
    }

    public String Email_id()
    {
        return driver.findElement(By.xpath("//input[@name='email']")).getDomAttribute("value");
    }

    public void Click_Next_Button1()
    {
        WebElement clk=driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clk);
    }
}
