package ru.wildberries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputeSignIn = By.xpath("//*[@id=\"basketContent\"]/div[2]/a");
    private By inputeAddresses = By.xpath("//*[@id=\"basketContent\"]/div[1]/a");
    private By inputeBasket = By.xpath("//*[@id=\"basketContent\"]/div[3]/a");
    private By searchInput = By.xpath("//input[@id='searchInput']");
    private By applySearchBtn = By.xpath("//button[@id='applySearchBtn']");
    private By productCard = By.xpath("//article[@id='c79442510']//a");
    private By addProductInBasket = By.xpath("//button[@aria-label='Добавить в корзину']");
    private By actionNotificationText = By.xpath("//*[contains(text(),'Товар добавлен в корзину')]");

    public RegistrationPage clickSignIn() {
        driver.findElement(inputeSignIn).click();
        return new RegistrationPage(driver);
    }

    public AddressesPage clickAddresses() {
        driver.findElement(inputeAddresses);
        return new AddressesPage(driver);
    }

    public BasketPage clickBasket() {
        driver.findElement(inputeBasket);
        return new BasketPage(driver);
    }

    public RegistrationPage register() {
        this.clickSignIn();
        return new RegistrationPage(driver);
    }

    public BasePage search(String searchItems) {
        driver.findElement(searchInput).click();
        driver.findElement(searchInput).sendKeys(searchItems, Keys.ENTER);
        return new BasePage(driver);
    }

    public BasePage clickProductCard() {
        driver.findElement(productCard).click();
        return new BasePage(driver);
    }
    public BasePage clickAddBasket() {
        driver.findElement(addProductInBasket).click();
        return new BasePage(driver);
    }

    public BasePage clickSearch() {
        driver.findElement(applySearchBtn).click();
        return new BasePage(driver);
    }

    public BasePage getTextInModuleWindow() {
        driver.findElement(actionNotificationText);
        return new BasePage(driver);
    }

}