package Gun04;

import Utility.BaseDriver;
import Utility.BaseDriverParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionalityPD extends BaseDriverParameters {
    @Parameters("aranacakKelime")
    @Test
    void Test1 (String aranacakKelime)
    {
        WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
        txt.sendKeys(aranacakKelime);

        WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        search.click();

        List <WebElement> caption = driver.findElements(By.cssSelector("div[class='caption']>h4"));
        for (WebElement e : caption)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));

    }
}
