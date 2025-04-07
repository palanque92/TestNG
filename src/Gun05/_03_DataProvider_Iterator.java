package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {
    @Test(dataProvider = "getData")
        // benim data saglayicim getData fonksiyonudur.
    void SearchTest(String searchText)
    {
        System.out.println("searchText = " + searchText);
    }


    @DataProvider // bu metod da dataprovider gorevi verildi.
    public Iterator<Object> getData() { // DataProvider olarak kukllanilacak metodun tipi Object olmak zorunda


        List<Object>data=new ArrayList<>();
        data.add("mac");
        data.add("samsung");
        data.add("huawei");

        return data.iterator();
    }
    /***************************************************************/
    @Test(dataProvider = "getData2")
    // benim data saglayicim getData fonksiyonudur.
    void LoginTest(String username,String passwprd)
    {
        System.out.println("username+ = " + username+",password ="+passwprd);
    }


    @DataProvider // bu metod da dataprovider gorevi verildi.
    public Iterator<Object[]> getData2() { // DataProvider olarak kukllanilacak metodun tipi Object olmak zorunda


        List<Object[]>logins=new ArrayList<>();
        logins.add(new Object[]{"Omer","asdasdasd"});
        logins.add(new Object[]{"Miko","plplplpp"});
        logins.add(new Object[]{"Enes","mkmkmkmkmk"});

        return logins.iterator();
    }
}
