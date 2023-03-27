package SeleniumTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("iphone", Keys.ENTER);
		// getting parent window id
		String parwindowid = driver.getWindowHandle();
		System.out.println(parwindowid);
		// getting all windows id
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		// store all id value in list so that we can find using get(index position)
		// concept
		List<String> li = new ArrayList<String>();
		li.addAll(allwindowsid);
		System.out.println(li);
		// switch to the particular window using get(index position)
		String x = li.get(0);
		driver.switchTo().window(x);
		// after above step we can interact with new window elements

	}

}
