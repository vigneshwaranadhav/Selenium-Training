package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement txtbox = driver.findElement(By.id("email"));
		
		//using javascript(interface) executeScript method text pass to fb username txtbox
		js.executeScript("arguments[0].setAttribute('value','vigneshwaran')", txtbox);
		// Retrieve the insert value in textbox which user entered earlier
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtbox);
		System.out.println(executeScript);
		// upcasting
		String s = (String) executeScript;
		System.out.println(s);
		// scroll down and scroll up
		WebElement fbdown = driver.findElement(By.xpath("//a[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView(true)", fbdown);
		String text = fbdown.getText();
		System.out.println(text);
		

	}

}