package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public final String URL = "https://www.saucedemo.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goTo() {
        driver.get(URL);
        return this;
    }

    public HomePage enterCredentials(String username, String password) {
        enterText(By.xpath("//input[@id='user-name']"), username);
        enterText(By.xpath("//input[@id='password']"), password);
        return this;
    }

    public ProductsPage clickLogin() {
        click(By.xpath("//input[@id='login-button']"));
        return new ProductsPage(driver);
    }

    public HomePage loginFailed(String errorMessage) {
        checkIfTextEquals(By.xpath("//h3[@data-test=\"error\"]"), errorMessage);
        return this;
    }
}
