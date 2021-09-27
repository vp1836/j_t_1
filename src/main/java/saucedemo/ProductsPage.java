package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage isOnProductPage() {
        getText(By.xpath("//span[contains(text(),'Products')]"));
        return this;
    }
}
