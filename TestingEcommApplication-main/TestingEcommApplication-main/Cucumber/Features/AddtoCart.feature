Feature: Add to Cart Page Test
@sanity
Scenario: Ecommerce website, test if user is able to validate Add to Cart page or not
Given User is on Chrome Browser and is able to access ecommerce webpage
Given User click on Add to Cart button
Then Check if checkout button is clickable or not
Then Check if checkout page is displayed or not
And Enter the values to fill up the billing address
And Click on Place order button
Then User Closed the Chrome Browswer