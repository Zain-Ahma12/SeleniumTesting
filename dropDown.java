package selenium_codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class dropDown {
	public static void main(String[] args) throws InterruptedException {
		
		
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
		
		
		
		driver.findElement(By.linkText("Create new account")).click(); 
		//directly clicking the link without storing it in ElementClass as we dont need to use it again
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day); // predefine select class, use to select value from dropdown
		
		List<WebElement> dropDownValues = s.getOptions(); // store all dropDwon values in a list
		
		for(WebElement ele: dropDownValues) {
			System.out.println(ele.getText());
			ele.click();
			Thread.sleep(2000);
		}
		
		
		
	}
}
