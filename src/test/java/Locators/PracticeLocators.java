package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeLocators {
    WebDriver driver = null;
    Locator locator;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        locator = new Locator(driver);
        //driver.get("https://hatem-hatamleh.github.io/Selenium-html/locators.html");
driver.get("https://bing.com");
    }
    @Test
    public void locating(){

        String text = locator.getLearnLocatorText();
        Assert.assertEquals(text,"Learn Locators");
    }
    @Test
    public void locatingByTagName(){

        String text = locator.getElementByTagName();
        Assert.assertEquals(text,"Selenium");
    }
    @Test
    public void searchBing(){
        locator.searchBing("locators in selenium");
    }
    @AfterTest
    public void tearDown(){
        //driver.quit();
    }
}
