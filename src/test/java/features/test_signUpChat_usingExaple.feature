Feature:Automate signUp chat using Example keyWord.

  Scenario Outline: Register student User in Gyansetu
    Given Navigate Registration Page
    When User Enter Email "<username>" and Password "<password>"
    Then Click SignUp Button

    Examples:
      | username           | password  |
      | sameer33@gmail.com | Same@2323 |
      | sameer34@gmail.com | Same@2323 |

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
    And User Select Board
    And User Select Class "<Clas>"
    And User Choose Hobbies "Swimming"
    And User Select Known Language "Hindi"
    And User Select Language Proficiency
    And User Select mobile number Country code
    And User Enter Mobile Number "<MobileNo>"
    And User Enter WhatsAll Number "9867676777"
    And User Select Your Subject Name "English"
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
      | username           | password  | FullName        | MotherName | FatherName | MobileNo   | InstituteType | Clas     |
      | sameer33@gmail.com | Same@2323 | Sharu A         | Sugu       | Ajay       | 9897454566 | School        | class_09 |
      | sameer34@gmail.com | Same@2323 | Aravind Kirthan | Kirthi     | Thambi     | 9898988888 | School        | class_06 |


