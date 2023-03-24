Feature: Arrays Validation Page

Background:: User clicks onSignIn
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage

Scenario: User clicks on Arrays page
    Given The user is on Home page after logged in
    When The user clicks on Array getstarted button
    Then The user redirected to page with title "Array"

Scenario: User clicks on Arrays in Python
    Given User is on Arrays Page
    When user clicks on Arraysin Python
    Then It should navigate to corresponding page with title "Arrays in Python"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Arrays in Python" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Arrays in Python and enters wrong python code
    Given User is on Arrays Page
    When user clicks on Arraysin Python
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed  
    
  Scenario: User clicks on Arrays Using List
    Given User is on Arrays Page
    When user clicks on Arrays Using List
    Then It should navigate to corresponding page with title "Arrays Using List"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Arrays Using List" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Arrays Using List and enters wrong python code
    Given User is on Arrays Page
    When user clicks on Arrays Using List
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed      

  Scenario: User clicks on Basic Operations in Lists
    Given User is on Arrays Page
    When user clicks on Basic Operation in Lists
    Then It should navigate to corresponding page with title "Basic Operations in Lists"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Basic Operations in Lists" |
    And click on run button
    Then The output has to be displayed
    
     Scenario: User clicks on Basic Operations in Lists and enters wrong python code
    Given User is on Arrays Page
    When user clicks on Basic Operation in Lists
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed      

  Scenario: User clicks on Applications of Array
    Given User is on Arrays Page
    When user clicks on Applications of arrays
    Then It should navigate to corresponding page with title "Applications of Array"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Applications of Array" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Applications of Array and enters wrong python code
    Given User is on Arrays Page
    When user clicks on Applications of arrays    
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  #Scenario: User clicks on Practice Questions
    #Given User is on Arrays Page
    #When user clicks on Practice Questions
    #Then It should navigate to corresponding page with title "Practice Questions"
    #When the user clicks on search the array"
    #Then It should navigate to corresponding page with title "Assessment"
    #When user clears the code in Texteditor
    #When user enter the Python code
      #| print "Hi Iam from Assessment" |
    #And click on run button
    #Then The output has to be displayed
    
  

    
 
    
       
    
