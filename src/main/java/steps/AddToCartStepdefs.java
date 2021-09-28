package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.TestBase;

public class AddToCartStepdefs extends TestBase {

    @Before
    public void initialization() {
        setUp();
    }

    @After
    public void theEnd() {
        tearDown();
    }

    @Given("I go to Main paige")
    public void iGoToMainPaige() {
        homePage.goTo();
    }

    @When("I enter credentials login {string} with password {string} and click login")
    public void iEnterCredentialsLoginWithPasswordAndClickLogin(String username, String password) {
        homePage
                .enterCredentials(username, password)
                .clickLogin();
    }

    @And("I click Add to cart on every product")
    public void iClickAddToCartOnEveryProduct() {
        productsPage.addAllProductsToCart();
    }

    @Then("I should see {string} products in the cart")
    public void iShouldSeeProductsInTheCart(String quantity) {
        productsPage.checkIfCartQuantityEquals(quantity);
    }
}
