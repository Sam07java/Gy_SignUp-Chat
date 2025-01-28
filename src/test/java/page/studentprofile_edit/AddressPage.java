package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page.BasePage;

import static hooks.Hook.driver;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public String Country_DropDown()
    {
        WebElement dropcountry= driver.findElement(By.xpath("//select[@name='rcrs-country']"));
        Select sl=new Select(dropcountry);
        WebElement selectedoption = sl.getFirstSelectedOption();
        String selectedValue=selectedoption.getText();
        System.out.println(selectedValue);
        return selectedValue;
    }

    public String State_DropDown()
    {
        WebElement dropState=driver.findElement(By.xpath("//select[@name='rcrs-region']"));
        Select sel=new Select(dropState);
        WebElement selected_state= sel.getFirstSelectedOption();
        String sele_state_value= selected_state.getText();
        System.out.println(sele_state_value);
        return sele_state_value;
    }

    public String FirstAddress()
    {
        return driver.findElement(By.xpath("//input[@name='address1']")).getDomAttribute("value");
    }

    public String Address2()
    {
        return driver.findElement(By.xpath("//input[@name='address2']")).getDomAttribute("value");
    }

    public String City()
    {
        return driver.findElement(By.xpath("//input[@name='city']")).getDomAttribute("value");
    }

    public String District()
    {
       return driver.findElement(By.xpath("//input[@name='district']")).getDomAttribute("value");
    }

    public String Pincode()
    {
       return driver.findElement(By.xpath("//input[@name='pincode']")).getDomAttribute("value");
    }

    public void Click_SameAs_Current_Address()
    {
       WebElement el_button= driver.findElement(By.xpath("//input[@name='sameAsCurrent']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",el_button);
    }

    public void Click_Next_Button()
    {
        WebElement next_button=driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5  ms-auto d-block rounded-pill next-btn px-4']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",next_button);
    }
}
