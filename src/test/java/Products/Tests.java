package Products;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tests {
    WebDriver driver;
    String url;
    HomePageLocators locators;
    ProductsPageLocators pageLocators;
    Scanner in;
    String productForSearch;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        url = "https://automationexercise.com/";
        locators = new HomePageLocators(driver);
        pageLocators = new ProductsPageLocators(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        in = new Scanner(System.in);
    }

    /*@BeforeTest
    public void initialize() {
        driver.get(url);
    }*/

    @Test(priority = 1,enabled = true)
    public void productPage() {
        driver.get(url);
        Assert.assertTrue(locators.isHomePageVisible());
        locators.clickProductBtn();
        Assert.assertTrue(pageLocators.isAllProductListVisible());
        pageLocators.clickFirstProduct();
        Assert.assertTrue(pageLocators.isFirstProductDetails());
        Assert.assertTrue(pageLocators.isProductNameDisplayed());
        Assert.assertTrue(pageLocators.isBrandBtnDisplayed());
        Assert.assertTrue(pageLocators.isAvailabilityBtnDisplayed());
        Assert.assertTrue(pageLocators.isCategoryBtnDisplayed());
        Assert.assertTrue(pageLocators.isConditionBtnDisplayed());
        Assert.assertTrue(pageLocators.isPriceBtnDisplayed());
    }

    @Test(priority = 10)
    public void searchProduct() {
        driver.get(url);
        Assert.assertTrue(locators.isHomePageVisible());
        locators.clickProductBtn();
        Assert.assertTrue(pageLocators.isAllProductListVisible());
        System.out.println("Enter the product");

        pageLocators.searchForProduct("Blue Top");
        pageLocators.clickSearchBtn();
        Assert.assertTrue(pageLocators.isSearchedProductDisplayed());
        Assert.assertTrue(pageLocators.isFirstProductDisplayed());
    }
    @Test(priority = -1)
    public void searching(){
        driver.get(url);
        Assert.assertTrue(locators.isHomePageVisible());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        locators.isSubscriptionWordDisplayed();
        locators.writeEmailInSearchBox();
        locators.clickSend();
        locators.isSuccessMessageDisplayed();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
