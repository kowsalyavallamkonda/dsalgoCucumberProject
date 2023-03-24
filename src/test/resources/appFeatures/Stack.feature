Feature: Stack page validation dsalgo

  Background: 
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage

  Scenario: User is clicks on Stack page
    Given The user is on Home page after logged in
    When The user clicks on Stack getstarted button
    Then The user redirected to page with title "Stack"

  Scenario: User clicks on Operations in stack
    Given User is on Stack Page
    When User clicks on Operations in Stack
    Then It should navigate to corresponding page with title "Operations in Stack"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Operations in Stack" |
    And click on run button
    Then The output has to be displayed
    
     Scenario: User clicks on Operations in Stack and enters wrong python code
    Given User is on Stack Page
    When User clicks on Operations in Stack
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Implementation in Stack
    Given User is on Stack Page
    When The  user clicks on Implementation
    Then It should navigate to corresponding page with title "Implementation"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation" |
    And click on run button
    Then The output has to be displayed
    
     Scenario: User clicks on Implementation and enters wrong python code
    Given User is on Stack Page
    When The  user clicks on Implementation
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Applications in Stack
    Given User is on Stack Page
    When User clicks on Applications
    Then It should navigate to corresponding page with title "Applications"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Applications" |
    And click on run button
    Then The output has to be displayed

  Scenario: User clicks on Applications  and enters wrong python code
    Given User is on Stack Page
    When User clicks on Applications
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
