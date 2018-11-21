Meta:
@signUp
@negative

Narrative:
As an user
I want to now when there are missing information while registring
So that I can correct than and proceed


Scenario: User cannot register with missing data, future data or invalid email
Given I navigate to the Sign Up page
When fill the Sign Up page with following information:
|userName  |password  |name    |email   |day  |month  |year  |
|<userName>|<password>|<name>  |<email> |<day>|<month>|<year>|
And I try to Sign Up
Then I should see that I am still in the Sign Up page
Examples:
|<userName>|<password>|<name>|<email>    |<day>|<month>|<year>|
|          |1234567   |Joe   |joe@joe.com|21   |March  |1984  |
|joel      |          |Joe   |joe@joe.com|21   |March  |1984  |
|joel      |1234567   |      |joe@joe.com|21   |March  |1984  |
|joel      |1234567   |Joe   |           |21   |March  |1984  |
|joel      |1234567   |Joe   |joe@joe.com|     |March  |1984  |
|joel      |1234567   |Joe   |joe@joe.com|21   |March  |1984  |
|joel      |1234567   |Joe   |joe@joe.com|21   |March  |      |
|joel      |1234567   |Joe   |joe        |01   |March  |1984  |
|joel      |1234567   |Joe   |joe@joe.com|01   |March  |2050  |
