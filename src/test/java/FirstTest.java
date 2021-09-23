import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

    @Test
    public void OpenBrowser() {
        WebDriver driver;
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp183\\Desktop\\Code\\_JAVA\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

//        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        driver.get("https://www.google.com/");

//        driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]")).click();

        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.ENTER);

        String searchResult = driver.findElement(By.xpath("//h3[@class=\"LC20lb DKV0Md\"]")).getText();
        Assertions.assertEquals("Selenium", searchResult);
        System.out.println(searchResult);

//        System.out.println(driver.getTitle());
//        Assertions.assertEquals("selenium - Google meklēšana", driver.getTitle());

        driver.quit();
    }
}
