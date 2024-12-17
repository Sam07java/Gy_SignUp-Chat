Feature: Validate Student Registration page
  Scenario:Check Whether Student Registration page is working properly as per given Credential.
    Given Navigate Registration Page
    When User Enter Email "sameer786n@gmail.com" and Password "Same@1213"
    Then Click SignUp Button