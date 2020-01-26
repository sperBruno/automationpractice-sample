Feature:
  This feature is going to test Women Summer Dresses page

  Background:
    Given I navigate to Women Online Shop Page

  @CloseWomenShop
  Scenario: Validate that user is able to filter Women Summer Dresses
    Given I navigate to Summer Dresses page
    And I filter "L" size
    And I filter "yellow" color
    When I sort by "Price: Lowest first" dropdown
    Then I verify that "Printed Chiffon Dress" is displayed with a price of "$16.40"
    And I verify that "Printed Summer Dress" is displayed with a price of "$28.98"
    And I verify that listed items have ascendant ordering by price