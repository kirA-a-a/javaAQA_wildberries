package ru.wildberries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {

    private By buttonGoToTheBasket = By.xpath("//div[@class='order']//a");
    private By nameItemInBasket = By.xpath("//span[@class='good-info__good-name']");
    private By buttonBuy = By.xpath("//div//button[@type='button' and contains(text(), 'Заказать')]");
    private By buttonDeleteInBasket = By.xpath("//div[@class='list-item__btn btn']//button[2]");
    private By textClearBasket = By.xpath("//div[@class='basket-empty__wrap']/h1[contains(text(), 'В корзине пока пусто')]");
    private By buttonAddFavorite = By.xpath("//div[@class='list-item__btn btn']//button[1]");
    private By buttonCountPlus = By.xpath("//button[@aria-label='Увеличить количество']");

    private WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public BasketPage goToTheBasket() {
        driver.findElement(buttonGoToTheBasket).click();
        return new BasketPage(driver);
    }

    public BasketPage itemInBasket() {
        driver.findElement(nameItemInBasket).getText();
        return new BasketPage(driver);
    }

    public BasketPage buyItems() {
        driver.findElement(buttonBuy).click();
        return new BasketPage(driver);
    }

    public BasketPage deleteItemInBasket() {
        driver.findElement(buttonDeleteInBasket).click();
        return new BasketPage(driver);
    }

    public BasketPage getTextClearBasket() {
        driver.findElement(textClearBasket);
        return new BasketPage(driver);
    }

    public BasketPage addFavorite() {
        driver.findElement(buttonAddFavorite).click();
        return new BasketPage(driver);
    }
    public BasketPage plusCountItem() {
        driver.findElement(buttonCountPlus).click();
        return new BasketPage(driver);
    }
}
