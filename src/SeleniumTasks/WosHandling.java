package SeleniumTasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WosHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(" https://www.snapdeal.com/");

		WebElement txtbox = driver.findElement(By.id("inputValEnter"));
		txtbox.sendKeys("iphone", Keys.ENTER);
		Thread.sleep(9000);
		WebElement iponelink = driver.findElement(By.xpath("//*[@class='product-image ']"));
		iponelink.click();

		/*
		 * WebElement cart =
		 * driver.findElement(By.xpath("(//*[@class='intialtext'])[2]")); cart.click();
		 */

		//to get parent window id 
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		//to get both parent and childs id
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		
		for (String eachwindowid :allwindowid) {
			if (!parid.equals(eachwindowid)) {
				driver.switchTo().window(eachwindowid);
				
			}
			
			Thread.sleep(4000);
			WebElement addtocart = driver.findElement(By.xpath("//*[@id='buy-button-id']"));
			addtocart.click();
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
