package Project;

import Utility.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverProject {
    public static WebDriver driver;

    public static WebDriverWait wait;
    @BeforeClass
    @Parameters("browser")
    public void baslangicIslemleri(String browser) {
        System.out.println("Baslangic islemleri");
        // ilk adimda calisan kod kismi
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize(); // ekrani max yapiyor
        driver.manage().deleteAllCookies(); // sitenin senin bilgisayarinda yaptigi ayarlar siliniyor

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece tum sayfanin kodlarinin bilgisayariniza inmesi suresiyle ilgili
        // bu eklenmezse Selenium sayfa yuklenene kadar (sonsuza) bekler. : 30 sn suresince sayfanin yuklenmesini bekle yuklenmezse hata verir
        // eger 2 sn yuklerse 30sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Butun webelementlerin elemnt bazinda , elemente ozel islem yapilmadan once
        // hazir hale gelmesi verilem muhlet yani sure.

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void bitisIslemleri()
    {
        System.out.println("bitis islemleri");
        Tools.Bekle(3);
        driver.quit();
    }
}
