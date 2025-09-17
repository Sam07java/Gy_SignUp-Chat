Feature: Register New Institute User
  Scenario Outline: Create institute from registration form and fetch input from Excel
    Given Navigate to SignIn Page.
    When Navigate Registration Page
    When Click on Register as Institute Button
    When Fetch input from excel sheet "<SheetName>"  <RowNumber> enter the details on each page.
    When Validate whether Document and Logo is uploaded or not
    When Click on submit button
    Then Validate whether registration is successfully or not.
    Examples:
      | SheetName             | RowNumber |
      | Register as Institute | 5         |
