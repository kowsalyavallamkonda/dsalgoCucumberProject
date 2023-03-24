Feature: Data Structure page validation dsalgo

 Background: 
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage

 Scenario: User is clicks on datastructure page
    Given The user is on Home page after logged in
    When The user clicks on datastructure getstarted button
    Then The user redirected to page with title "Data Structures-Introduction"
    When User clicks on Time Complexity
    Then It should navigate to corresponding page with title "Time Complexity"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Time Complexity" |
    And click on run button
    Then The output has to be displayed

  
  Scenario: User is clicks on datastructure page and enters wrong Python code
    Given The user is on Home page after logged in
    When The user clicks on datastructure getstarted button
    Then The user redirected to page with title "Data Structures-Introduction"
    When User clicks on Time Complexity
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
