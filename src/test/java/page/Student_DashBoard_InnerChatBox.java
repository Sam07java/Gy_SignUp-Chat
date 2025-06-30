package page;


import org.openqa.selenium.*;

import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Screenshot;
import utility.WaitHelper;

public class Student_DashBoard_InnerChatBox extends BasePage{

    public Student_DashBoard_InnerChatBox(WebDriver driver) {
        super(driver);
    }

Logger logger=LogManager.getLogger(this.getClass().getName());

    public void enter_Your_FullName(String fullName) {
        logger.info("Entering full name: " + fullName);
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By inputLocator = By.xpath("//input[@placeholder='Type your answer and press enter']");

            WebElement full = wait.until(ExpectedConditions.visibilityOfElementLocated(inputLocator));
            full.sendKeys(fullName);

            // Short wait for any front-end debounce logic (non-blocking)
            Thread.sleep(300);

            full.sendKeys(Keys.ENTER);
            logger.info("Full name entered successfully.");
        } catch (Exception e) {
            logger.error("Failed to enter full name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "enter_Your_FullName");
        }
    }


    public void enter_main_learning_goal(String goal) {
        logger.info("Entering main learning goal: " + goal);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);
            By lgoal = By.xpath("//input[@placeholder='Type your answer and press enter']");

           WebElement mainlgoal = waitHelper.waitForVisibility(lgoal, 10);


