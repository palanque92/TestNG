package _05_DataProviderTests;

import Utility.BaseDriverParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends BaseDriverParameters {

    @Test(dataProvider = "getData")
    void SearchFunction (String aranacakKelime)
    {
        WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
        txt.clear();
        txt.sendKeys(aranacakKelime);

        WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        search.click();

        List<WebElement> caption = driver.findElements(By.cssSelector("div[class='caption']>h4"));
        for (WebElement e : caption)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));

    }
    @DataProvider
    public Object[] getData()
    {
        Object[] data={"mac","ipad","samsung"};
        return data;
    }
}
