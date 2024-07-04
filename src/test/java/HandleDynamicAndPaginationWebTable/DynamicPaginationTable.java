package HandleDynamicAndPaginationWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        username.clear();
        username.sendKeys("demo");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

        //Showing 1 to 10 of 2580 (258 Pages)
        String s = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();

        int total_pages = Integer.parseInt(s.substring(s.indexOf("(") + 1, s.indexOf("Pages") - 1));

        //repeating pages
        for (int p = 1; p <= total_pages; p++){
            if (p>1){
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='"+p+"']"));
                active_page.click();
                Thread.sleep(3000);
            }

            //reading data from the page
            int nOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            for (int r = 1; r<= nOfRows; r++){
                String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
                String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
                String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
                System.out.println(customerName+"\t"+email+"\t"+status);
            }


        }





    }
}
