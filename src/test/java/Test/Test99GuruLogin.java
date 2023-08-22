package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Guru99HomePage;
import pages.Guru99LoginPage;

import java.util.concurrent.TimeUnit;

public class Test99GuruLogin {
    Guru99HomePage Home;
    Guru99LoginPage loginPage;
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4");
    }

    @AfterTest
    public void tearDown(){
        //driver.quit();
    }
    @Test
    public void testHomePageAppearCorrect(){
        loginPage = new Guru99LoginPage(driver);
        String loginPageTitle = loginPage.getTextInHomePage();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        loginPage.logInGuru99("mngr519655", "gArErYv");
        Home = new Guru99HomePage(driver);
        Assert.assertEquals("Manger Id : mngr519655",Home.getHomePageUserId());
    }
}
