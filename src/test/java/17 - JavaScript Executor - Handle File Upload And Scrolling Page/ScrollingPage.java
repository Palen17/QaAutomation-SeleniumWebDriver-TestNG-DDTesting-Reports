package JavaScriptExecutorHandleFileUploadScrollingPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //1) scroll down page by pixel number
        //js.executeScript("window.scrollBy(0, 1500)", "");
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //2) scroll till element is visible
        //WebElement comPoll = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        //js.executeScript("arguments[0].scrollIntoView();", comPoll);
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //3) scroll down till end of the page
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //4) scroll up to iinital position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }


}
