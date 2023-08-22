package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class Guru99HomePage {

    public static WebDriver driver;
    By homePageUserId = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");

    public Guru99HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageUserId() {
        return driver.findElement(homePageUserId).getText();
    }
}