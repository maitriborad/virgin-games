Feature: Top Menu Test
  As a user I want to test TopMenu

  Background:
    Given User is on homepage
    When I accept cookies

  Scenario: User can see all options in Top menu of Homepage
    Then User can see all option on TopMenuBar
    |    options   |
    | Online Slots |
    | Live Casino  |
    |    Casino    |
    |   Slingo     |
    | Online Bingo |
    | Free Games   |
    |    Poker     |
    |  All Games   |

  Scenario: User can navigate to Online slots page
    And I click on Online Slots
    Then Verify that User navigated successfully with "Play Online Slots at Virgin Games"

  Scenario: User can navigate to Live Casino page
    And I click on Live Casino
    Then Verify that User navigated successfully with "Try Live Casino - Live Action"

  Scenario: User can navigate to Casino page
    And I click on Casino
    Then Verify that User navigated successfully with "Play Online Casino Games, with Many Classics"