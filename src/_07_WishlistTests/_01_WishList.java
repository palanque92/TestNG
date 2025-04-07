package _07_WishlistTests;

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.

 */


import Utility.BaseDriverParameters;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishList extends BaseDriverParameters {

    @Test
    @Parameters("searchText")
    void TeaddToWishListst(String arananKelime) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(arananKelime);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='content']/div/div//h4"));
        int randomSecim = Tools.RandomNumberGenerator(searchResults.size());
        String wishItemText = searchResults.get(randomSecim).getText(); // ürünün adını aldım
        System.out.println("wishItemText = " + wishItemText); // kontrol

        List<WebElement> wishBtnList = driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));
        wishBtnList.get(randomSecim).click();  // aynı ürün wish liste eklendi

        WebElement btnWishList = driver.findElement(By.id("wishlist-total"));
        btnWishList.click();

        List<WebElement> wishTableNames = driver.findElements(By.cssSelector("td[class='text-left']>a"));

        Tools.listContainsString(wishTableNames, wishItemText);
    }


}
