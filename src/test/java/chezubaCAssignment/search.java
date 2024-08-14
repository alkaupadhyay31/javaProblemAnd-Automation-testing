package chezubaCAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class search {
	
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        
        // Open the website
        driver.get("https://www.bookswagon.com");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSearchFunctionality() {
        // Locate the search input field and enter the search term
        driver.findElement(By.xpath("//*[@id='inputbar']")).sendKeys("Selenium");

        // Locate the search button and click the button
        driver.findElement(By.xpath("//*[@id='btnTopSearch']")).click();

        // Wait for the results to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate the results area
        WebElement resultsArea = driver.findElement(By.xpath("//div[@class='search-results fltrs']"));

        // Get the actual text from the results area
        String actualText = resultsArea.getText();

        // Print the actual text
        System.out.println("Actual Results Text: " + actualText);

        // Expected text format 
        String expectedText = "selenium";  // Adjust this to match the actual output

        // Verification
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()), 
                "The results area does not contain the expected text.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

	


}
