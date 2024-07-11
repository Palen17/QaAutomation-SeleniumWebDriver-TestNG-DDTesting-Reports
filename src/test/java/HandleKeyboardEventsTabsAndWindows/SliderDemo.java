package HandleKeyboardEventsTabsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //Min slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println(min_slider.getLocation()); //(59, 250) - (x,y)
        act.dragAndDropBy(min_slider, 100, 249).perform();
        System.out.println(min_slider.getLocation());

        //Max slider
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println(max_slider.getLocation()); //(896, 250) - (x,y)
        act.dragAndDropBy(max_slider, -76, 249).perform();
        System.out.println(max_slider.getLocation());
    }
}
