package VerifyTestCasesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesPage {
    WebDriver driver;
    By testCasesBtn = By.className("btn");

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String HomePageTitle(){
       return driver.getTitle();
    }
    public void clickTestCaseBtn(){
        driver.findElement(testCasesBtn).click();
    }
    public String testCasesPageTitle(){
        return driver.getTitle();
    }

}
