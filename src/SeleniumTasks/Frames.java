package SeleniumTasks;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException, IOException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("https://netbanking.hdfcbank.com/netbanking/"); //switching
		 * control to frame driver.switchTo().frame(0); Thread.sleep(5000); WebElement
		 * txtbox = driver.findElement(By.name("fldLoginUserId"));
		 * txtbox.sendKeys("vigneshwaran E"); txtbox.click(); String text =
		 * txtbox.getText(); System.out.println(text);
		 * 
		 * //to switch control from frame to main
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * //to find number of frame in DOM
		 * 
		 * List<WebElement> framenos = driver.findElements(By.tagName("frame"));
		 * System.out.println(framenos);
		 */
        //types of drivers chrome(ChromeBrowser) , ie(ie browser),gekco(FireFoxbrowser)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot  ts = (TakesScreenshot) driver; 
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\Screnshot\\shot.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		//String title = driver.getTitle();
		//System.out.println(title);
		WebElement username = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		//username.sendKeys("vigneshwaran");
		Thread.sleep(3000);
		String attribute = username.getText();
		System.out.println(attribute);
		

/*		TakesScreenshot st = (TakesScreenshot) driver;

		File screenshotAs = st.getScreenshotAs(OutputType.FILE);

		File file = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\Screnshot");
		FileUtils.copyFile(screenshotAs, file);
*/
	}

}
