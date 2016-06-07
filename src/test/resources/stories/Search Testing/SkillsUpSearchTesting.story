Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
Given end user is on main page
When user starts searching for <name> in english
Then result page contain <titleResult> and <descriptionResult>
Examples:
|name|titleResult|descriptionResult|
|Alexander|Alexander Galkovskiy|«Diving into Java»|
|Tsariov|06109150|Alexander Tsariov|
Scenario: scenario description2
Given end user is on main page
When user starts searching for name 'Галковский'
Then result page should not contain name 'Галковский'
