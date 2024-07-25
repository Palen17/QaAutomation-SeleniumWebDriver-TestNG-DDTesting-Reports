package day42;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void openApp(){
        System.out.println("Opening app");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("Login into app");
    }

    @Test(priority = 3)
    void logout(){
        System.out.println("Logout from app");
    }
}