            mainlgoal.sendKeys(goal);
            mainlgoal.sendKeys(Keys.ENTER);
            logger.info("Learning goal entered successfully.");
        } catch (Exception e) {
            logger.error("Failed to enter learning goal: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "enter_main_learning_goal");
        }
    }

    public void select_Gender() {
        logger.info("Selecting gender.");
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By genderDropdown = By.xpath("//div[@class='css-19bb58m']");
            WebElement gen = waitHelper.waitForClickable(genderDropdown, 10);
            gen.click();

            By maleOption = By.xpath("//div[@id='react-select-2-listbox']/div[2]");
            WebElement male = waitHelper.waitForClickable(maleOption, 10);
            male.click();

            logger.info("Gender selected successfully.");
        } catch (Exception e) {
            logger.error("Failed to select gender: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_Gender");
        }
    }



    public void enter_Mother_Name(String motherName) {
        logger.info("Entering mother's name: " + motherName);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By motherNameField = By.xpath("//input[@placeholder='Type your answer and press enter']");
            WebElement Mname = waitHelper.waitForVisibility(motherNameField, 10);

            Mname.sendKeys(motherName);
            Mname.sendKeys(Keys.ENTER);
            logger.info("Mother's name entered successfully.");
        } catch (Exception e) {
            logger.error("Failed to enter mother's name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "enter_Mother_Name");
        }
    }


    public void enter_Father_Name(String fatherName) {
        logger.info("Entering father's name: " + fatherName);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By fatherNameField = By.xpath("//input[@placeholder='Type your answer and press enter']");
            WebElement Fname = waitHelper.waitForVisibility(fatherNameField, 10);

            Fname.sendKeys(fatherName);
            Fname.sendKeys(Keys.ENTER);
            logger.info("Father's name entered successfully.");
        } catch (Exception e) {
            logger.error("Failed to enter father's name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "enter_Father_Name");
        }
    }


    public void enter_Quardian_Name(String quardianName) {
        logger.info("Entering guardian's name: " + quardianName);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By guardianNameField = By.xpath("//input[@placeholder='Type your answer and press enter']");
            WebElement Qname = waitHelper.waitForVisibility(guardianNameField, 10);

            Qname.sendKeys(quardianName);
            Qname.sendKeys(Keys.ENTER);
            logger.info("Guardian's name entered successfully.");
        } catch (Exception e) {
            logger.error("Failed to enter guardian's name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "enter_Quardian_Name");
        }
    }


    public void Upload_Profile_Picture(String path) {
        logger.info("Uploading profile picture from path: " + path);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By uploadInput = By.xpath("//input[@type='file']");
            WebElement uploadElement = waitHelper.waitForPresence(uploadInput, 10);

            uploadElement.sendKeys(path);
            logger.info("Profile picture uploaded successfully.");
        } catch (Exception e) {
            logger.error("Failed to upload profile picture: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "Upload_Profile_Picture");
        }
    }

    public void select_School_type() {
        logger.info("Selecting school type.");
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By schoolDropdown = By.className("css-hlgwow");
            WebElement dropdown = waitHelper.waitForClickable(schoolDropdown, 10);
            dropdown.click();

            By schoolOption = By.id("react-select-3-option-0");
            WebElement option = waitHelper.waitForClickable(schoolOption, 10);
            option.click();

            logger.info("School type selected successfully.");
        } catch (Exception e) {
            logger.error("Failed to select school type: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_School_type");
        }
    }


    public void select_Collage_type() {
        logger.info("Selecting college type started.");
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By collegeDropdown = By.className("css-hlgwow");
            WebElement dropdown = waitHelper.waitForClickable(collegeDropdown, 10);
            dropdown.click();
            logger.debug("Clicked on college type dropdown.");

            By collegeOption = By.xpath("//div[text()='College']");
            WebElement option = waitHelper.waitForClickable(collegeOption, 10);
            option.click();

            logger.info("College type selected successfully.");
        } catch (Exception e) {
            logger.error("Failed to select college type: " + e.getMessage(), e);
            throw new RuntimeException("Unable to select college type", e);
        }
    }


    public void please_Select_your_University(String University) {
        logger.info("University selection method execution started");

        try {
            driver.findElement(By.className("css-19bb58m")).click();
            logger.info("Clicked on university dropdown.");

            List<WebElement> uni = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
            logger.debug("Number of universities listed: " + uni.size());

            boolean isUniversityFound = false;

            for (WebElement univer_sity : uni) {
                String u = univer_sity.getText();
                logger.debug("Checking university option: " + u);

                if (u.equalsIgnoreCase(University)) {
                    univer_sity.click();
                    logger.info("Selected university: " + University);
                    isUniversityFound = true;
                    break;
                }
            }

            if (!isUniversityFound) {
                logger.warn("University not found: " + University);
            }

        } catch (Exception e) {
            logger.error("Error occurred while selecting university: " + e.getMessage(), e);
            throw new RuntimeException("University selection failed", e);
        }
    }

    public void please_Select_your_Institution(String institution) {
        logger.info("Institution method execution started.");

        try {
            driver.findElement(By.className("css-19bb58m")).click();
            logger.info("Clicked on institution dropdown.");

            List<WebElement> ins = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
            logger.debug("Total institutions found: " + ins.size());

            boolean found = false;

            for (WebElement instit_ution : ins) {
                String u = instit_ution.getText();
                logger.debug("Checking institution: " + u);

                if (u.equalsIgnoreCase(institution)) {
                    instit_ution.click();
                    logger.info("Institution selected: " + institution);
                    found = true;
                    break;
                }
            }

            if (!found) {
                logger.warn("Institution not found: " + institution);
            }

        } catch (Exception e) {
            logger.error("Error while selecting institution: " + e.getMessage(), e);
            throw new RuntimeException("Institution selection failed", e);
        }
    }


    public void please_select_your_Course(String course) {
        logger.info("Course selection method started.");

        try {
            driver.findElement(By.className("css-19bb58m")).click();
            logger.info("Clicked on course dropdown.");

            List<WebElement> cou = driver.findElements(By.xpath("//div[@class='css-qr46ko']//div"));
            logger.debug("Total courses listed: " + cou.size());

            boolean found = false;

            for (WebElement cou_ution : cou) {
                String u = cou_ution.getText();
                logger.debug("Checking course: " + u);

                if (u.equalsIgnoreCase(course)) {
                    cou_ution.click();
                    logger.info("Course selected: " + course);
                    found = true;
                    break;
                }
            }

            if (!found) {
                logger.warn("Course not found: " + course);
            }

        } catch (Exception e) {
            logger.error("Error while selecting course: " + e.getMessage(), e);
            throw new RuntimeException("Course selection failed", e);
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

    public void please_select_your_learningStyle() {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionLocator = By.xpath("//div[text()='Offline']");
            WebElement cbseElement = waitHelper.waitForVisibility(optionLocator, 10);
            cbseElement.click();

        } catch (Exception e) {
            logger.error("Failed to select learning style: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "please_select_your_learningStyle");
        }
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

    public void user_select_schoolName(String schoolNAme) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10); // Wait until options are visible

            List<WebElement> school = driver.findElements(optionsLocator);
            for (WebElement schoolElement : school) {
                if (schoolElement.getText().equalsIgnoreCase(schoolNAme)) {
                    schoolElement.click();
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("Failed to select school name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "user_select_schoolName");
        }
    }


    public void user_select_teacherName(String teacherName) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10);

            List<WebElement> teacher = driver.findElements(optionsLocator);
            for (WebElement teacherElement : teacher) {
                if (teacherElement.getText().equalsIgnoreCase(teacherName)) {
                    teacherElement.click();
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("Failed to select teacher name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "user_select_teacherName");
        }
    }


    public void select_your_board() {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionLocator = By.id("react-select-3-option-0");
            WebElement cbseElement = waitHelper.waitForVisibility(optionLocator, 10);
            cbseElement.click();

        } catch (Exception e) {
            logger.error("Failed to select board: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_your_board");
        }
    }


    public void select_your_class()
    {//Select class 1 to 12
        WebElement clickDropDown=driver.findElement(By.className("css-19bb58m"));
        clickDropDown.click();
        driver.findElement(By.id("react-select-3-option-10")).click();
    }

    public void select_your_classes(String clas) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10);  // Wait for options to be visible

            List<WebElement> cbseClass = driver.findElements(optionsLocator);
            for (WebElement cb : cbseClass) {
                if (cb.getText().equalsIgnoreCase(clas)) {
                    cb.click();
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("Failed to select class: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_your_classes");
        }
    }


    public void choose_your_hobbies(String hobbie) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement choosinessHobbies = waitHelper.waitForClickable(dropdownLocator, 10);
            choosinessHobbies.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10);

            List<WebElement> hobbies = driver.findElements(optionsLocator);
            for (WebElement hb : hobbies) {
                String hob = hb.getText();
                if (hob.equalsIgnoreCase(hobbie)) {
                    hb.click();
                    break;
                }
            }
            System.out.println("Hobbie clicked");
        } catch (StaleElementReferenceException a) {
            System.out.println("Exception Handled");
        } catch (Exception e) {
            logger.error("Failed to choose hobby: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "choose_your_hobbies");
        }
    }

    public void select_known_language(String language) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By dropdownLocator = By.className("css-19bb58m");
            WebElement chooseLang = waitHelper.waitForClickable(dropdownLocator, 10);
            chooseLang.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10);

            List<WebElement> lang = driver.findElements(optionsLocator);
            for (WebElement hb : lang) {
                String hob = hb.getText();
                if (hob.equalsIgnoreCase(language)) {
                    hb.click();
                    break;
                }
            }
            System.out.println("language clicked");
        } catch (Exception e) {
            logger.error("Failed to select known language: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_known_language");
        }
    }

    public void select_proficiency() {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By proficiencyDropdown = By.className("css-19bb58m");
            WebElement chooseProficiency = waitHelper.waitForClickable(proficiencyDropdown, 10);
            chooseProficiency.click();

            By proficiencyOption = By.xpath("//div[@class='css-d7l1ni-option']");
            WebElement option = waitHelper.waitForClickable(proficiencyOption, 10);
            option.click();

        } catch (Exception e) {
            logger.error("Failed to select proficiency: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_proficiency");
        }
    }


    public void select_your_mobile_number_country_code() {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);

            By flagDropdown = By.className("selected-flag");
            WebElement flagElement = waitHelper.waitForClickable(flagDropdown, 10);
            flagElement.click();

            By indiaOption = By.xpath("//li[@data-flag-key='flag_no_0']");
            WebElement indiaElement = waitHelper.waitForClickable(indiaOption, 10);
            indiaElement.click();

        } catch (Exception e) {
            logger.error("Failed to select mobile number country code: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "select_your_mobile_number_country_code");
        }
    }


    public void What_is_your_mobile_number(String phnNo) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);
            By mobileLocator = By.className("form-control");
            WebElement mobileNO = waitHelper.waitForVisibility(mobileLocator, 10);
            mobileNO.sendKeys(phnNo);
            mobileNO.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            logger.error("Failed to enter mobile number: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "What_is_your_mobile_number");
        }
    }


    public void What_is_your_WhatsApp_number(String wtzpNo) {
        try {
            WaitHelper waitHelper = new WaitHelper(driver);
            By whatsappLocator = By.className("form-control");
            WebElement watzup = waitHelper.waitForVisibility(whatsappLocator, 10);
            watzup.sendKeys(wtzpNo);
            watzup.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            logger.error("Failed to enter WhatsApp number: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "What_is_your_WhatsApp_number");
        }
    }


    public void Select_your_subject_name(String subjectPreference) throws InterruptedException {


        Thread.sleep(2000);
        try {
            WaitHelper waitHelper = new WaitHelper(driver);
            By dropdownLocator = By.className("css-19bb58m");
            WebElement dropdown = waitHelper.waitForClickable(dropdownLocator, 10);
            dropdown.click();

            By optionsLocator = By.xpath("//div[@role='option']");
            waitHelper.waitForVisibility(optionsLocator, 10); // wait for options visible

            List<WebElement> subPreference = driver.findElements(optionsLocator);
            for (WebElement subPreElement : subPreference) {
                String sub = subPreElement.getText();
                System.out.println(sub);
                if (sub.equalsIgnoreCase(subjectPreference)) {
                    subPreElement.click();
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("Failed to select subject name: " + e.getMessage(), e);
            Screenshot.captureScreenshot(driver, "Select_your_subject_name");
        }
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