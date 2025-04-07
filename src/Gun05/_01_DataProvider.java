package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData") // benim data saglayicim getData fonksiyonudur.
    void SearchTest (String searchText)
    {
        System.out.println("searchText = " + searchText);
    }






    @DataProvider // bu metod da dataprovider gorevi verildi.
    public Object [] getData() { // DataProvider olarak kukllanilacak metodun tipi Object olmak zorunda

        // int [] dizi = {1,2,3,4};
        Object[] data={"mac","samsung","huawei","iphone","pc","xaomi"}; // 1,3,4,5

        return data;
    }
    /***********************************************************************************/

    @Test(dataProvider = "aranacaklar") // benim data saglayicim getData fonksiyonudur.
    void SearchTest2 (String searchText)
    {
        System.out.println("searchText = " + searchText);
    }






    @DataProvider (name = "aranacaklar") // bu metod da dataprovider gorevi verildi.
    public Object [] getData2() { // DataProvider olarak kukllanilacak metodun tipi Object olmak zorunda

        // int [] dizi = {1,2,3,4};
        Object[] data={"mac","samsung","huawei","iphone","pc","xaomi"}; // 1,3,4,5

        return data;
    }


}
