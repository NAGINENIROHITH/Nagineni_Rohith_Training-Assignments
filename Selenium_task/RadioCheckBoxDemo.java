package SeleniumDemoo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioCheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        System.out.println("Radio Button 2 selected");
        Thread.sleep(2000);
        
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println("Checkbox Option1 selected");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("checkBoxOption3")).click();
        System.out.println("Checkbox Option3 selected");

        Thread.sleep(2000);
	}

}
