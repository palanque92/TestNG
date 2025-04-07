package Gun07;

import Gun06._02_PlaceOrderElements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _03_WishListPOM extends BaseDriver {

    @Test
    @Parameters("itemName")
    void addToWishList(String arananKelime)
    {
        _02_PlaceOrderElements poe=new _02_PlaceOrderElements();

        poe.searchBox.sendKeys(arananKelime);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements();

        int rndNumber= Tools.RandomNumberGenerator(wle.searchResults.size());  // sonuçların listesin size dan bir rnd numara ürettim
        String wishItemName=wle.searchResults.get(rndNumber).getText();  // ürünün text ini aldım
        wle.wishBtnList.get(rndNumber).click(); // aynı ürünün wish list ine tıklattım
        wle.btnWishList.click(); // wish list sayfasına gittim

        Tools.listContainsString(wle.wishTableNames, wishItemName);
    }

}
