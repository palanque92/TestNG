package Gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Dependency {

    // arabanin hareketleri : start , drive , park , stop hareket sirasi

    @Test
    void startCar()
    {
        System.out.println("startCar");
    }
    @Test(dependsOnMethods = {"startCar"}) // bu testin calismasi startCAR IN HATASIZ CALISMASINA BAGLI
    void driveCar()
    {
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar()
    {
        System.out.println("parkCar");
    }
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true) // alwaysRun = true bagimliliklari var ama hata cikarsa da yine calisir.
    void StopCar()
    {
        System.out.println("stopCar");
    }
    // ayni seviyedeki testler icin priorty verilebilir.
    // bagimli testler , direk metodundan calistirdiginizda bagimli oldugu method zincirinde 3 uste kadar otomatik cagirip calisabilir.

}
