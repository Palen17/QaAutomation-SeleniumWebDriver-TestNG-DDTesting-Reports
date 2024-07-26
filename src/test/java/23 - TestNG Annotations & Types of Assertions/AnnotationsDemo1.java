package day43;
/*
login
search
logout
login
advance search
logout
 */


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

    @BeforeMethod
    void login(){
        System.out.println("THis is login");
    }

    @Test(priority = 1)
    void search(){
        System.out.println("THis is search");
    }

    @Test(priority = 2)
    void advancesearch(){
        System.out.println("THis is this is advance search");
    }

    @AfterMethod
    void logout(){
        System.out.println("THis is logout");
    }
}
