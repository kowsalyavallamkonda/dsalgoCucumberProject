Feature: Opening the dsalgo heroku app and clicking on

Scenario: Opening the DS Algo Portal
    Given The user opens homepage
    When The user gets title of the page
    Then The user should land in DS Algo portal page "NumpyNinja"

Scenario: Clicking on DataStructures GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under DatStrucures
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Array GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under Array
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on LinkedList GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under LinkedList
    Then It should alert the user with a message "You are not logged in"

 Scenario: Clicking on Stack GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under Stack
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Queue GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under Queue
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Tree GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under Tree
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Graph GetStarted button
    Given The user opens homepage
    When The user clicks GetStarted button under Graph
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Datastructure Dropdown
    Given The user opens homepage
    When The user clicks on Datastructure Dropdown
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on Arrays Dropdown
    Given The user opens homepage
    When The user clicks on Arrays Dropdown
    Then It should alert the user with a message "You are not logged in"

Scenario: Clicking on LinkedList Dropdown
    Given The user opens homepage
    When The user clicks on  LinkedList Dropdown
    Then It should alert the user with a message "You are not logged in"

  Scenario: Clicking on Stack Dropdown
    Given The user opens homepage
    When The user clicks on Stack Dropdown
    Then It should alert the user with a message "You are not logged in"

  Scenario: Clicking on Queue Dropdown
    Given The user opens homepage
    When The user clicks on Queue Dropdown
    Then It should alert the user with a message "You are not logged in"

  Scenario: Clicking on Tree Dropdown
    Given The user opens homepage
    When The user clicks on Tree Dropdown
    Then It should alert the user with a message "You are not logged in"

  Scenario: Clicking on Graph Dropdown
    Given The user opens homepage
    When The user clicks on Graph Dropdown
    Then It should alert the user with a message "You are not logged in"

  Scenario: Creating User Registration form
    Given The user opens homepage
    When The user clicks on Register button
    Then It should navigate to register form with title "Registration"

  Scenario: Clicking on SignInbutton
    Given The user opens homepage
    When The user clicks on SignIn button
    Then It should navigate to SignIn page  with title "Login"
