package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactUsForm {
    public WebDriver driver = null;
    String url = "https://automationexercise.com/";
    ContactUsFormLocators locators;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        locators = new ContactUsFormLocators(driver);
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void theForm() throws InterruptedException {
        locators.verifyHomePage();
         
        locators.clickContactUs();
         
        locators.verifyGetInTouch();
         
        locators.enterName("mahmood");
         
        locators.enterEmail("3melnas@gn.com");
         
        locators.enterMessage("Hi");
         
        locators.enterSubject("aywa");
         
        Assert.assertTrue(locators.uploadFileExists());
         
        locators.clickSubmit();
         
        locators.clickOkAlert();
         
        locators.clickHomeButton();
         
    }

}
