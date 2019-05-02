Feature: TM Sandbox's homepage search function
  As a TM user
  I want to search for items
  So that I can find things to buy

  Acceptance Criteria
  -------------------
  1. The search returns relevant items
  2. The search doesn't return irrelevant items

  Scenario Outline: Searches return relevant items
    Given I am on TradeMe's home page
    When I search for "<item>"
    Then I see results related to "<item>"
    Examples:
      | item |
      | tea |
      | panda |
      | bicycle |