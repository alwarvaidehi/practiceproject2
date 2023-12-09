Feature: search box testing

  Scenario: search item in the search box  scenario
    Given user entering the item in the search box
    And User click on search button
    When User click on wishList
    And User enter the login email and password
    And user click on login button
    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
