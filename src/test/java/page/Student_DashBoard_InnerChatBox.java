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
        WebElement full=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        full.sendKeys(fullName);
        full.sendKeys(Keys.ENTER);
    }

    public void select_Your_DOB(String date)
    {
        driver.findElement(By.xpath("//input[@id=':r8:']")).sendKeys(date);
    }

    public void dateClick()
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).click();
    }

    public void enter_main_learning_goal(String goal)
    {
        driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']")).sendKeys(goal);
    }

    public void select_Gender(String gender)
    {
        //Male or Female
        WebElement gen= driver.findElement(By.xpath(""));
        Select dropGender=new Select(gen);
        dropGender.selectByValue(gender);
    }

    public void enter_Mother_Name(String motherName)
    {
        driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']")).sendKeys(motherName);
    }

    public void enter_Father_Name(String fatherName)
    {
        driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']")).sendKeys(fatherName);
    }

    public void enter_Quardian_Name(String quardianName)
    {
        driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']")).sendKeys(quardianName);
    }

    public void Upload_Profile_Picture(String path)
    {
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
