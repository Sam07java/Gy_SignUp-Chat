package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class Student_DashBoard_InnerChatBox extends BasePage{

    public Student_DashBoard_InnerChatBox(WebDriver driver) {
        super(driver);
    }

    public void enter_Your_FullName(String fullName)
    {
        // (1)
        WebElement full=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        full.sendKeys(fullName);
        full.sendKeys(Keys.ENTER);
    }

    public void select_Your_DOB(String date)
    {
        //div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-adornedEnd Mui-readOnly MuiInputBase-readOnly css-bl65n1']
        //input[@id=':r8:']
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).sendKeys(date);
    }

    public void dateClick()
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).click();
    }

    public void datepicker()
    {
        //(2)
        driver.findElement(By.xpath("//button[@aria-label='Choose date']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='9']")).click();
        driver.findElement(By.xpath("//button[@class='chat_search_btn']")).click();
    }

    public void enter_main_learning_goal(String goal)
    {
        //(3)
       WebElement lgoal=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
               lgoal.sendKeys(goal);
               lgoal.sendKeys(Keys.ENTER);
    }

    public void select_Gender(String gender)
    {   //(4)
        //Male or Female
        /*WebElement gen= driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select dropGender=new Select(gen);
        dropGender.selectByValue(gender);*/
        //div[@class='css-1wy0on6']
        //input[@aria-activedescendant='react-select-4-option-1']
        //div[@id='react-select-2-option-0']
        //div[@id='react-select-2-listbox']/div[2]
        WebElement gen= driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        gen.click();
        WebElement male =  driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div[2]"));
         male.click();
       // System.out.println(male);

    }

    public void enter_Mother_Name(String motherName)
    {   //(5)
    WebElement Mname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));

    Mname.sendKeys(motherName);
    Mname.sendKeys(Keys.ENTER);
    }

    public void enter_Father_Name(String fatherName)
    {   //(6)
        WebElement Fname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
               Fname.sendKeys(fatherName);
               Fname.sendKeys(Keys.ENTER);
    }

    public void enter_Quardian_Name(String quardianName)
    {   //(7)
        WebElement Qname=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
                Qname.sendKeys(quardianName);
                Qname.sendKeys(Keys.ENTER);
    }

    public void Upload_Profile_Picture(String path)
    {   //(8)
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
    }

    public void select_institute_type(String institute)
    {
        //school or collage
        WebElement itype=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select ityp=new Select(itype);
        ityp.selectByContainsVisibleText(institute);
    }

    public void select_your_board(String boardName)
    {// CBSE or ICSE or State Board
        WebElement board=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select bb=new Select(board);
        bb.deSelectByContainsVisibleText(boardName);
    }

    public void select_your_class(String clas)
    {
        WebElement cl=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select cc=new Select(cl);
        cc.selectByContainsVisibleText(clas);
    }

    public void choose_your_hobbies(int hobbie)
    {
        WebElement hb=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select hobie=new Select(hb);
        hobie.selectByContainsVisibleText(String.valueOf(hobbie));
    }

    public void select_known_language(String language)
    {
        WebElement skl=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select lng=new Select(skl);
        lng.selectByContainsVisibleText(language);
    }

    public void select_proficiency() {
        WebElement sp = driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        Select spp = new Select(sp);
        spp.selectByIndex(2);
    }


}
