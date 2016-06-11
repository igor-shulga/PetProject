Meta:

Narrative:
As a potential student
I want to find coach and courses
So that I can select courses Im interested in

Scenario: check coaches and their courses
Given end user is on main page
When our team page opened
Then user opens personal coach with <searchName> page from the list
And user should see coach name <nameOnPage> and course name <courseName>
Examples:
|searchName|nameOnPage|courseName|
|Артем Карпов|Артем Карпов|Автоматизация тестирования ПО|
|Александр Галковский|Александр Галковский|Diving into Java|
|Михаил Чокан|Михаил Чокан|Руководитель учебного курса в компании SkillsUp|
|Ева Корнеплянская|Ева Корнеплянская|новым технологиям|
|Илья|Илья|Административная и операционная поддержка|
Scenario: check coaches and their specealsations
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