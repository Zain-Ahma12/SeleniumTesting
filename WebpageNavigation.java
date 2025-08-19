package selenium_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageNavigation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.navigate().back();  // navigate back to facebook.com
		driver.navigate().forward(); // navigate forward to create account page
		driver.navigate().refresh(); // reload the current page
		driver.navigate().to("https://www.google.com/"); // navigate to google.com from current page
	}
}
