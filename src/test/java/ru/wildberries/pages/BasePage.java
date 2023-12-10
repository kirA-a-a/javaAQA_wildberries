package ru.wildberries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputeSignIn = By.xpath("//*[@id=\"basketContent\"]/div[2]/a");
    private By inputeAddresses = By.xpath("//*[@id=\"basketContent\"]/div[1]/a");
    private By inputeBasket = By.xpath("//*[@id=\"basketContent\"]/div[3]/a");

    public RegistrationPage clickSignIn(long number) {
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

    public RegistrationPage register(long number) {
        this.clickSignIn(number);
        return new RegistrationPage(driver);
    }

}