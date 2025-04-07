package _01_BasicFeatures;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Ornek extends BaseDriver {
    @Test
    void loginTst()
    {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        System.out.println("login Test");

        WebElement input =driver.findElement(By.id("input-email"));
        input.sendKeys("12345678@gmail.com");

        WebElement password =driver.findElement(By.id("input-password"));
        password.sendKeys("omer1234");

        WebElement lgnButton =driver.findElement(By.cssSelector("input[type='submit']"));
        lgnButton.click();

        Assert.assertEquals(driver.getTitle(),"My Account","Login basarisiz");

    }

}
