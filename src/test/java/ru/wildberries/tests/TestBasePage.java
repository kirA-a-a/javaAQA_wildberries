package ru.wildberries.tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class TestBasePage {

    public ChromeDriver driver;

    @Test
    public void buyItems() {
        driver = new ChromeDriver();
        driver.get("https://www.wildberries.ru");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        BasePage basePage = new BasePage(driver);

        basePage.search("123");

    }

}
