Feature: Validating Profile Chat Inner Boc

  #Scenario: Register student User in Gyansetu
   # Given Navigate Registration Page
   # When User Enter Email "sameersnn@gmail.com" and Password "Same@1213"
   # Then Click SignUp Button

  Scenario: Validating Profile Chat Inner Box after Login Successfully.

    Given Enter Student Valid Credential on SigIn Page Email "sameersnn@gmail.com" and Password "Same@1213"
    When Click SignIn Button
    And Enter User detail on Dashboard Inner Box
    Then Enter phone no.