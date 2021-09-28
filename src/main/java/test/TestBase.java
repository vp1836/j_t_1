package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import saucedemo.CartPage;
import saucedemo.HomePage;
import saucedemo.ProductsPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    public HomePage homePage;
    public ProductsPage productsPage;
    public CartPage cartPage;

    @BeforeEach
    public void setUp() {

        //Local
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vp183\\Desktop\\Code\\_JAVA\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "/Users/mupsik/sites/_JAVA/webdriver/chromedriver");

        //AWS
//        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

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
        cartPage = PageFactory.initElements(driver, CartPage.class);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
