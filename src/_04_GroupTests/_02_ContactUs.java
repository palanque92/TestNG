package _04_GroupTests;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends BaseDriver {
    @Test
    @Parameters("mesaj") // xml de'ki parametre adi ayni olmak zorunda
    void ContacUsTest (String gelenMesaj) // metod icin gerekli tanimlama ayni olmak zorunda degil
    {
        WebElement contacUs = driver.findElement(By.linkText("Contact Us"));
        contacUs.click();

        WebElement msj = driver.findElement(By.xpath("//textarea[@name='enquiry']"));
        msj.sendKeys(gelenMesaj);

        WebElement submitBttn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitBttn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
