package ru.wildberries;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void openWebSite() {
        driver = new ChromeDriver();
        driver.get("https://www.wildberries.ru");
    }

    @After
    public void closeSite() {
        driver.quit();
    }

}
