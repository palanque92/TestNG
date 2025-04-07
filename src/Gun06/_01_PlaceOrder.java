package Gun06;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_PlaceOrder extends BaseDriver {

    @Test
    void Test1 ()
    {
        WebElement ipod = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        ipod.sendKeys("ipod");

        WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        search.click();

        WebElement firstIpod = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
        firstIpod.click();

        WebElement shoppingCart = driver.findElement(By.linkText("shopping cart"));
        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement firstContiniue = driver.findElement(By.xpath("//input[@value='Continue']"));
        firstContiniue.click();

        WebElement secondContiniue = driver.findElement(By.xpath("(//input[@value='Continue'])[2]"));
        secondContiniue.click();

        WebElement thirdContiniue = driver.findElement(By.xpath("(//input[@value='Continue'])[3]"));
        thirdContiniue.click();

        WebElement fourthContiniue = driver.findElement(By.xpath("(//input[@value='Continue'])[4]"));
        fourthContiniue.click();

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement fifthContiniue = driver.findElement(By.xpath("(//input[@value='Continue'])[4]"));
        fifthContiniue.click();

        WebElement sixContiniue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Confirm Order']")));
        sixContiniue.click();


        wait.until(ExpectedConditions.urlContains("success"));
        WebElement s2 =driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertEquals(s2.getText(),"Your order has been placed!","Yanlis yazi");




    }
}
