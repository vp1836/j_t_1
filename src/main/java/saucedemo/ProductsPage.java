package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends PageBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage isOnProductPage() {
        checkIfTextEquals(By.xpath("//span[contains(text(),'Products')]"), "PRODUCTS");
        return this;
    }

    public ProductsPage addAllProductsToCart() {
        List<WebElement> addToCartButtons = driver.findElements(By.className("btn_inventory"));
        for (WebElement addButton : addToCartButtons) {
            addButton.click();
        }
        return this;
    }

    public void checkIfCartQuantityEquals(String quantity) {
        checkIfTextEquals(By.xpath("//span[@class=\"shopping_cart_badge\"]"), quantity);
    }
}
