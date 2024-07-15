package CapturescreenshotsHandleSSLHeadlessbrowserBlockingAdsChromeExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class EnableExtensionsInRuntime {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        File file = new File("E:\\Curso-QA-Automation\\seleniumwebdriver\\SelectorsHub-Chrome-Web-Store.crx");

        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }
}
