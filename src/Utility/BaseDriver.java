package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass (groups = "SmokeTest")
    public void baslangicIslemleri()
    {
        System.out.println("Baslangic islemleri");
        // ilk adimda calisan kod kismi
        Logger logger = Logger.getLogger(""); // butun loglara ulastim
        logger.setLevel(Level.SEVERE); // sadece errorlari goster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // ChromeServici sessiz modda çalıştır
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli

        driver.manage().window().maximize(); // ekrani max yapiyor
        driver.manage().deleteAllCookies(); // sitenin senin bilgisayarinda yaptigi ayarlar siliniyor

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece tum sayfanin kodlarinin bilgisayariniza inmesi suresiyle ilgili
        // bu eklenmezse Selenium sayfa yuklenene kadar (sonsuza) bekler. : 30 sn suresince sayfanin yuklenmesini bekle yuklenmezse hata verir
        // eger 2 sn yuklerse 30sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Butun webelementlerin elemnt bazinda , elemente ozel islem yapilmadan once
        // hazir hale gelmesi verilem muhlet yani sure.

        wait=new WebDriverWait(driver,Duration.ofSeconds(10));

    }
    @Test (groups = "SmokeTest")
    public void loginTest()
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

    @AfterClass (enabled = true , groups = "SmokeTest")
    public void bitisIslemleri()
    {
        System.out.println("bitis islemleri");
        Tools.Bekle(3);
        driver.quit();
    }
}
