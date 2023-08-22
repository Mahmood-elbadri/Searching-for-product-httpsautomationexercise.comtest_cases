package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactUsFormLocators {
    WebDriver driver;
    By pageTitle = By.xpath("//title[normalize-space()='Automation Exercise']");
    By contactUsBtn = By.cssSelector("a[href='/contact_us']");
    By getInTouch = By.xpath("//h2[normalize-space()='Get In Touch']");
    By nameTextBox = By.cssSelector("input[placeholder='Name']");
    By emailTextBox = By.cssSelector("input[placeholder='Email']");
    By subjectTextBox = By.cssSelector("input[placeholder='Subject']");
    By messageTextBox = By.name("message");
    By uploadFile = By.name("upload_file");
    By submitBtn = By.name("submit");
    By successMessage = By.id("form-section");
    By homeBack = By.xpath("//span[normalize-space()='Home']");


    public ContactUsFormLocators(WebDriver driver) {
        this.driver = driver;
    }
public void verifyGetInTouch(){
        WebElement inTouch = driver.findElement(getInTouch);
        Assert.assertTrue(inTouch.isDisplayed());
}
    public void clickOkAlert(){
        driver.switchTo().alert().accept();
    }
    public void clickContactUs(){
        driver.findElement(contactUsBtn).click();
    }
    public void enterName(String name){
        driver.findElement(nameTextBox).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void enterSubject(String subject){
        driver.findElement(subjectTextBox).sendKeys(subject);
    }
    public void enterMessage(String message){
        driver.findElement(messageTextBox).sendKeys(message);
    }
    public boolean uploadFileExists(){
        WebElement file = driver.findElement(uploadFile);
        if(file.isDisplayed()){
            return true;
        }
        return false;
    }
    public void clickSubmit(){
        driver.findElement(submitBtn).click();
    }
    public boolean successMessage(){
        String actualResponse = driver.findElement(successMessage).getText();
        String expectedResponse = "Success! Your details have been submitted successfully.";
        if(actualResponse == expectedResponse){
            return true;
        }
        return false;
    }
    public void clickHomeButton(){
        driver.findElement(homeBack).click();
    }
    public void verifyHomePage(){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,"Automation Exercise");
    }
}
