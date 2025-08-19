package selenium_codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Opeaning_chrome {
	public static void main(String[] args) {
		// for fireFox browser
		//System.setProperty("webdriver.gecko.dirver", "D:\\verizon\\WebDrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		String url = driver.getCurrentUrl();
		//String title = driver.getTitle();
		
//		System.out.println("Website url: " + url);
//		System.out.println("Website title: " + title);
		
		//Url Validation
		if (url.matches("https://demo.guru99.com/test/newtours/")) {
			System.out.println("Valid website");
		}else {
			System.out.println("Invalid website");
		}
		
		// Title Valaidation
//		if (title.matches("iPhone - Apple (IN)")) {
//			System.out.println("Valid website");
//		}else {
//			System.out.println("Invalid website");
//		}
		
		WebElement unm = driver.findElement(By.name("userName")); //username box
		unm.sendKeys("user"); // interaction sending username
		
		WebElement pwd = driver.findElement(By.name("password")); //pass box
		pwd.sendKeys("test"); // interaction sending password
		
		WebElement logInButton = driver.findElement(By.name("submit")); //log in button
		logInButton.click(); // clicking the button
		
		
	}
}
