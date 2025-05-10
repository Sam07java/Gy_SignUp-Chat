package page;

import io.cucumber.java.ja.且つ;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Student_DashBoard_InnerChatBox extends BasePage{

    public Student_DashBoard_InnerChatBox(WebDriver driver) {
        super(driver);
    }

Logger logger=LogManager.getLogger(this.getClass().getName());
    public void enter_Your_FullName(String fullName)
    {// (1)
        WebElement full=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        full.sendKeys(fullName);
        full.sendKeys(Keys.ENTER);
    }

  /*  public void select_Your_DOB(String date)
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).sendKeys(date);
    }

    public void dateClick()
    {
        driver.findElement(By.xpath("//button[@class='chat_search_btn']//*[name()='svg']")).click();
    }

    public void datepicker()
    {//(2)
        driver.findElement(By.xpath("//button[@aria-label='Choose date']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='9']")).click();
        driver.findElement(By.xpath("//button[@class='chat_search_btn']")).click();
    }*/

    public void enter_main_learning_goal(String goal)
    {//(3)
       WebElement lgoal=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
               lgoal.sendKeys(goal);
               lgoal.sendKeys(Keys.ENTER);
    }

    public void select_Gender()
    {   //(4)
        //Male or Female
        WebElement gen= driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        gen.click();
        WebElement male =  driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div[2]"));
         male.click();
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

    public void select_School_type()
    {//school or collage
        driver.findElement(By.className("css-hlgwow")).click();
            WebElement schoolElement = driver.findElement(By.id("react-select-3-option-0"));
            schoolElement.click();
    }

    public void select_Collage_type()
    {
        driver.findElement(By.className("css-hlgwow")).click();
        driver.findElement(By.xpath("//div[text()='College']")).click();
    }

    public void please_Select_your_University(String University)
    {
        System.out.println("University Methode execution started");
        driver.findElement(By.className("css-19bb58m")).click();

       List <WebElement> uni = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
       for(WebElement univer_sity:uni)
       {
          String u=univer_sity.getText();
           if(u.equalsIgnoreCase(University))
           {
               univer_sity.click();
               break;
           }
       }
    }

    public void please_Select_your_Institution(String institution)
    {
        System.out.println("Institution Methode is execution started. ");
        driver.findElement(By.className("css-19bb58m")).click();
        List <WebElement> ins = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
        for(WebElement instit_ution:ins){
            String u=instit_ution.getText();
            if(u.equalsIgnoreCase(institution)){
                instit_ution.click();
                break;
            }
        }
    }

    public void please_select_your_Course(String course)
    {
        System.out.println("Course Methode is started");
        driver.findElement(By.className("css-19bb58m")).click();

        List <WebElement> cou = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
        for(WebElement cou_ution:cou)
        {
            String u=cou_ution.getText();
            if(u.equalsIgnoreCase(course))
            {
                cou_ution.click();
                break;
            }
        }
    }

    public void please_select_your_Semester(String semester)
    {
        driver.findElement(By.className("css-19bb58m")).click();  //css-19bb58m
       // WebElement cbseElement=driver.findElement(By.id("react-select-3-option-0"));
       // cbseElement.click();
       List<WebElement> sem= driver.findElements(By.xpath("//div[@role='option']"));
        //div[@class='css-10wo9uf-option']

       for(WebElement semElement : sem) {
          String semText= semElement.getText();
          if(semText.equalsIgnoreCase(semester)) {
              semElement.click();
              break;
          }
       }
        System.out.println("Semester Clicked");
    }

    public void please_select_your_learningStyle()
    {
        driver.findElement(By.className("css-19bb58m")).click();  //css-19bb58m
        WebElement cbseElement=driver.findElement(By.id("react-select-3-option-0"));
        cbseElement.click();
    }

    public void user_select_which_your_subject_belongs(String subjectPreference)
    {
        driver.findElement(By.className("css-19bb58m")).click();
       List<WebElement> subElemets= driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
       for(WebElement subjectElemet:subElemets)
       {
           String subText=subjectElemet.getText();
           if(subText.equalsIgnoreCase(subjectPreference))
           {
               subjectElemet.click();
               break;
           }
       }
        //div[@class='css-qr46ko']//div
        //div[@class='css-10wo9uf-option']
    }

    public void user_select_semester()
    {
        driver.findElement(By.className("css-19bb58m")).click();
        driver.findElement(By.className("css-d7l1ni-option")).click();
    }

    public void user_select_schoolName(String schoolNAme){
        driver.findElement(By.className("css-19bb58m")).click();
         List<WebElement> school=driver.findElements(By.xpath("//div[@role='option']"));
         for(WebElement schoolElement:school){
             if(schoolElement.getText().equalsIgnoreCase(schoolNAme)){
                 schoolElement.click();
                 break;
             }
         }


    }

    public void user_select_teacherName(String teacherName){
        driver.findElement(By.className("css-19bb58m")).click();
        List<WebElement> teacher=driver.findElements(By.xpath("//div[@role='option']"));
        for(WebElement teacherElement: teacher){
            if(teacherElement.getText().equalsIgnoreCase(teacherName)){
                teacherElement.click();
                break;
            }
        }
    }

    public void select_your_board()
    {// CBSE or ICSE or State Board
        driver.findElement(By.className("css-19bb58m")).click();
        WebElement cbseElement=driver.findElement(By.id("react-select-3-option-0"));
        cbseElement.click();
    }

    public void select_your_class()
    {//Select class 1 to 12
        WebElement clickDropDown=driver.findElement(By.className("css-19bb58m"));
        clickDropDown.click();
        driver.findElement(By.id("react-select-3-option-10")).click();
    }

    public void select_your_classes(String clas)
    {driver.findElement(By.className("css-19bb58m")).click();
        List <WebElement> cbseClass =driver.findElements(By.xpath("//div[@role='option']"));
            for(WebElement cb:cbseClass)
            {
                if(cb.getText().equalsIgnoreCase(clas)) {
                    cb.click();
                    break;
                }
            }
    }

    public void choose_your_hobbies(String hobbie)
    {
        WebElement choosinessHobbies=driver.findElement(By.className("css-19bb58m"));
        choosinessHobbies.click();
        //driver.findElement(By.id("react-select-3-option-5")).click();
         try {
          List<WebElement> hobbies = driver.findElements(By.xpath("//div[@role='option']"));
             //div[@class='css-10wo9uf-option']
            for (WebElement hb : hobbies) {
                String hob = hb.getText();
                if (hob.equalsIgnoreCase(hobbie)) {
                  hb.click();
                 // return;
                    break;
                }
            }
         }
        catch(StaleElementReferenceException a)
        {
        System.out.println("Exception Handled");
        }
        System.out.println("Hobbie clicked");
    }
    //div[@class='css-d7l1ni-option']
    public void select_known_language(String language)
    {
        WebElement chooseLang=driver.findElement(By.className("css-19bb58m"));//css-19bb58m
        chooseLang.click();
       // driver.findElement(By.id("react-select-3-option-0")).click();
            List<WebElement> lang = driver.findElements(By.xpath("//div[@role='option']"));
            //div[@class='css-10wo9uf-option']
            for (WebElement hb : lang) {
                String hob = hb.getText();
                if (hob.equalsIgnoreCase(language)) {
                    hb.click();
                    //return;
                    break;
                }
            }
        System.out.println("language clicked");
    }

    public void select_proficiency() {
        WebElement chooseProficiency=driver.findElement(By.className("css-19bb58m"));
        chooseProficiency.click();
        driver.findElement(By.xpath("//div[@class='css-d7l1ni-option']")).click();
        //driver.findElement(By.id("react-select-3-option-2")).click();
    }

    public void select_your_mobile_number_country_code()
    {
        driver.findElement(By.className("selected-flag")).click();
        WebElement chooseIndia=driver.findElement(By.xpath("//li[@data-flag-key='flag_no_0']"));
        chooseIndia.click();
    }

    public void What_is_your_mobile_number(String phnNo)
    {
        WebElement mobileNO=driver.findElement(By.className("form-control"));
        mobileNO.sendKeys(phnNo);
        mobileNO.sendKeys(Keys.ENTER);
    }

    public void What_is_your_WhatsApp_number(String wtzpNo)
    {
       WebElement watzup= driver.findElement(By.className("form-control"));
       watzup.sendKeys(wtzpNo);
       watzup.sendKeys(Keys.ENTER);
    }

    public void Select_your_subject_name(String subjectPreference)
    {
        driver.findElement(By.className("css-19bb58m")).click();
      List <WebElement> subPreference= driver.findElements(By.xpath("//div[@role='option']"));
      for(WebElement subPreElement : subPreference) {
           String sub= subPreElement.getText();
          System.out.println(sub);
           if(sub.equalsIgnoreCase(subjectPreference)){
               subPreElement.click();
               break;
           }
        }

        //driver.findElement(By.className("css-1xc3v61-indicatorContainer")).click();
        //driver.findElement(By.xpath("//div[text()='Science']")).click();

    }

    public void What_is_your_preference(String preference)
    {
        WebElement pref=driver.findElement(By.className("form-control"));
        pref.sendKeys(preference);
        pref.sendKeys(Keys.ENTER);
    }

    public void Add_your_score_in_percentage(String percentage)
    {
        WebElement prec=driver.findElement(By.className("form-control"));
        prec.sendKeys(percentage);
        prec.sendKeys(Keys.ENTER);
    }

    public void select_your_current_country_of_residence(String country)
    {
        WebElement ele=driver.findElement(By.xpath("//div[@class='css-19bb58m']"));
        ele.click();
        List<WebElement> countryW=driver.findElements(By.xpath("//div[@class='css-10wo9uf-option']"));
        for (WebElement countryEle:countryW)
        {
            if(countryEle.getText().equalsIgnoreCase(country))
            {
                countryEle.click();
                break;
            }
        }
    }

    public void which_state_do_you_currently_reside_in(String state)
    {
        driver.findElement(By.xpath("//div[@class='css-19bb58m']")).click();
        List<WebElement>stateElements= driver.findElements(By.xpath("//div[@class='css-10wo9uf-option']"));
     for(WebElement stateWebEl:stateElements)
     {
         if(stateWebEl.getText().equalsIgnoreCase(state))
         {
             stateWebEl.click();
             break;
         }
     }
    }

    public void which_district(String district1)
    {
       WebElement district= driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
       district.sendKeys(district1);
       district.sendKeys(Keys.ENTER);
    }

    public void which_city(String city)
    {
        WebElement ci=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        ci.sendKeys(city);
        ci.sendKeys(Keys.ENTER);
    }

    public void enter_pin_Code(String pincode)
    {
        WebElement pin=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        pin.sendKeys(pincode);
        pin.sendKeys(Keys.ENTER);
    }

    public void enter_first_address(String firstAddress)
    {
        WebElement fadd=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
        fadd.sendKeys(firstAddress);
        fadd.sendKeys(Keys.ENTER);
    }

   public void what_is_your_second_address(String secondAddress)
   {
       WebElement sAdd=driver.findElement(By.xpath("//input[@placeholder='Type your answer and press enter']"));
       sAdd.sendKeys(secondAddress);
       sAdd.sendKeys(Keys.ENTER);
   }

    public boolean validateInnerChatBox() {
        try {
            WebElement text = driver.findElement(By.xpath("//div[@class='chatinput-body']"));

            if (text.isDisplayed()) {
                logger.info("Inner ChatBox is visible on the screen.");
                text.click();
                return true;
            } else {
                logger.warn("Inner ChatBox is not visible.");
                return false;
            }

        } catch (NoSuchElementException e) {
            logger.error("Inner ChatBox element not found: {}", e.getMessage());
            return false;
        } catch (Exception e) {
            logger.error("Unexpected error while validating Inner ChatBox: {}", e.getMessage());
            return false;
        }
    }




}