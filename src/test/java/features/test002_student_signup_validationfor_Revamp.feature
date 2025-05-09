Feature: Validate Student Registration page
  #Scenario:Check Whether Student Registration page is working properly as per given Credential.
   # Given Navigate Registration Page
   # When User Enter Email "sameer7860n@gmail.com" and Password "Same@1213"
   # Then Click SignUp Button
#

  Scenario Outline: Register student User in Gyansetu
    Given Navigate Registration Page
    When User Enter Email "<username>", Password "<password>", phoneNo "<phoneNo>"
    Then Click SignUp Button

    Examples:
      | username                    | password  | phoneNo    |
      | sameerschool07@yopmail.com  | Same@2323 | 9893483500 |
      | sameercollage07@yopmail.com | Same@2323 | 9893483501   |
