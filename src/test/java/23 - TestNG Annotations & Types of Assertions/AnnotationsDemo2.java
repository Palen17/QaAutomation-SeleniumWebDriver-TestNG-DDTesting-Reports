package day43;

/*
login
search
advance search
logout
 */

import org.testng.annotations.*;

public class AnnotationsDemo2 {

    @BeforeClass
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

    @AfterClass
    void logout(){
        System.out.println("THis is logout");
    }
}
