package org.selenium.training;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionsXpath {
	
	

	public static void main(String[] args)  {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
			
		driver.get("https://www.facebook.com");
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement findElement2 = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		FluentWait<WebDriver> f = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1));
				//.ignoring(Throwable.class);
		f.until(ExpectedConditions.alertIsPresent());
		
		/*WebDriverWait wait = new WebDriverWait(driver,null);
		wait.until(ExpectedConditions.(findElement2));
		findElement2.click();
*/
		WebElement mnth = driver.findElement(By.id("month"));
		driver.findElement(By.name("sex")).click();
		WebElement findElement = driver.findElement(By.id("year"));
		
		Select s = new Select(findElement);
			
		List<WebElement> options = s.getOptions();
		Set<String> set = new TreeSet<String>();

		for (int i = 0; i < options.size(); i++) {
			
			

			String text = options.get(i).getTagName();
			set.add(text);
		}

		for (String x : set) {
			
			System.out.println(x);

		}

	}
}
