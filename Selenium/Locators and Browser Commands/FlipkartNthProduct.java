package SeleniumDemoo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FlipkartProductCount {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com/");

        // Close login popup if visible
        try {
            WebElement closeBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z, button._2KpZ6l._2doB4z"));
            closeBtn.click();
        } catch (Exception e) {
            // popup not displayed - ignore
        }

        String[] products = {"Laptop", "TV", "Smart Phone"};

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.click();

            searchBox.sendKeys(Keys.CONTROL + "a");
            searchBox.sendKeys(Keys.DELETE);

            searchBox.sendKeys(product);

        
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            Thread.sleep(4000);   

        
            List<WebElement> productList = driver.findElements(By.cssSelector("div[data-id]"));

            System.out.println("=======================================");
            System.out.println("Search Term: " + product);

            if (productList.size() > 0) {
                System.out.println("Total products displayed on this page: " + productList.size());
            } else {
                System.out.println("No products found (or locator needs update).");
            }

            System.out.println("=======================================\n");

            // (Optional) small wait before next search
            Thread.sleep(5000);
        }

        driver.quit();
    }
}
