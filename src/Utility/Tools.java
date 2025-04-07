package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static Utility.BaseDriver.driver;

public class Tools {
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void MuzikYukleniyor() {
        System.out.println("Muzik yukleniyor :)");
        String M = "";
        for (int i = 0; i <= 10; i++) {
            Tools.Bekle(1);
            System.out.print("\r" + "\033[42m" + M + "\033[0m" + " % " + (i * 10));
            M = M.concat("    ");
        }
        System.out.println();
    }
    public static void UygulamaYukleniyor() {
        System.out.println("Uygulama yukleniyor ...");
        String M = "";
        for (int i = 0; i <= 10; i++) {
            Tools.Bekle(1);
            System.out.print("\r" + "\033[42m" + M + "\033[0m" + " % " + (i * 10));
            M = M.concat("    ");
        }
    }
    public static void saat () {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime saat = LocalTime.now();

        while (saat.getMinute() > 0 ) {
            saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            Tools.Bekle(1);


        }
    }
    public static void successMessageValidation()
    {
        WebElement txt = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(txt.getText().toLowerCase().contains("success"));
    }

    public static void listContainsString(List<WebElement> list, String aranacakKelime)
    {
        boolean bulundu=false;
        for (WebElement e : list) {
            if (e.getText().equalsIgnoreCase(aranacakKelime)) {
                bulundu = true;
                break;
            }
        }
        if (!bulundu)
            Assert.fail("Aranan text bulunamadi");
    }
    public static int RandomNumberGenerator(int max)
    {
        return (int)(Math.random() *max);// 0-max dahil
    }
}
