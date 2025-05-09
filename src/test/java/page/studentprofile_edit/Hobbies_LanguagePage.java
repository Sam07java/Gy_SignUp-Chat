package page.studentprofile_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

import static hooks.Hook.driver;

public class Hobbies_LanguagePage extends BasePage {
    public Hobbies_LanguagePage(WebDriver driver) {
        super(driver);
    }

    public String Hobbies()
    {
        WebElement hobbies=driver.findElement(By.xpath("//div[@id='demo-multiple-checkbox']"));
       return hobbies.getText();
    }

    public String Language()
    {
       WebElement language= driver.findElement(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']"));
        //div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-oo3z1f']/div
        //div[@id='language-select-41681344-0bb1-4063-9a48-e300bdcfc7e6']
        //div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']
      return language.getText();
    }

    public void Click_Button()
    {
       WebElement clk_btn= driver.findElement(By.xpath("//button[@class='btn btn-dark px-lg-5 px-4  ms-auto d-block rounded-pill next-btn']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clk_btn);
    }

}
