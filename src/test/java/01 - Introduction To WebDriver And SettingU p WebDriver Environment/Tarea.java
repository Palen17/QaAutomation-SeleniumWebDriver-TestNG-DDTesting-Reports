package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tarea {

    public static void main (String[] args){


        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();

        if (title.equals("nopCommerce demo store")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        driver.quit();


    }
}
