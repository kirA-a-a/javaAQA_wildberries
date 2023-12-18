package ru.wildberries.tests;

import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class TestBasePage {

    public ChromeDriver driver;

    @Test
    @Description("Добавление товара в корзину")
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

}
