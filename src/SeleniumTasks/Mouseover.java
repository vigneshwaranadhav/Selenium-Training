package SeleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//drag and drop
		/*driver.get("http://demo.guru99.com/test/drag_drop.html \r\n" + "");
		// to find the drag element
		Thread.sleep(5000);
		WebElement src = driver.findElement(By.xpath("//*[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("//*[@class='placeholder']"));		
			Actions actions = new Actions(driver);
	   //mouse over method calling
			actions.dragAndDrop(src,des ).perform();
			*/
		//mouseover
		/*Thread.sleep(5000);
		driver.get("http://www.greenstechnologys.com/");
		WebElement findElement = driver.findElement(By.xpath("//*[text()='COURSES']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(findElement).perform();
		Robot robot = new Robot();
		for (int i = 0; i <3; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		    robot.keyPress(KeyEvent.VK_ENTER);*/
		    //double click
		/*Home & Furniture is first mouseover 
	      Click Bath Towels and print any product name 
		*/   
		Thread.sleep(5000);
			driver.get("https://www.snapdeal.com/\r\n" + 
					"");
			WebElement findElement = driver.findElement(By.xpath("//*[text()='Mobile & Accessories']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(findElement).perform();
			Robot robot = new Robot();
			for (int i = 0; i <3; i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
			    robot.keyPress(KeyEvent.VK_ENTER);
		    
		    
			
			
			
		}
		
		
		
		
	}	
	}


