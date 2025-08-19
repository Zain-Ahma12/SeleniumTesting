package selenium_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.className("gLFyf"));//selcting search box
		searchBox.sendKeys("java");// entering java
		searchBox.sendKeys(Keys.ENTER); // clicking enter key to search;
		
	}
}
