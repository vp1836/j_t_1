package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.TestBase;

public class StepsDefinition extends TestBase {
    @Before
    public void initialization() {
        setUp();
    }

    @After
    public void theEnd() {
        tearDown();
    }

    @Given("I go to Main Page")
    public void iGoToMainPage() {
        homePage.goTo();
    }

    @When("I enter credentials login {string} with password {string}")
    public void iEnterCredentialsLoginWithPassword(String username, String password) {
        homePage.enterCredentials(username, password);
    }

    @And("I click login")
    public void iClickLogin() {
        homePage.clickLogin();
    }

    @Then("I should see Products page")
    public void iShouldSeeProductsPage() {
        productsPage.isOnProductPage();
    }
}
