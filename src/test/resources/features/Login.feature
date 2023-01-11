Feature: User want to login to the page

  @login001
  Scenario: User login using valid credential
    Given User go to login page
    And User input username "standard_user"
    And User input password "secret_sauce"
    And User click login button
    Then User verify the product page

  @login002
  Scenario: User login using invalid credential
    Given User go to login page
    And User input username "<username>"
    And User input password "<password>"
    And User click login button
    Then User verify the error massage "<message>"
    Examples:
    | username        | password            | message                                                                   |
    |                 |                     | Epic sadface: Username is required                                        |
    | standard_user   |                     | Epic sadface: Username is required                                        |
    |                 | secret_sauce        | Epic sadface: Username is required                                        |
    | invalidusername | invalidpassword     | Epic sadface: Username and password do not match any user in this service |
       





# mvn test -Dbrowser="chrome"
# mvn test -Dcucumber.filter.tags="@login001" -Dbrowser="firefox"
