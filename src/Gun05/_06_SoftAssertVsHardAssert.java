package Gun05;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVsHardAssert {
    @Test
    void hardAssert()
    {
        String s1 ="Merhaba";

        System.out.println("Hard Assert kontrol oncesi");
        Assert.assertEquals("Merhaba 123",s1,"Hard Assert sonucu");
        System.out.println("Hard Assert kontrol sonrasi");
    }

    @Test
    void softAssert()
    {
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("www.facebook.com/homepage",strHomePage); //true
        System.out.println("assert 1");

        softAssert.assertEquals("www.facebook.com/profile",strCartPage); //false
        System.out.println("assert 2");

        softAssert.assertEquals("www.facebook.com/settings",strEditAccount); //false
        System.out.println("assert 3");

        softAssert.assertAll(); // buutun assert lerin sonuclarini isleme koyar
        System.out.println("Aktiflik sonrasi");
        // bu bolum assertAll dan sonra oldugu ve oncesinde hata olustugu icin
        // yazilmadi
    }
}
