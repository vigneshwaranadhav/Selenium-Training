package SeleniumTasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screnshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://www.facebook.com/");
		driver.get(" https://www.Google.com/");

		// type casting
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File SourceFile =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\Screenshot");
		 * FileHandler.copy(SourceFile, dest);
		 */

		/*
		 * TakesScreenshot ts1 =(TakesScreenshot) driver; File screenshotAs1 =
		 * ts1.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\Screnshot.png");
		 * FileUtils.copyFile(screenshotAs1,dest );
		 */

		// type casting
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		/*File destfile = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\Screnshot.png");
		FileUtils.copyFile(screenshotAs, destfile);
*/
	}

}
