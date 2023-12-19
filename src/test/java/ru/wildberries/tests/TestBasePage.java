package ru.wildberries.tests;

import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;
import ru.wildberries.pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class TestBasePage {

    public ChromeDriver driver;

    @Test
    @Description("Покупка товара")
    public void buyItems() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru");

        BasePage basePage = new BasePage(driver);

        TimeUnit.SECONDS.sleep(1);
        basePage.search("Упоры для отжиманий деревянные 32см");
        basePage.clickProductCard();
        basePage.clickAddBasket();
        basePage.getTextInModuleWindow();
        basePage.goToTheBasket();
        basePage.itemInBasket();
        basePage.buyItems();
    }

    @Test
    @Description("Добавление товара в корзину с последующием удалением этого товара из корзины")
    public void buyItemsAndDeleteInBasket() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru");


        BasePage basePage = new BasePage(driver);

        TimeUnit.SECONDS.sleep(1);
        basePage.search("Упоры для отжиманий деревянные 32см");
        basePage.clickProductCard();
        basePage.clickAddBasket();
        basePage.getTextInModuleWindow();
        basePage.goToTheBasket();
        basePage.itemInBasket();
        basePage.deleteItemInBasket();
        basePage.getTextClearBasket();
    }

    @Test
    @Description("Добавление товара в корзину с последующием добавлением его в избранное")
    public void addItemsInFavourites() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru");


        BasePage basePage = new BasePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        TimeUnit.SECONDS.sleep(1);
        basePage.search("Упоры для отжиманий деревянные 32см");
        basePage.clickProductCard();
        basePage.clickAddBasket();
        basePage.getTextInModuleWindow();
        basePage.goToTheBasket();
        basePage.itemInBasket();
        basePage.addFavorite();
        registrationPage.enterNumberPhone("9999999999");
        registrationPage.clickInputSendKey();
        Assert.assertEquals(registrationPage.successfulRegistration(), "Введите код с картинки");
    }

}
