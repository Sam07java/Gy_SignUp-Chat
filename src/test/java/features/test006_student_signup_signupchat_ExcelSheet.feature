Feature: Fetch signUp data from Excel Sheet
#
#Scenario Outline: Register student User in Gyansetu.
#Given Navigate Registration Page
#  When Fetch signup data from Excel sheet "<SheetName>", <RowNo>
#Then Click SignUp Button
#  Examples:
#    | SheetName               | RowNo |
#    | SchoolUser_Registration | 1     |
#    | SchoolUser_Registration | 2     |
#    | SchoolUser_Registration | 3     |
#    | SchoolUser_Registration | 4     |
#    | SchoolUser_Registration | 5     |
#    | SchoolUser_Registration | 6     |
#    | SchoolUser_Registration | 7     |
#    | SchoolUser_Registration | 8     |
#    | SchoolUser_Registration | 9     |
#    | SchoolUser_Registration | 10    |


  Scenario Outline: Enter the data on SignUp-Chat
  Given Navigate to SignIn Page.
  When Fetch data from Excel sheet for Sign In "<SheetNAme>", <RowNumber> and Enter credentials in SignIn.
  And Click SignIn Button
  And Fetch data from Excel sheet for SignUp-Chat "<SignUp-Chat>", <Number> and enter details on signup-chat.
  Then Verified sign-up chat is completed.
  Examples:
    | SheetNAme               | RowNumber | SignUp-Chat                  | Number |
#    | SchoolUser_Registration | 1         | Sign-Up chat_for_StudentUser | 1      |
#    | SchoolUser_Registration | 2         | Sign-Up chat_for_StudentUser | 2      |
#    | SchoolUser_Registration | 3         | Sign-Up chat_for_StudentUser | 3      |
#    | SchoolUser_Registration | 4         | Sign-Up chat_for_StudentUser | 4      |
    | SchoolUser_Registration | 5         | Sign-Up chat_for_StudentUser | 5      |
    | SchoolUser_Registration | 6         | Sign-Up chat_for_StudentUser | 6      |
    | SchoolUser_Registration | 7         | Sign-Up chat_for_StudentUser | 7      |
    | SchoolUser_Registration | 8         | Sign-Up chat_for_StudentUser | 8      |
    | SchoolUser_Registration | 9         | Sign-Up chat_for_StudentUser | 9      |
    | SchoolUser_Registration | 10        | Sign-Up chat_for_StudentUser | 10     |

