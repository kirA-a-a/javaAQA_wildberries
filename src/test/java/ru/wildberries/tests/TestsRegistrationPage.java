package ru.wildberries.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.wildberries.pages.BasePage;
import ru.wildberries.pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class TestsRegistrationPage{

    public ChromeDriver driver;

    @Test
    public void register(){
        driver = new ChromeDriver();
        driver.get("https://www.wildberries.ru");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        BasePage basePage = new BasePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        basePage.register();
        registrationPage.enterNumberPhone("9999999999");
        registrationPage.clickInputSendKey();
        Assert.assertEquals(registrationPage.successfulRegistration(), "Введите код с картинки");
    }
}
