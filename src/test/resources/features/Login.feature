Feature: User want to login to the page

  @login001
  Scenario: User Login to the system
    Given User go to login page
    And User input username "standard_user"
    And User input password "secret_sauce"
    And User click login button
    Then User verify the product page




# mvn test -Dbrowser="chrome"
# mvn test -Dcucumber.filter.tags="@login" -Dbrowser="firefox"
