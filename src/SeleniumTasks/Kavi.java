package SeleniumTasks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kavi {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*JavascriptExecutor js  = (JavascriptExecutor)driver;
		WebElement Username = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)", Username);
		js.executeScript("arguments[0].setAttribute('value','vignesh')", Username);
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", Username);
		String s =(String) executeScript;
		System.out.println(s);
		WebElement password = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456789')", password);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
*/		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	WebElement txtusername = driver.findElement(By.id("inputValEnter"));
		txtusername.sendKeys("iphone",Keys.ENTER);
		
		WebElement lnkiphone = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		lnkiphone.click();
		
		// to get the parentwindow id
		String parwidow=driver.getWindowHandle();
		System.out.println(parwidow);
		
		Set<String>allwinowid=driver.getWindowHandles();
		System.out.println(allwinowid);
		
		for (String eachwindowid : allwinowid) {
			if (!parwidow.equals(eachwindowid)) {
				driver.switchTo().window(eachwindowid);
			}
		}
		Thread.sleep(3000);
		WebElement lnkadd = driver.findElement(By.xpath("//span[text()='add to cart']"));
		lnkadd.click();
		
			
*/		}
			
		
	}


