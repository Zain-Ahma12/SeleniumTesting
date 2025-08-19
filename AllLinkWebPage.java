package selenium_codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkWebPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link in this page: " + allLinks.size());
		
		
	}
}
