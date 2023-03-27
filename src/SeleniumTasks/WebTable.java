package SeleniumTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.guru99.com/test/write-xpath-table.html");
		//to find the number of column 
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int c = column.size();
		System.out.println(c);
		//iterate the value
		for (int i = 0; i < c; i++) {
			System.out.println(i);
			
		}
		}
		
		/*//to find the number of row
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowsize = row.size();
		System.out.println(rowsize);
		//to find all the values
		for (int i = 0; i <rowsize ; i++) {
			System.out.println(i);
			*/
		}
		/*
		//get text value
		WebElement txt = driver.findElement(By.xpath("//*[text()='first cell']"));
		String text = txt.getText();
		System.out.println(text);
		
		//to get tag name
		String tagName = txt.getTagName();
		System.out.println(tagName);
		*/
		
		
		
		
		
	
	
	
	


