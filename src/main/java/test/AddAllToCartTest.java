package test;

import org.junit.jupiter.api.Test;

public class AddAllToCartTest extends TestBase {

    @Test
    public void addAttToCartTest() {
        homePage
                .goTo()
                .enterCredentials("standard_user", "secret_sauce")
                .clickLogin();
        productsPage
                .addAllProductsToCart()
                .checkIfCartQuantityEquals("6");
    }
}
