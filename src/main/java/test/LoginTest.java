package test;

import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase{

    @Test
    public void loginTest() {
        homePage
                .goTo()
                .enterCredentials("standard_user", "secret_sauce")
                .clickLogin();

        productsPage
                .isOnProductPage();
    }
}
