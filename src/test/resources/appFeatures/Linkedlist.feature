Feature: LinkedLIst page validation dsalgo

  Background: 
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage

  Scenario: User clicks on Linked List from Dropdown List or Get Started button under LinkedList after opening the Ds Algo
    Given The user is on Home page after logged in
    When The user clicks on LinkedList getstarted button 
    Then The user redirected to Linkedlist page with title "Linked List"

  Scenario: User clicks on Intoduction link
    Given The user is on LinkedList page
    When The user clicks on Introduction
    Then It should navigate to corresponding page with title "Introduction"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from IntroductionLink" |
    And click on run button
    Then The output has to be displayed

Scenario: User clicks on Intoduction link and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Introduction
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Creating Linked List In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Creating Linked List
    Then It should navigate to corresponding page with title "Creating Linked LIst"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Creating Linked LIst" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Creating Linked List  and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Creating Linked List
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Types of Linked List In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Types of Linked List
    Then It should navigate to corresponding page with title "Types of Linked List"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Types of Linked List" |
    And click on run button
    Then The output has to be displayed
    
     Scenario: User clicks on Types of Linked List In LinkedList and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Types of Linked List
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Implement Linked List in PythonIn LinkedList
    Given The user is on LinkedList page
    When The user clicks on Implement Linked List in Python
    Then It should navigate to corresponding page with title "Implement Linked List in Python"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implement Linked List in Python" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Implement Linked List in PythonIn LinkedList and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Implement Linked List in Python
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Traversal In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Traversal
    Then It should navigate to corresponding page with title "Traversal"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Traversal" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Traversal In LinkedList and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Traversal
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Insertion In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Insertion
    Then It should navigate to corresponding page with title "Insertion"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Ds Algo" |
    And click on run button
    Then The output has to be displayed
    
    
  Scenario: User clicks on Insertion In LinkedList and enters wrong python code
    Given The user is on LinkedList page
    When The user clicks on Insertion
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed

  Scenario: User clicks on Deletion In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Insertion Deletion
    Then It should navigate to corresponding page with title "Deletion"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Ds Algo" |
    And click on run button
    Then The output has to be displayed

  
  Scenario: User clicks on Deletion In LinkedList User clicks on Deletion In LinkedList
    Given The user is on LinkedList page
    When The user clicks on Insertion Deletion
    Then It should navigate to corresponding page with title "Deletion"
    When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
