Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
Given end user is on main page
When our team page opened
Then user opens personal coach page from the list
And user should see coach name and course name
Examples:
|Артем Карпов|
|Александр Галковский|
|Михаил Чокан|
|Артем Карпов|
|Ева Корнеплянская|
|Илья|

Scenario: scenario description
Given end user is on main page
When our team page opened
Then user should see <coach> and <Coachspecialisation>
Examples:
|coach|Coachspecialisation|
|Артем Карпов|тренер|
|Александр Галковский|тренер|
|Марина Мельник|автор курсов, тренер|
|Анастасия Педоренко|тренер|
|Ольга Симчак|тренер|
|Михаил Чокан|руководитель учебного центра|
|Дарья Мельник|преподаватель английского|