package test;

import org.junit.jupiter.api.Test;

public class AddAllToCartTest extends TestBase {

    @Test
    public void addAttToCartTest() {
        productsPage
                .goToProductPage()
                .addAllProductsToCart();
    }
}
