package ru.wildberries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By phoneInput = By.xpath("//input[@class='input-item']");
    private By getCodeButton = By.xpath("//button[@id='requestCode']");
    private By successfulRegistrationBanner = By.xpath("//div//h2[text()='Введите код с картинки']");

    public RegistrationPage enterNumberPhone(String number) {
        driver.findElement(phoneInput).sendKeys(number);
        return this;
    }

    public RegistrationPage clickInputSendKey(){
        driver.findElement(getCodeButton).click();
        return this;
    }

    public String successfulRegistration(){
        return driver.findElement(successfulRegistrationBanner).getText();
    }

}
