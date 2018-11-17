Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: User is able to access the sign up page
Given I navigate to the Home page
When I click in the Sign Up link
Then I should see the Sign Up page

Scenario: User is able to register successfuly
When I type the following user name: joel
And I type the following password: 1234567
And I type the following name: Joe
And I type the following email: joe@joe.com
And I select the following day of birth: 21
And I select the following month of birth: 01
And I select the following year of birth: 1984
And I try to Sign Up
Then I should see the New Profile page

Scenario: User is not able to register twice
Given I logout from the system
When I type the following user name: joel
And I type the following password: 1234567
And I type the following name: Joe
And I type the following email: joe@joe.com
And I select the following day of birth: 21
And I select the following month of birth: 01
And I select the following year of birth: 1984
And I try to Sign Up
Then I should see the New Profile page

Scenario: User is able to login after registring
When I loging with user '' and ''
When I do something
Then system is in a different state