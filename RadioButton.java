package selenium_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {
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
		
		
		// opening the signup page 
		driver.findElement(By.linkText("Create new account")).click(); 
		//directly clicking the link without storing it in ElementClass as we dont need to use it again
		
		
		
		// finding the radio button using xpath and clicking it
		driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@id='sex']")).click();
		
	}
}
