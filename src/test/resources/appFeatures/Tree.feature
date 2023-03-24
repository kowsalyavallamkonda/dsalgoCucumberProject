Feature: Arrays Validation Page

  Background: 
    Given User is on SignIn page
    When User enters username as " Kowsalya25" and password as "Saibaba25@"
    And User clicks on login button
    Then The user redirected to homepage
    
    Scenario: User clicks on Tree page
    Given The user is on Home page after logged in
    When The user clicks on Tree getstarted button
    Then The user redirected to page with title "Tree"
    
    Scenario: User clicks on Overview of Trees
    Given User is on Tree Page
    When user clicks on Overview of Trees
    Then It should navigate to corresponding page with title "Overview of Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Overview of Tress" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Overview of Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
   Scenario: User clicks on Types of Trees
    Given User is on Tree Page
    When user clicks on Types of Trees
    Then It should navigate to corresponding page with title "Types of Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Tree Traversals" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Types of Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    Scenario: User clicks on Tree Traversals
    Given User is on Tree Page
    When user clicks on Tree Traversals
    Then It should navigate to corresponding page with title "Tree Traversals"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Ds Algo" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Tree Traversals with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    
    Scenario: User clicks on Traversals-Illustration
    Given User is on Tree Page
    When user clicks on Traversals-Illustration
    Then It should navigate to corresponding page with title "Traversals-Illustration"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam fromTraversals-Illustration" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Traversals Illustration with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    Scenario: User clicks on Binary Trees
    Given User is on Tree Page
    When user clicks on Binary Trees
    Then It should navigate to corresponding page with title "Binary Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Binary Trees" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Binary Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    Scenario: User clicks on Types of Binary Trees
    Given User is on Tree Page
    When user clicks on Types of Binary Trees
    Then It should navigate to corresponding page with title "Types of Binary Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Types of Binary Trees" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Types of Binary Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    Scenario: User clicks on  Implementation in Python
    Given User is on Tree Page
    When user clicks on Implementation in Python
    Then It should navigate to corresponding page with title "Implementation in Python"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Implementation in Python" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Implementation with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
     Scenario: User clicks on Binary Tree Traversals
    Given User is on Tree Page
    When user clicks on Binary Tree Traversals
    Then It should navigate to corresponding page with title "Binary Tree Traversals"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Iam from Binary Tree Traversals" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Binary Tree Traversals with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
    
     Scenario: User clicks on Implementation of Binary Trees
    Given User is on Tree Page
    When user clicks on Implementation of Binary Trees
    Then It should navigate to corresponding page with title "Implementation of Binary Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Implementation of Binary Trees" |
    And click on run button
    Then The output has to be displayed
         
    Scenario: User clicks on Implementation of Binary Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed     
    
     Scenario: User clicks on Applications of Binary trees
    Given User is on Tree Page
    When user clicks on Applications of Binary trees
    Then It should navigate to corresponding page with title "Applications of Binary trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Hi Applications of Binary trees" |
    And click on run button
    Then The output has to be displayed
    
    Scenario: User clicks on Application of Binary trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
     Scenario: User clicks on Binary Search Trees
    Given User is on Tree Page
    When user clicks on Binary Search Trees
    Then It should navigate to corresponding page with title "Binary Search Trees"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print "Binary Search Trees" |
    And click on run button
    Then The output has to be displayed     
    
    Scenario: User clicks on Binary Search Trees with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed
    
     Scenario: User clicks on Implementation Of BST
    Given User is on Tree Page
    When user clicks on Implementation Of BST
    Then It should navigate to corresponding page with title "Implementation Of BST"
      When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print " Hi Im from Implementation Of BST" |
    And click on run button
    Then The output has to be displayed 
    
  Scenario: User clicks on Implementation of BST with wrong python code
    Given User is on Tree Page
    When user clicks on Overview of Trees
     When user click on Try here button
    When user enters the wrong Python code
    And click on run button
    Then The alert message has to be displayed