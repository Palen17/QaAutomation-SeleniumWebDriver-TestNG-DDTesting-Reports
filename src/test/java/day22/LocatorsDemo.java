package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        //Name:
        //1) WebElement searchBox = driver.findElement(By.name("search"));
        //2) searchBox.sendKeys("MacBook");

        //En 1 solo paso
        //driver.findElement(By.name("search")).sendKeys("MacBook");

        //ID:
        //1) WebElement logo = driver.findElement(By.id("logo"));
        //2) boolean status = logo.isDisplayed();

        //En 1 solo paso
        //boolean status = driver.findElement(By.id("logo")).isDisplayed();

        //System.out.println("Display status: " + status);

        //linkText & partialLinkText -- only for link
        //driver.findElement(By.linkText("Tablets")).click(); //linkText
        //driver.findElement(By.partialLinkText("Tab")).click(); // partialLinkText

        //classname:
        //List<WebElement> headerLinks = driver.findElements(By.className("nav-item"));
        //System.out.println(headerLinks.size());

        //tagname:

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());

    }
}
