Feature: Fetch signUp data from Excel Sheet

Scenario Outline: Register student User in Gyansetu.
Given Navigate Registration Page
  When Fetch signup data from Excel sheet "<SheetName>", <RowNo>
Then Click SignUp Button
  Examples:
    | SheetName    | RowNo |
    | Registration | 1     |
#    | Registration | 2     |
#    | Registration | 3     |

#  Scenario Outline: Student SignIn into Application
#  Given Navigate to SignIn Page.
#  When Fetch data from Excel sheet for Sign In "<SheetNAme>", <RowNumber> and Enter credentials in SignIn.
#  Then Click SignIn Button
#  Examples:
#    | SheetNAme    | RowNumber |
#    | Registration | 1         |

Scenario Outline: Enter the data on SignUp-Chat
  Given Navigate to SignIn Page.
  When Fetch data from Excel sheet for Sign In "<SheetNAme>", <RowNumber> and Enter credentials in SignIn.
  And Click SignIn Button
  And Fetch data from Excel sheet for SignUp-Chat "<SignUp-Chat>", <Number> and enter details on signup-chat.
  Then Verified sign-up chat is completed.
  Examples:
    | SheetNAme    | RowNumber | SignUp-Chat  | Number |
    | Registration | 1         | Sign-Up chat | 1      |
#    | Registration | 2         | Sign-Up chat | 2      |
#    | Registration | 3         | Sign-Up chat | 3      |


