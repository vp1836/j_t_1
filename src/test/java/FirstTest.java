import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

    @Test
    public void OpenBrowser() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp183\\Desktop\\Code\\_JAVA\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]")).click();
        System.out.println(driver.getTitle());
        Assertions.assertEquals("Google", driver.getTitle());
    }
}
