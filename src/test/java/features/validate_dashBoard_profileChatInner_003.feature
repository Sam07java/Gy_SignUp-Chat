Feature: Validating Profile Chat Inner Boc

  Scenario: Register student User in Gyansetu
    Given Navigate Registration Page
   When User Enter Email "sameer17@gmail.com" and Password "Same@2323"
   Then Click SignUp Button

 Scenario: Validating Profile Chat Inner Box after Login Successfully.
    Given Enter Student Valid Credential on SigIn Page Email "sameer17@gmail.com" and Password "Same@2323"
    When Click SignIn Button
    And Enter User detail on Dashboard Inner ChatBox
    Then Validate whether Inner ChatBox is Completed

   Scenario: Validate profile details with given input of Inner ChatBox
     Given Enter Student Valid Credential on SigIn Page Email "sameer17@gmail.com" and Password "Same@2323"
      When Click SignIn Button
      And Check the Student Profile detail is displayed
      When Validate the basic information is entered correct
      And Validate the Address is entered correct
      And Validate Hobbies and Language is entered correct
      And Validate Academic History is entered correct
      And Validate Contact Details is entered correct
      And Validate Subject Preference is entered correct
      Then Check the validation