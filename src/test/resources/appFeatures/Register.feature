Feature: To verify and validate  User  Register Form

 Scenario: To verify Register Form with Empty fields
    Given The user opens Register Page
    When User click Register with all empty field
    Then User verify the message at username on Register Page as "Please fill out this field."

Scenario: To verify Register Form with username only
Given The user opens Register Page
    When User click Register with username as "numpyninja" only
    Then User verify the message at password on Register Page as "Please fill out this field."

  Scenario: To verify Register Form with username and password only
    Given The user opens Register Page
    When User click Register with username as "numpyninja91" and password as "ninjanumpy91" only
    Then User verify the message at confirmpassword on Register Page as "Please fill out this field."

  Scenario Outline: To verify Register Form with invalid credentials
    Given The user opens Register Page
    When User enter "<username>" ,"<password>" and "<confirmpass>"
    Then User click Register and verify the "<message>"

    Examples: 
      | username  | password | confirmpass | message                                                 |
      | ninja84$3 | numpy    | numpy       | password_mismatch:The two password fields didn’t match. |
      | ninja     | selenium | automation  | password_mismatch:The two password fields didn’t match. |
      | ninja     |  3456767 |   123456789 | password_mismatch:The two password fields didn’t match. |
      | numpy     | ninja5   | ninja5      | password_mismatch:The two password fields didn’t match. |

  Scenario Outline: to register with all the data
    Given The user opens Register Page
    When user enter the sheetname "<sheetname>" and row number <rownum>
    Then user click on Register button and verify message as "password_mismatch:The two password fields didn’t match."

    Examples: 
      | sheetname | rownum |
      | Register  |      0 |
      | Register  |      1 |
      | Register  |      2 |
      | Register  |      3 |
