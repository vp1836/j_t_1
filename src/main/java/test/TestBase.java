package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import saucedemo.HomePage;
import saucedemo.ProductsPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    public HomePage homePage;
    public ProductsPage productsPage;

    @BeforeEach
    public void setUp() {

        //Local
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp183\\Desktop\\Code\\_JAVA\\chromedriver.exe");

        //AWS
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        //Headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        //Normal
//        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        homePage = PageFactory.initElements(driver, HomePage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
