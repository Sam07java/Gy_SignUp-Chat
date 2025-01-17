package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Academic_HistoryPage extends BasePage {
    public Academic_HistoryPage(WebDriver driver) {
        super(driver);
    }

    public String Institute_Type()
    {
        WebElement scl=driver.findElement(By.xpath("//div[normalize-space()='School']"));
        return scl.getText();
        //div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-oo3z1f']//div
    }

    public String institute_type_college()
    {
       return driver.findElement(By.xpath("//div[text()='College']")).getText();
    }

    public List<String> universityName() {
        List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='col form_field_wrapper']//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']"));
        List<String> lil = new ArrayList<>();
        for (WebElement element:listElement) {
            lil.add(element.getText());
        }
        return lil;
    }

    public String Board()
    {
        return driver.findElement(By.xpath("//div[normalize-space()='CBSE']")).getText();
    }

    public String Class()
    {
       return driver.findElement(By.xpath("//div[@class='MuiFormControl-root css-mla5jh']//div//div")).getText();
    }

    public String year()
    {
       List<WebElement> val= driver.findElements(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']"));
        //button[@class='MuiPickersYear-yearButton Mui-selected css-osz2eb']
        //driver.findElement(By.xpath(""))
        WebElement y =val.get(1);
        return y.getDomAttribute("value");
    }

    public void Click_Next_Button()
    {
        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']")).click();
    }

}
