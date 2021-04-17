Feature: Login features
This feature includes sceanrio that would be validate the following feature
1) Login as Admin
2) Login as kogile
3) Login with Nagative data

Background: 
Given I am able to navigate onto the login page

#Scenario: Login as Admin
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And I click on the Login button
#Then I should see the user name as "Welcome Copy"

#Scenario: Login as kogile
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And I click on the Login button
#Then I should see the user name as "Welcome Copy"

@Login
Scenario Outline: Test Login with Different data
When I enter the username as "<username>"
And I enter the password as "<password>"
And I click on the Login button
Then I should see the user name as "<LoginName>"

Examples:
|username|password|LoginName|
|Admin   |admin123|Welcome Rishikesh|
|Admin   |admin123|Welcome Rishikesh|

@invalidlogin
Scenario: Login with Nagative data
When I enter the username as "nethra"
And I enter the password as "kogile"
And I click on the Login button
Then I should see the error message as "invalid user name"


