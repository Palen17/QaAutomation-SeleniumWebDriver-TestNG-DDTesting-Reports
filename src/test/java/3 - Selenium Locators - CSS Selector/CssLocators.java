package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/"); // Maximize the browser window
        driver.manage().window().maximize();

        //tag & id      tag#id:
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //Solo id:
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("computer");

        //tag class     tag.classname:
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Computer");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Computer");

        //tag attribute     tag[attribute=value]
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Computer");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Computer");

        //tag cñass attribute
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Computer");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Computer");
    }
}
