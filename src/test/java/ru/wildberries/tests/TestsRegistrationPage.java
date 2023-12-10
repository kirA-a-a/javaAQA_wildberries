package ru.wildberries.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class TestsRegistrationPage {
    static WebDriver driver;
    @Test
    public void register(){
        driver = new ChromeDriver();
        driver.get("https://www.wildberries.ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BasePage basePage = new BasePage(driver);
        basePage.register(9998544030L);
    }
}
