Meta:

Narrative:
As a student
I want to open courses I'm interested in
So that I can found coach name at corresponding page and submit application as expected

Scenario: looking for 'Автоматизация тестирования ПО'
Given user can open courses 'Автоматизация тестирования ПО'
When page opened 'Test Automation (Автоматизация тестирования ПО)'
And exepected coach 'Артем Карпов'
Then its possible to submit application for his course
And fields at pop up shown as expected