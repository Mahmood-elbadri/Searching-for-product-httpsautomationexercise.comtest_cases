package Products;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class ProductsPageLocators {
    WebDriver driver;
    By productPageVisible = By.id("sale_image");
    By allProductsList = By.className("features_items");
    By firstProduct = By.xpath("(//a[contains(text(),'View Product')])[1]");
    By firstProductDetails = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By firstProductDisplayed = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
    By productName = By.xpath("//h2[normalize-space()='Blue Top']");
    By categoryBtn = By.xpath("(//p[normalize-space()='Category: Women > Tops'])[1]");
    By priceBtn = By.xpath("//span[normalize-space()='Rs. 500']");
    By availabilityBtn = By.xpath("//b[normalize-space()='Availability:']");
    By conditionBtn = By.xpath("//b[normalize-space()='Condition:']");
    By brandBtn = By.xpath("//b[normalize-space()='Brand:']");
    By searchBox = By.id("search_product");
    By searchedProduct = By.xpath("//h2[normalize-space()='Searched Products']");
    By clickSearch = By.id("submit_search");
    public ProductsPageLocators(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isAllProductListVisible(){
        return (driver.findElement(allProductsList).isDisplayed());
    }
    public void clickFirstProduct(){
        driver.findElement(firstProduct).click();
    }
    public boolean isFirstProductDetails(){
        return (driver.findElement(firstProductDetails).isDisplayed());
    }
    public boolean isProductNameDisplayed(){
        return (driver.findElement(productName).isDisplayed());
    }
    public boolean isCategoryBtnDisplayed(){
        return (driver.findElement(categoryBtn).isDisplayed());
    }
    public boolean isPriceBtnDisplayed(){
        return (driver.findElement(priceBtn).isDisplayed());
    }
    public boolean isAvailabilityBtnDisplayed(){
        return (driver.findElement(availabilityBtn).isDisplayed());
    }
    public boolean isConditionBtnDisplayed(){
        return (driver.findElement(conditionBtn).isDisplayed());
    }
    public boolean isBrandBtnDisplayed(){
        return (driver.findElement(brandBtn).isDisplayed());
    }
    public void searchForProduct(String product){
        driver.findElement(searchBox).sendKeys(product);
    }
    public boolean isSearchedProductDisplayed(){
        return (driver.findElement(searchedProduct).isDisplayed());
    }
    public void clickSearchBtn(){
        driver.findElement(clickSearch).click();
    }
    public boolean isFirstProductDisplayed(){
        return (driver.findElement(firstProductDisplayed).isDisplayed());
    }
}
