package VerifyTestCasesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases {
    TestCasesPage page;
    WebDriver driver;
    String url;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        page = new TestCasesPage(driver);
        url = "https://automationexercise.com/";
    }
    @Test(priority = 0)
    public void testPage(){
        driver.get(url);
        Assert.assertEquals(page.HomePageTitle(),"Automation Exercise");
        page.clickTestCaseBtn();
    }
    @Test(priority = 1)
    public void testCaseAssertion(){
        Assert.assertEquals(page.testCasesPageTitle(),"Automation Practice Website for UI Testing - Test Cases");
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
