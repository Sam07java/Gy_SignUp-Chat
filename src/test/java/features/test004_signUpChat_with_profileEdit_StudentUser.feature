Feature:Automate signUp chat using Example keyWord-->User Student

  Scenario Outline: Register student User in Gyansetu
    Given Navigate Registration Page
    When User Enter Email "<username>", Password "<password>", phoneNo "<phoneNo>"
    Then Click SignUp Button
    Examples:
      | username                        | password  | phoneNo   |
      | varundavanmgmschool@yopmail.com | Same@2323 | 9893483420 |
#    | sameer005@yopmail.com | Same@2323 | 9893483484 |

  Scenario Outline: Enter Details Sign Up Chat.
    Given Enter Student Valid Credential on SigIn Page Email "<username>" and Password "<password>"
    When Click SignIn Button
    And User enter the Full Name "<FullName>"
    And User Select the Date of Birth Date= "17" Month= "July" Year= "2015"
    And User Enter Main learning Goal "To get Higher Mark"
    And User Select Gender
    And User Enter Your Mother Name "<MotherName>"
    And User Enter Your Father Name "<FatherName>"
    And User Enter Your Quardian Name "Sharafudeen SP"
    And User upload profile picture "C:\\Users\\WIIS\\Pictures\\one piece\\1471790.jpg"
    And User Select Institute Type "<InstituteType>"
    And User select School Name "<School Name>"
    And User Select Board
    And User Select Class "<Clas>"
    And User Choose Hobbies "Running"
    And User Select Known Language "Malayalam"
    And User Select Language Proficiency
    And User Select mobile number Country code
    And User Enter Mobile Number "<Whatzup>"
    And User Select Your Subject Name "Mathematics"
#    And User Enter subject preference "Science"
#    And User add Score Percentage "76"
    And User select teacher "<Teacher>"
    And User Select Current Country of Residence "India"
    And User Select Current residence State "Kerala"
    And User Enter Current residence District Name "Alappuzha"
    And User Enter Current residence City Name "Cherthala"
    And User Enter PinCode Number "898988"
    And User Enter First Address "Manzil manzil"
    And User Enter Second Address "Valanjavazhi"
    Then Validate whether SignUp chat is Completed

    Examples:
      | username                        | password  | FullName | MotherName | FatherName | Whatzup    | InstituteType | Clas     | School Name | Teacher |
      | varundavanmgmschool@yopmail.com | Same@2323 | Ummu K   | Ansiba     | Pappa      | 7934234441 | School        | class_09 | MGM School  | Shaji V |

  Scenario Outline: Validate profile details with given input of Sign Up Chat
    Given Enter Student Valid Credential on SigIn Page Email "<username>" and Password "<password>"
    When Click SignIn Button
    And Check the Student Profile detail is displayed
    And Validate whether First Name "<FirstName>" with given input of SignUp Chat
    And Validate Last Name "<SecondName>" with SignUp Chat Input.
    And Validate Date of Birth "17/07/2015" with SignUp Chat Input.
    And Validate Father Name "<FatherName>" with SignUp Chat Input.
    And Validate Mother Name "<MotherName>" with SignUp Chat Input.
    And Validate Quardian Name "Sharafudeen SP" with SignUp Chat Input.
    And Validate Gender with SignUp Chat Input.
    Then Click Submit Button
    And Validate whether the Address Page is Displayed
    And Check if Country Selected is correct with the input from the SignUP chat "India".
    And Check if State Selected is correct with the input from the SignUP chat "Kerala".
    And Check First Address with SignUp Input "Manzil manzil"
    And Check Second Address with SignUp Input "Valanjavazhi"
    And Check City Name with SignUp Input "Cherthala"
    And Check District Name with SignUp Input "Alappuzha"
    And Check PinCode with SignUp Input "898988"
    And Click the Same As Current Address.
    Then Click The Next Button.
    And Naviagte to Hobbies and Language Page.
    And Verify that the hobbies are selected correctly with "Running".
    And Verify that the language are selected corectly with "Malayalam".
    Then Click Next Button
    And Verify whether Academic History Page is displayed or not
    And Verify the Institute type is "<InstituteType>" or "Collage" by Input of SignUp chat.
    And Check the board is "CBSE" , "ICSE" and "State" by Input of SignUp chat.
    And Check the Class is selected by Input of SignUp Chat "<Clas>".
    Then Click the Next Button of Academic History
    And Check if Contact Details Page is Displayed or not
    And Verify the mobile Number "<MobileNo>" with Input of SighUp Chat.
    And Verify the whatzapp Number "7934234441" with Input of SignUp Chat.
    And Check the Email dispayed Correct with sign in data "<username>".
    And Click the Next Button of Contact Deatil Page.
    And Check if Subject Preference Page is displayed or not.
    And Verify the Subject is selected "Science" correct with signUp Chat.
    And Check the subject preference is entered "Mathematics" is correct with SignUp chat Input.
    And Validate the Score Percentage "76" with SignUp Chat Input
    And Click Submit button of Subject Preference page.
    Then Validate Profile Edit page is entered Completed or not.

    Examples:
      | username                        | password  | FirstName | SecondName | MotherName | FatherName | MobileNo   | InstituteType | Clas     |
      | varundavanmgmschool@yopmail.com | Same@2323 | Ummu      | K          | Ansiba     | Pappa      | 9893483418 | School        | class 09 |
