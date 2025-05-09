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
        List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1haoj0b']"));
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
       return driver.findElement(By.xpath("//div[@class='row align-items-center g-4']/div[4]/div/div/div")).getText();
        //div[@class='MuiFormControl-root css-mla5jh']//div//div
    }

    public String year()
    {
      // List<WebElement> val= driver.findElements(By.xpath("//input[@placeholder='YYYY']"));
        //button[@class='MuiPickersYear-yearButton Mui-selected css-osz2eb']
        //driver.findElement(By.xpath(""))
       // WebElement y =val.get(1);
       WebElement year= driver.findElement(By.xpath("//input[@placeholder='YYYY']"));
        return year.getDomAttribute("value");
    }

    public void Click_Next_Button()
    {
        driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']")).click();
    }

}
