package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99LoginPage {
    WebDriver driver;

    By guruId = By.name("uid");
    By guruPassword = By.name("password");
    By loginButton = By.name("btnLogin");
    By titleText = By.className("barone");
    By loginBtn = By.name("btnLogin");
    //By managerId = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");

    public Guru99LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserId(String userId){
        driver.findElement(this.guruId).sendKeys(userId);
    }
    public void setUserPassword(String userPassword){
        driver.findElement(guruPassword).sendKeys(userPassword);
    }
    public void clickLogIn(){
        driver.findElement(loginBtn).click();
    }
    public String getTextInHomePage(){
        return driver.findElement(titleText).getText();
    }
    public void logInGuru99(String id,String password){
        setUserId(id);
        setUserPassword(password);
        clickLogIn();
    }
}
