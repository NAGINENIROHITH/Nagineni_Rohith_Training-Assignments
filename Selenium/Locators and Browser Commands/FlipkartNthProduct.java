package SeleniumDemoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FlipkartNthProduct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com/");

        try {
            WebElement closeBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            closeBtn.click();
        } catch (Exception e) {
            
        }

        String[] products = {"Laptop", "TV", "Smart Phone"};
        int[] nth = {7, 13, 2};

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            int index = nth[i];

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(product);

            WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
            searchButton.click();

            Thread.sleep(3000);

            List<WebElement> productTitles = driver.findElements(By.cssSelector("div._4rR01T"));

            if (productTitles.size() >= index) {
                WebElement nthProduct = productTitles.get(index - 1); // 0-based index
                System.out.println(product + " - " + index + "th product name: " + nthProduct.getText());
            } else {
                System.out.println("Less than " + index + " products found for: " + product);
            }

            System.out.println("------------------------------------");
        }

    }
}

