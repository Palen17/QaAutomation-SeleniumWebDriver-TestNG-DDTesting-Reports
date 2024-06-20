package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get(url) -- opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //getTitle() -- returns the title of the webpage
        System.out.println(driver.getTitle());

        //getCurrentUrl() -- returns url of the page
        System.out.println(driver.getCurrentUrl());

        //getPageSource() -- captures the source code of the page
        System.out.println(driver.getPageSource());

        //getWindowHandle() -- returns ID of the single Browser window
        //String windowId = driver.getWindowHandle();
        //System.out.println("Window ID: " + windowId);

        //getWindowHandles() -- returns ID's of multiple browser windows
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);
        for(String windowId : windowIds){

            System.out.println(windowId);

        }


    }
}
