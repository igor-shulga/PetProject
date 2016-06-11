Meta:

Narrative:
As a user
I want to test SkillsUp site search module work
So that I can be sure it works

Scenario: positive searching searhing possible by name or certificate ID
Given end user is on main page
When user starts searching for <name> in english
Then result page contain <titleResult> and <descriptionResult>
Examples:
|name|titleResult|descriptionResult|
|Alexander|Alexander Galkovskiy|«Diving into Java»|
|Tsariov|06109150|Alexander Tsariov|
Scenario: negative searhing: enter name in Russian, empty resultset is expected
Given end user is on main page
When user starts searching for name 'Галковский'
Then result page should not contain name 'Галковский'