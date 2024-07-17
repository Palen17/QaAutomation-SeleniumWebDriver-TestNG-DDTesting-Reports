package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        //Capture all links from website
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: " + links.size());

        int noOfBrokenLinks = 0;

        for (WebElement linkElement:links){
           String hrefAttValue = linkElement.getAttribute("href");
           if (hrefAttValue == null || hrefAttValue.isEmpty()){
               System.out.println("href attribute value is null or empty. So is not posible to check");
               continue;
           }

            //hit url to the server
            try {
                URL linkURL = new URL(hrefAttValue); // converted href value from string to url format
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
                conn.connect(); // connect to server and sent request to the server

                if (conn.getResponseCode() >= 400){
                    System.out.println(hrefAttValue + " ====> Broken link");
                    noOfBrokenLinks++;
                }else {
                    System.out.println(hrefAttValue + " ====> Not a broken link");
                }
            } catch (Exception e){

            }



        }

        System.out.println("Number of broken links: " + noOfBrokenLinks);
    }
}
