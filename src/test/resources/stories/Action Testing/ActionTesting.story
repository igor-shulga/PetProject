Meta:

Narrative:
As a future student
I want to check price and group size of course Im interested in
So that I can plan my own costs

Scenario: find course, check its price and group size
Given end user is on main page
When I can select <course> from list of avaliable
Then course page header contains name of <course>
And price <price> and group <size> as expected
Examples:
|course|price|size|
|Эффективный лидер|250|12-16 человек|