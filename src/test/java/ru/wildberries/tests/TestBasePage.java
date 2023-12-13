package ru.wildberries.tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class TestBasePage {

    public ChromeDriver driver;

    @Test
    public void buyItems() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru");

        BasePage basePage = new BasePage(driver);

        TimeUnit.SECONDS.sleep(1);
        basePage.search("Дело Деда Упоры для отжиманий деревянные 32см");
    }

}
