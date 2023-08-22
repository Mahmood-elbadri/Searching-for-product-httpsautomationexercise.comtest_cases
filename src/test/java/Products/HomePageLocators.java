package Products;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class HomePageLocators {
    WebDriver driver;
    By homePageIsVisible = By.xpath("//img[@alt='Website for automation practice']");
    By productBtn = By.xpath("//a[@href='/products']");
    By searchBox = By.xpath("//input[@id='susbscribe_email']");
    By confirmationMessage = By.xpath("//*[@id=\"success-subscribe\"]");
    By subscriptionWord = By.xpath("//h2[normalize-space()='Subscription']");
    By submitEmailBtn = By.cssSelector(".fa.fa-arrow-circle-o-right");
    public HomePageLocators(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageVisible() {
        return (driver.findElement(homePageIsVisible).isDisplayed());
    }

    public void clickProductBtn() {
        driver.findElement(productBtn).click();
    }

    public void writeEmailInSearchBox() {
        String email = "nada197951@fedu.bu.edu.eg";
        driver.findElement(searchBox).sendKeys(email);

    }
    public boolean isSubscriptionWordDisplayed(){
        return (driver.findElement(subscriptionWord).isDisplayed());
    }
    public boolean isSuccessMessageDisplayed(){
        return (driver.findElement(confirmationMessage).isDisplayed());
    }
    public void clickSend(){
        driver.findElement(submitEmailBtn).click();
    }

}
