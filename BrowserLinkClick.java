package selenium_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLinkClick {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		//String title = driver.getTitle();
		

		
		//Url Validation
		if (url.matches("https://www.facebook.com/")) {
			System.out.println("Valid website");
		}else {
			System.out.println("Invalid website");
		}
		
		
		
		driver.findElement(By.linkText("Forgotten password?")).click(); 
		//directly clicking the link without storing it in ElementClass as we dont need to use it again
		
		
		
		
		
	}
}
