package SeleniumDemoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.linkText("Cart"));
		search.click();
		System.out.println("Clicked using LinkText: Downloads");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement search2 = driver.findElement(By.partialLinkText("Become a Se"));
		search2.click();
		System.out.println("Clicked using partialLinkText: Downloads");
		driver.navigate().back();
	}

}
