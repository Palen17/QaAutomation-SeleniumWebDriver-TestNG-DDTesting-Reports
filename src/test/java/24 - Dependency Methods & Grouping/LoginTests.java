package day44;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, groups = {"sanity"})
    void loginbyemail(){
        System.out.println("Login by email");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginbyfacebookl(){
        System.out.println("Login by facebook");
    }

    @Test(priority = 3, groups = {"sanity"})
    void loginbytwitter(){
        System.out.println("Login by twitter");
    }
}
