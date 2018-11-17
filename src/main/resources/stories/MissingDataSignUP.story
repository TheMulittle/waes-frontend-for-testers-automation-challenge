Meta:

Narrative:
As an user
I want to now when there are missing information while registring
So that I can correct than and proceed


Scenario: User cannot register with missing data
Given I navigate to the Sign Up page
When fill the Sign Up page with following information:
|userName  |password  |name    |email   |day  |month  |year  |
|<userName>|<password>|<name>  |<email> |<day>|<month>|<year>|
And I try to Sign Up
Then I should see the New Profile page

Examples:
|<userName>|<password>|<name>|<email>    |<day>|<month>|<year>|
|          |1234567   |Joe   |joe@joe.com|21   |01     |1984  |
|joel      |          |Joe   |joe@joe.com|21   |01     |1984  |
|joel      |1234567   |      |joe@joe.com|21   |01     |1984  |
|joel      |1234567   |Joe   |           |21   |01     |1984  |
|joel      |1234567   |Joe   |joe@joe.com|     |01     |1984  |
|joel      |1234567   |Joe   |joe@joe.com|21   |       |1984  |
|joel      |1234567   |Joe   |joe@joe.com|21   |01     |      |

Scenario: User cannot have date of birth in the future
Given a system state
When I do something
Then system is in a different state

Scenario: User cannot register an invalid email
Given a system state
When I do something
Then system is in a different state
