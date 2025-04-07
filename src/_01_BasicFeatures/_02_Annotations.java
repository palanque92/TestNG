package _01_BasicFeatures;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
        @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)
           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar
               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak
        @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)
     */
    @BeforeClass
    void beforeClass(){
        System.out.println("Her class dan once calisacak"); // driver ve diger test oncesi butun islemler
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Her method dan once calisir.");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("Her method dan sonra calisacak");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Her class dan sonra calisacak"); // driver kapat vs
    }
    @Test
    void Test1 (){
        System.out.println("test1 calisti.");
    }
    @Test
    void Test2 (){
        System.out.println("test2 calisti.");
    }
}
