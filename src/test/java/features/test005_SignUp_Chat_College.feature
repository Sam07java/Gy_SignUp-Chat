Feature:Automate signUp chat using Example keyWord-->User Student
  Scenario Outline: Register student User in Gyansetu
    Given Navigate Registration Page
    When User Enter Email "<username>" and Password "<password>"
    Then Click SignUp Button

    Examples:
      | username         | password  |
      | same20@gmail.com | Same@2323 |
      | same21@gmail.com  | Same@2323 |

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
    And User upload profile picture "C:\\Users\\WIIS\\Pictures\\one piece\\1471770.jpg"
    And User Select Institute Type "<InstituteType>"
#    And User Select Board
 #   And User Select Class "<Clas>"
    And User Select University "<University>"
    And User Select Institution "<Institution>"
    And User Select Course "<Course>"
    And User Select Semester "<Semester>"
    And User Select Learning Style "Offline"
    And User Select Year "<Year>"
    And User Choose Hobbies "Swimming"
    And User Select Known Language "English"
    And User Select Language Proficiency
    And User Select mobile number Country code
    And User Enter Mobile Number "<MobileNo>"
    And User Enter WhatsAll Number "9867676777"
 # xpath different in collage user-   And User Select Your Subject Name "English"
    # semester selection.
    And User select which your subject belongs "<Subject preference>"
    And User select semester
    And User Enter subject preference "Mathematics"
    And User add Score Percentage "76"
    And User Select Current Country of Residence "India"
    And User Select Current residence State "Kerala"
    And User Enter Current residence District Name "Alappuzha"
    And User Enter Current residence City Name "Cherthala"
    And User Enter PinCode Number "898988"
    And User Enter First Address "Manzil manzil"
    And User Enter Second Address "Valanjavazhi"
    Then Validate whether SignUp chat is Completed

    Examples:
      | username         | password  | FullName        | MotherName | FatherName | MobileNo   | InstituteType | Year | University                       | Institution                | Course                        | Semester   | Subject preference                       |
      | same20@gmail.com | Same@2323 | Sushama C       | Anjali M   | Abhijith S | 9897454566 | College       | 2022 | GJU(Guru Jambheshwar University) | GJU Science and Technology | BSc Geography                 | Semester 2 | Cartographic Techniques in Geography (T) |
      | same21@gmail.com | Same@2323 | Aravind Kirthan | Kirthi     | Thambi     | 9898988888 | College       | 2000 | KTU(Kerala Technical University) | MESITAM Chathnoor          | Electronics and Communication | Semester 3 | Basic Electronics                        |

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
    And Verify that the hobbies are selected correctly with "Swimming".
    And Verify that the language are selected corectly with "English".
    Then Click Next Button
    And Verify whether Academic History Page is displayed or not
    And Verify the Institute type is selected "<InstituteType>" by Input of SignUp chat.
    And Check the University is selected "<University>" by Input of SignUp chat.
    And Check the Institute Name is corrent by Input of SignUp Chat "<Institution Name>".
    And Check the Course is selected "<Course>" by input of signUp Chat.
    And Verify the Year is displayed "<Year>" as per the input of signup chat
    Then Click the Next Button of Academic History
    And Check if Contact Details Page is Displayed or not
    And Verify the mobile Number "<MobileNo>" with Input of SighUp Chat.
    And Verify the whatzapp Number "9867676777" with Input of SignUp Chat.
    And Check the Email dispayed Correct with sign in data "<username>".
    And Click the Next Button of Contact Deatil Page.
    And Check if Subject Preference Page is displayed or not.
    And Verify the Subject is selected "<Subject preference>" correct with signUp Chat.
    And Check the subject preference is entered "Mathematics" is correct with SignUp chat Input.
    And Validate the Score Percentage "76" with SignUp Chat Input
    And Check the semester is selected by input of signup chat"<Semester>"
    And Click Submit button of Subject Preference page.
    Then Validate Profile Edit page is entered Completed or not.

    Examples:
      | username         | password  | FirstName | SecondName | MotherName | FatherName | MobileNo   | InstituteType | Year | University                       | Institution Name           | Course                        | Semester   | Subject preference                       |  |
      | same20@gmail.com | Same@2323 | Sushama   | C          | Anjali M   | Abhijith S | 9897454566 | College       | 2022 | GJU(Guru Jambheshwar University) | GJU Science and Technology | BSc Geography                 | Semester 2 | Cartographic Techniques in Geography (T) |  |
      | same21@gmail.com | Same@2323 | Aravind   | Kirthan    | Kirthi     | Thambi     | 9898988888 | College       | 2000 | KTU(Kerala Technical University) | MESITAM Chathnoor          | Electronics and Communication | Semester 3 | Basic Electronics                        |  |