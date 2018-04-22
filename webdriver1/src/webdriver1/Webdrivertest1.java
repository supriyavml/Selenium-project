package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivertest1  {
    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Download\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    	FirefoxDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        
        // Find the text input element by its name
        WebElement drvr1 = driver.findElement(By.name("q"));

        // Enter something to search for
        drvr1.sendKeys("Selenium");

        // Now submit the form. WebDriver will find the form for us from the element
        drvr1.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
