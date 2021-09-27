package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage isOnProductPage() {
        checkIfTextEquals(By.xpath("//span[contains(text(),'Products')]"), "PRODUCTS");
        return this;
    }
}
