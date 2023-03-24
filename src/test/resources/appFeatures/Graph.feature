Feature: Graph Validation Page

Background: 
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage
    
Scenario: User clicks on Graph getstarted button 
    Given The user is on Graph Page
    When The user clicks on Graphlink in graph page
    Then It should navigate to corresponding page with title "Graph"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Graph" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Graph getstart button and clicks graph and enters wrong python code
    Given The user is on Graph Page
    When The user clicks on Graphlink in graph page
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed    
    
 Scenario: User clicks on Graph getstarted button 
    Given The user is on Graph Page
    When The user clicks on Graph Representations in graph page
    Then It should navigate to corresponding page with title "Graph Representations"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Graph Representations" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Graph getstart button and clicks Graph Representations and enters wrong python code
    Given The user is on Graph Page
    When The user clicks on Graph Representations in graph page
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed     
    
    