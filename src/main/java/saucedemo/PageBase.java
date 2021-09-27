package saucedemo;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.actions = new Actions(driver);
    }

    //Wait wrapper
    public void visibilityWait(By element) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    //Click element
    public void click(By element) {
        visibilityWait(element);
        driver.findElement(element).click();
    }

    //Send Keys
    public void enterText(By element, String text) {
        WebElement inputField = driver.findElement(element);
        inputField.clear();
        inputField.sendKeys(text);
    }

    //Mouse Over an Element Actions
    public void mouseOver(By element) {
        visibilityWait(element);
        WebElement webElement = driver.findElement(element);
        actions.moveToElement(webElement).click().perform();
    }

    //Upload a File
    public void uploadFile(By element, String path) {
        driver.findElement(element).sendKeys(path);
    }

    //Check if an Element is Displayed
    public void elementIsDisplayed(By element) {
        visibilityWait(element);
        Assertions.assertTrue(driver.findElement(element).isDisplayed());
    }

    //Get text
    public void checkIfTextEquals(By element, String expected) {
        visibilityWait(element);
        String text =driver.findElement(element).getText();
        Assertions.assertEquals(expected, text);
        System.out.println(text);
    }
}
