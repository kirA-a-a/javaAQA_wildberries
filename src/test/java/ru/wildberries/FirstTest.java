package ru.wildberries;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {
        String actualString = driver.findElement(By.xpath("//div//input[@id='searchInput']"))
                .getAttribute("placeholder");
        Assert.assertTrue(actualString.equals("Найти на Wildberries"));
                driver.quit();
    }

}
