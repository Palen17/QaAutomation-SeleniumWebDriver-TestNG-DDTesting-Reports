package JavaScriptExecutorHandleFileUploadScrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //Single file upload
        /*
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\Curso-QA-Automation\\seleniumwebdriver\\Locators.pdf");
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Locators.pdf")){
            System.out.println("File successfully uploaded");
        }else {
            System.out.println("Upload falied");
        }

         */

        //Multiple file upload
        String file1 = "E:\\Curso-QA-Automation\\seleniumwebdriver\\Locators.pdf";
        String file2 = "E:\\Curso-QA-Automation\\seleniumwebdriver\\selenium+classes.jpg";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);




    }


}
