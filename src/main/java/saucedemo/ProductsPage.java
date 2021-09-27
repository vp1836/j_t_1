package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends PageBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage goToProductPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
        return this;
    }

    public ProductsPage isOnProductPage() {
        checkIfTextEquals(By.xpath("//span[contains(text(),'Products')]"), "PRODUCTS");
        return this;
    }

    public ProductsPage addAllProductsToCart() {
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()=\"Add to cart\"]"));
        System.out.println(addToCartButtons.size());
        return this;
    }
}
