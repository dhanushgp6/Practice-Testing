@demowebshop
Feature: Login feature

@set1
Scenario: Verify login is successful with valid login credentials
Given User is logged in
When User adds a product to cart
When User confirms the order

Then Order places successfully and My Account - Order contains the order number


#Then user adds a product to cart 
#Then cart contains the same product added to cart