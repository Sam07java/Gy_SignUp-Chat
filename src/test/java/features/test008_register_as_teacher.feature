Feature: Register as Teacher using Registration form

  Scenario Outline: Register the Teacher from Excel Sheet
    Given Navigate to SignIn Page.
    When Navigate Registration Page
    When Click on Register as Teacher Button
    When Fetch the data from excel sheet "<SheetName>"  <RowNumber> enter the deatils First Page
    Then Validate whether registration is successfully or not.
    Examples:
      | SheetName           | RowNumber |
      | Register as Teacher | 0         |
