package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static utility.CalanderObject.convertMonth;

public class DatePicker {

    WebDriver driver;

    public DatePicker(WebDriver driver) {
        this.driver=driver;
    }


    public void DatePickers()
    {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");

        driver.manage().window().maximize();

        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

        driver.switchTo().frame(Frame);

        // Since there are one frame we can use below code too

        // driver.switchTo().frame(0);

        // Approach Number One : This is used almost all time
        /*
         * WebElement datePicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
         * datePicker.sendKeys("04/12/2025");
         */

        //Approach Two
        String year = "2028";
        String month = "March";
        String date = "23";

        WebElement datePicker=driver.findElement(By.xpath("//input[@id='datepicker']"));

        datePicker.click();

        while (true) {

            String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (Month.equals(month) && Year.equals(year)) {
                break;
            }

            WebElement next = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            next.click();
        }
        List<WebElement> allDates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement eachDate : allDates)
        {
            if (eachDate.getText().equals(date))
            {
                eachDate.click();
                break;
            }
        }
    }

    public void datepickerG(String date,String month,String year)
    {
        WebElement datepick=driver.findElement(By.xpath("//button[@aria-label='Choose date']"));
        datepick.click();
        WebElement monthYear=driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']"));
        String my=monthYear.getText();
       // System.out.println("First location"+my);
        String[] parts=my.split(" ");
        //System.out.println("1st Part="+parts[0]);
      //  System.out.println("2nd Part="+parts[1]);
        String displayed_month=parts[0];
        String displayed_year=parts[1];
        WebElement select_year=driver.findElement(By.xpath("//button[@aria-label='calendar view is open, switch to year view']"));
        select_year.click();
        List<WebElement> years=driver.findElements(By.xpath("//div[@class='MuiPickersYear-root css-j9zntq']//button"));
        //For Year selection
        boolean yearFound=false;
        for(WebElement dateWebElement:years)
        {
            String yearText=dateWebElement.getText();
            if(yearText.equals(year))
            {
                dateWebElement.click();
                yearFound=true;
                break;
            }
        }
        if(yearFound)
        {
            System.out.println("clicked on year");
        }
        else
        {
            System.out.println("Year not found");
        }
        //For Month Selection
        while(true)
        {
            WebElement monthYear1=driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']"));
            String afterMonthYear=monthYear1.getText();
            //System.out.println(afterMonthYear);
            String achualdate=month+" "+year;
            if(achualdate.equals(afterMonthYear))
            {
                break;
            }
           // driver.findElement(By.xpath(" //button[@title='Previous month']")).click();
            driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-1fklenr']")).click();
        }
        //For Date Selection
        List<WebElement> dateF=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-126v4m4']"));
        int dateSize=dateF.size();
       // System.out.println("date="+dateSize);
        for(int i=0;i<=dateSize;i++)
        {
           WebElement cell=dateF.get(i);
           if (cell.getText().equals(date))
           {
               cell.click();
               System.out.println("date clicked");
               break;
           }
        }
driver.findElement(By.xpath("//button[@class='chat_search_btn']")).click();
       /* while (true) {

            Month displayMonth = convertMonth(displayed_month);
            Month requiredMonth = convertMonth(month);

            //compare
            int result=requiredMonth.compareTo(displayMonth);
            //0 months are equls
            //>0 future month
            //<0 past

            if (result<0)
            {
                driver.findElement(By.xpath("//button[@title='Previous month']")).click();
            }
            else if (result>0)
            {
                driver.findElement(By.xpath("//button[@title='Next month']")).click();
            }
            else
            {
                break;
            }
        }*/
    }

}
