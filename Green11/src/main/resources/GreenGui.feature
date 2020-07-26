Feature: validate The GUI

Scenario: Validate Correct Nav Bar
Given User is on the URL
And  User should view and verify home page loaded and correct homepage page title
When User click the whatWeDo link
Then they should be able to view and verify the Whatwedo page
When user click the C19resources page
Then user should be able to view and verify the C19 page
When user click the insight page
Then user should be able to view and verify the insight page
When user click the News page
Then user should be able to view the News page
When user click the About page
Then user should be able to About the About page