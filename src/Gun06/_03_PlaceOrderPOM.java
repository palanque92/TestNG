package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrderPOM extends BaseDriver {
    @Test
    void ProceedToCheckout()
    {
        _02_PlaceOrderElements elements=new _02_PlaceOrderElements();

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.firstIpod.click();
        elements.shoppingCart.click();
        elements.checkOut.click();
        elements.firstContiniue.click();
        elements.secondContiniue.click();
        elements.thirdContiniue.click();
        elements.fourthContiniue.click();
        elements.checkbox.click();
        elements.fifthContiniue.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.sixContiniue)).click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.s2.getText(),"Your order has been placed!");
    }
}
