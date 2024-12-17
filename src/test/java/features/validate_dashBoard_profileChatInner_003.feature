Feature: Validating Profile Chat Inner Boc

  Scenario: Register student User in Gyansetu
    Given Navigate Registration Page
    When User Enter Email "same.123@gmail.com" and Password "Same@1213"
    Then Click SignUp Button

  Scenario: Validating Profile Chat Inner Box after Login Successfully.
    Given Enter Student Valid Credential on SigIn Page Email "same.123@gmail.com" and Password "Same@1234"
    When Click SignIn Button
    And Enter User detail on Dashboard Inner ChatBox
    Then Validate whether Inner ChatBox is Completed