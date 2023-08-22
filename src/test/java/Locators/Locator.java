package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {
    WebDriver driver;
    Locator(WebDriver driver){
        this.driver = driver;
    }
    By findElementByID = By.id("welcome");
    By findElementByTagName = By.tagName("li");
    By findElementByXpath = By.xpath("//input[@id='sb_form_q']");
    By clickSearchBtn = By.xpath("//label[@id='search_icon']//*[name()='svg']");

    public String getLearnLocatorText(){
        return driver.findElement(findElementByID).getText();
    }
    public String getElementByTagName(){
        return driver.findElement(findElementByTagName).getText();
    }
    public void searchBing(String keyWord){
        driver.findElement(findElementByXpath).sendKeys(keyWord);
        driver.findElement(clickSearchBtn).click();
    }
}
