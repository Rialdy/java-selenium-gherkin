Feature: User want to purchase product

  Background: User Login to the system
    Given User go to login page
    And User input username "standard_user"
    And User input password "secret_sauce"
    And User click login button
    Then User verify the product page

  @purchase001
  Scenario: User login to the page
    And User add backpack to cart "Sauce Labs Backpack"
    And User add shirt to cart "Sauce Labs Bolt T-Shirt"
    And User click cart icon
    Then User verify Your Cart Text



# mvn test -Dbrowser="chrome"
# mvn test -Dcucumber.filter.tags="@purchase001" -Dbrowser="firefox"

