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
    private By addProductInBasket = By.xpath("//div[@class='order']//button[@class='btn-main']");
    private By actionNotificationText = By.xpath("//*[contains(text(),'Товар добавлен в корзину')]");
    private By buttonGoToTheBasket = By.xpath("//div[@class='order']//a");
    private By nameItemInBasket = By.xpath("//span[@class='good-info__good-name']");
    private By buttonBuy = By.xpath("//div//button[@type='button' and contains(text(), 'Заказать')]");
    private By buttonDeleteInBasket = By.xpath("//div[@class='list-item__btn btn']//button[2]");
    private By textClearBasket = By.xpath("//div[@class='basket-empty__wrap']/h1[contains(text(), 'В корзине пока пусто')]");
    private By buttonAddFavorite = By.xpath("//div[@class='list-item__btn btn']//button[1]");

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

    public BasePage goToTheBasket() {
        driver.findElement(buttonGoToTheBasket).click();
        return new BasePage(driver);
    }

    public BasePage itemInBasket() {
        driver.findElement(nameItemInBasket).getText();
        return new BasePage(driver);
    }
    public BasePage buyItems() {
        driver.findElement(buttonBuy).click();
        return new BasePage(driver);
    }

    public BasePage deleteItemInBasket() {
        driver.findElement(buttonDeleteInBasket).click();
        return new BasePage(driver);
    }

    public BasePage getTextClearBasket() {
        driver.findElement(textClearBasket);
        return new BasePage(driver);
    }

    public BasePage addFavorite() {
        driver.findElement(buttonAddFavorite).click();
        return new BasePage(driver);
    }

}