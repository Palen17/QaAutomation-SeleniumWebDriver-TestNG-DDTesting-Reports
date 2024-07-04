package HandleStaticWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) Find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        //int rows = driver.findElements(By.tagName("tr")).size();

        System.out.println("Number of rows: " + rows);

        //2) Find total number of columns in a table

        int colums = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of colums: " + colums);

        //3) Read data from specific row and column (ej: 5 row and 1 column)
        //String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        //System.out.println(bookName);

        //4) Read data from all the rows and columns
        /*
        for (int r = 2; r<=rows; r++){

            for (int c = 1; c <= colums; c++){

                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(value);

            }
        }

         */

        //5) Print data with a condition
        for (int r = 2; r<=rows;r++){
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if (authorName.equals("Mukesh")){
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(bookName);
            }
        }

        //6) Find total price of all books
        int total = 0;
        for (int r = 2; r<=rows;r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total = total + Integer.parseInt(price);

        }
        System.out.println(total);
    }
}
