package SeleniumDemoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/");

        WebElement loginLink = driver.findElement(By.cssSelector("#login2"));
        Thread.sleep(3000);
        System.out.println("Login link text (using id): " + loginLink.getText());

        WebElement brandName = driver.findElement(By.cssSelector(".navbar-brand"));
        System.out.println("Brand name (using class): " + brandName.getText());
        driver.quit();
    }
}

