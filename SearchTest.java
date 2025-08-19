package testNGlearning;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;



import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.util.*;

public class SearchTest {
    WebDriver driver;
    
    @DataProvider(name = "terms")
    public Iterator<Object[]> csvDataProvider() {
        List<Object[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
            new FileReader("D:\\verizon\\search_terms.csv"))) 
        {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                data.add(new Object[]{line.trim()});
            }
        } catch (Exception e) {
            throw new RuntimeException("CSV read error", e);
        }
        return data.iterator();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(" https://duckduckgo.com/"); // Replace with your search page
    }

    @Test(dataProvider = "terms")
    public void testSearch(String searchTerm) {
        // Perform search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys(searchTerm + Keys.RETURN);

        // Verify results page
        String expectedTitle = searchTerm + " - Search Results";
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.titleContains(searchTerm));

        // Verify search results exist
        List<WebElement> results = driver.findElements(By.cssSelector(".search-result"));
        Assert.assertTrue(results.size() > 0, 
            "No results found for: " + searchTerm);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}