package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class redBus {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.driver.chrome", "C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	
    
	WebElement txtlang =  driver.findElement(By.id("username"));
	txtlang.sendKeys("abc");
	WebElement txtlang2 =  driver.findElement(By.id("password"));
	txtlang2.sendKeys("123456");
	
	
	
}
		
		
	}
	


