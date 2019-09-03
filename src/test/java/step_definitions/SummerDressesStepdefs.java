package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummerDressesStepdefs {

    @Given("^I navigate to Women Online Shop Page$")
    public void navigateToWomenShopPage() {
        System.out.println("Navigating to Women SHop page");
    }

    @Given("I navigate to Summer Dresses page")
    public void iNavigateToSummerDressesPage() {
        System.out.println("Navigate to SummerDresses PAge");
    }

    @And("^I filter \"([^\"]*)\" size$")
    public void iFilterSize(String size) {
        System.out.println("I filter " + size + " size");
    }

    @And("^I filter \"([^\"]*)\" color$")
    public void iFilterColor(String color) {
        System.out.println("I filter " + color + " color");
    }

    @When("^I sort by \"([^\"]*)\" dropdown$")
    public void iSortByDropdown(String option) {
        System.out.println("I sorted by " + option);
    }

    @Then("^I verify that \"([^\"]*)\" is displayed with a price of \\$(\\d+)\\.(\\d+)$")
    public void iVerifyThatIsDisplayedWithAPriceOf$(String dress, int price, int as) {
        System.out.println("Dress is displayed " + dress + " with price " + price);
    }

    @And("I verify that listed items have asscendant ordering by price")
    public void iVerifyThatListedItemsHaveAsscendantOrderingByPrice() {
        System.out.println("Validate that items list are in assendant order");
    }


}
