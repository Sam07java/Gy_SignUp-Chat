Feature: Fetch signUp data from Excel Sheet for College User

  Scenario Outline: Register student User in Gyansetu.
    Given Navigate Registration Page
    When Fetch signup data from Excel sheet "<SheetName>", <RowNo>
    Then Click SignUp Button
    Examples:
      | SheetName                | RowNo |
      | CollegeUser_Registration | 1     |
#      | CollegeUser_Registration | 2     |
#      | CollegeUser_Registration | 3     |
#      | CollegeUser_Registration | 4     |
##      | CollegeUser_Registration | 5     |

  Scenario Outline: Enter the data on SignUp-Chat
    Given Navigate to SignIn Page.
    When Fetch data from Excel sheet for Sign In "<SheetNAme>", <RowNumber> and Enter credentials in SignIn.
    And Click SignIn Button
    And Fetch data from Excel sheet for SignUp-Chat "<SignUp-Chat>", <Number> and enter details on signup-chat for College user.
    Then Verified sign-up chat is completed.
    Examples:
      | SheetNAme                | RowNumber | SignUp-Chat                  | Number |
      | CollegeUser_Registration | 1         | Sign-Up chat_for_CollageUser | 1      |
#      | CollegeUser_Registration | 2         | Sign-Up chat_for_CollageUser | 2      |
#      | CollegeUser_Registration | 3         | Sign-Up chat_for_CollageUser | 3      |
#      | CollegeUser_Registration | 4         | Sign-Up chat_for_CollageUser | 4      |
#      | CollegeUser_Registration | 5         | Sign-Up chat_for_CollageUser | 5      |