Feature: Arrays Validation Page

Background: User clicks on SignIn
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage
    
Scenario: User clicks on Implementation of Queue in Python in Queue 
    Given The user is on Queue Page
    When The user clicks on Implementation of Queue in Python
    Then It should navigate to corresponding page with title "Implementation of Queue in Python"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation of Queue in Python" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Implementation of Queue in Python in Queue and enters wrong python code
    Given The user is on Queue Page
    When The user clicks on Implementation of Queue in Python
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
Scenario: User clicks on Implementation using collections deque Queue in Python in Queue 
    Given The user is on Queue Page
    When The user clicks on Implementation using collections deque 
    Then It should navigate to corresponding page with title "Implementation using collections.deque"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation using collections.deque" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Implementation using collections.deque in Queue and enters wrong python code
  Given The user is on Queue Page
    When The user clicks on Implementation using collections deque 
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
Scenario: User clicks on Implementation using array in  Queue
   Given The user is on Queue Page
    When The user clicks on Implementation using array 
    Then It should navigate to corresponding page with title "Implementation using array"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation using array" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Implementation using array in Queue and enters wrong python code
    Given The user is on Queue Page
    When The user clicks on Implementation using array
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed  
    
    Scenario: User clicks on Queue Operations in  Queue
   Given The user is on Queue Page
    When The user clicks on Queue Operations
    Then It should navigate to corresponding page with title "Queue Operations"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation using array" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Queue Operations and enters wrong python code
    Given The user is on Queue Page
    When The user clicks on Queue Operations
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed     
     
    
    
    
    
    