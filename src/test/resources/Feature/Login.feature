Feature: To validate login funtionality in adactin

Background:
          Given User is on adactin page
@sanity
Scenario: To verify valid username and invalid password
When User enter the valid username and invalid password
|Vaiyapuri12|123654789|
Then User is click  on login invalid password
@restest @sanity
Scenario:  To verify invalid username and valid password
When User enter the invalid Username and  valid Password
|suganthi12|7708993200|
Then User is click  on login invalid username 
@regrestion
Scenario: To verify invalid username and invalid password
When User enter the invalid username and invalid password
|Vaiya|7708|
Then User is click  on login both invalid
@unit
Scenario: To verify both valid
When User enter the  valid Username and valid Password
|Vaiyapuri12|7708993200|
Then User is click  on login both valid
